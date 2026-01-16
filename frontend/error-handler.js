// ==========================================
// ERROR HANDLER - PONTUAU
// ==========================================
// Módulo para tratamento de erros da API
// Fornece mensagens amigáveis e feedback visual
// ==========================================

/**
 * Mapeamento de campos técnicos para nomes amigáveis em português
 */
const FIELD_LABELS = {
    'icao_empresa': 'Companhia Aérea',
    'icao_aerodromo_origem': 'Aeroporto de Origem',
    'icao_aerodromo_destino': 'Aeroporto de Destino',
    'partida_prevista': 'Data e Hora de Partida',
    'tempo_voo_estimado_hr': 'Tempo de Voo Estimado',
    'distancia_km': 'Distância',
    'not_found': 'Recurso',
    'internal_error': 'Sistema',
    'invalid_json': 'Dados'
};

/**
 * Tipos de alerta
 */
const ALERT_TYPES = {
    ERROR: 'error',
    WARNING: 'warning',
    INFO: 'info',
    SUCCESS: 'success'
};

/**
 * Processa erro da API e retorna objeto estruturado
 * 
 * @param {Response} response - Resposta HTTP da API
 * @param {Object} errorData - Dados do erro retornados pela API
 * @returns {Object} Objeto com informações do erro processadas
 */
function processApiError(response, errorData) {
    const status = response.status;

    // Erro de validação único
    if (errorData.field && errorData.message) {
        return {
            type: ALERT_TYPES.ERROR,
            title: 'Erro de Validação',
            errors: [{
                field: errorData.field,
                fieldLabel: FIELD_LABELS[errorData.field] || errorData.field,
                message: errorData.message
            }]
        };
    }

    // Erro de validação múltipla (array)
    if (Array.isArray(errorData)) {
        return {
            type: ALERT_TYPES.ERROR,
            title: 'Erros de Validação',
            errors: errorData.map(err => ({
                field: err.field,
                fieldLabel: FIELD_LABELS[err.field] || err.field,
                message: err.message
            }))
        };
    }

    // Erro genérico baseado no status HTTP
    const genericErrors = {
        400: {
            type: ALERT_TYPES.ERROR,
            title: 'Dados Inválidos',
            errors: [{
                field: 'generic',
                fieldLabel: 'Formulário',
                message: 'Por favor, verifique os dados informados e tente novamente.'
            }]
        },
        404: {
            type: ALERT_TYPES.ERROR,
            title: 'Não Encontrado',
            errors: [{
                field: 'generic',
                fieldLabel: 'Recurso',
                message: 'O recurso solicitado não foi encontrado.'
            }]
        },
        500: {
            type: ALERT_TYPES.ERROR,
            title: 'Erro no Servidor',
            errors: [{
                field: 'generic',
                fieldLabel: 'Sistema',
                message: 'Ocorreu um erro inesperado. Por favor, tente novamente mais tarde.'
            }]
        }
    };

    return genericErrors[status] || {
        type: ALERT_TYPES.ERROR,
        title: 'Erro',
        errors: [{
            field: 'generic',
            fieldLabel: 'Sistema',
            message: 'Ocorreu um erro. Por favor, tente novamente.'
        }]
    };
}

/**
 * Cria e exibe um alerta visual na página
 * 
 * @param {Object} errorInfo - Informações do erro processadas
 * @param {HTMLElement} container - Container onde o alerta será inserido
 */
function showErrorAlert(errorInfo, container) {
    // Remove alertas anteriores
    const existingAlerts = container.querySelectorAll('.error-alert');
    existingAlerts.forEach(alert => alert.remove());

    // Cria elemento de alerta
    const alert = document.createElement('div');
    alert.className = `error-alert error-alert-${errorInfo.type}`;

    // Ícone baseado no tipo
    const icons = {
        error: 'fa-exclamation-circle',
        warning: 'fa-exclamation-triangle',
        info: 'fa-info-circle',
        success: 'fa-check-circle'
    };

    const icon = icons[errorInfo.type] || icons.error;

    // Monta HTML do alerta
    let alertHTML = `
        <div class="error-alert-header">
            <i class="fas ${icon}"></i>
            <strong>${errorInfo.title}</strong>
            <button class="error-alert-close" onclick="this.parentElement.parentElement.remove()">
                <i class="fas fa-times"></i>
            </button>
        </div>
        <div class="error-alert-body">
    `;

    // Adiciona cada erro
    errorInfo.errors.forEach(error => {
        if (error.field === 'generic') {
            alertHTML += `<p>${error.message}</p>`;
        } else {
            alertHTML += `<p><strong>${error.fieldLabel}:</strong> ${error.message}</p>`;
        }
    });

    alertHTML += `</div>`;
    alert.innerHTML = alertHTML;

    // Insere no container
    container.insertBefore(alert, container.firstChild);

    // Scroll suave até o alerta
    alert.scrollIntoView({ behavior: 'smooth', block: 'nearest' });

    // Auto-remove após 10 segundos (apenas para sucesso e info)
    if (errorInfo.type === ALERT_TYPES.SUCCESS || errorInfo.type === ALERT_TYPES.INFO) {
        setTimeout(() => {
            alert.style.opacity = '0';
            setTimeout(() => alert.remove(), 300);
        }, 10000);
    }
}

/**
 * Destaca campos com erro no formulário
 * 
 * @param {Object} errorInfo - Informações do erro processadas
 * @param {HTMLFormElement} form - Formulário a ser validado
 */
function highlightErrorFields(errorInfo, form) {
    // Remove destaques anteriores
    const errorFields = form.querySelectorAll('.field-error');
    errorFields.forEach(field => field.classList.remove('field-error'));

    // Adiciona destaque nos campos com erro
    errorInfo.errors.forEach(error => {
        if (error.field !== 'generic') {
            // Tenta encontrar o campo pelo name ou id
            const field = form.querySelector(`[name="${error.field}"], #${error.field}`);
            if (field) {
                field.classList.add('field-error');

                // Remove destaque ao interagir com o campo
                field.addEventListener('input', function removeError() {
                    field.classList.remove('field-error');
                    field.removeEventListener('input', removeError);
                }, { once: true });
            }
        }
    });
}

/**
 * Função principal para tratar erros da API
 * 
 * @param {Response} response - Resposta HTTP da API
 * @param {Object} errorData - Dados do erro retornados pela API
 * @param {HTMLElement} alertContainer - Container para exibir alertas
 * @param {HTMLFormElement} form - Formulário (opcional, para destacar campos)
 */
async function handleApiError(response, errorData, alertContainer, form = null) {
    console.error('❌ Erro da API:', errorData);

    // Processa o erro
    const errorInfo = processApiError(response, errorData);

    // Exibe alerta
    showErrorAlert(errorInfo, alertContainer);

    // Destaca campos com erro (se formulário fornecido)
    if (form) {
        highlightErrorFields(errorInfo, form);
    }

    // Log para debugging
    console.log('📋 Erro processado:', errorInfo);
}

/**
 * Exibe mensagem de sucesso
 * 
 * @param {string} message - Mensagem de sucesso
 * @param {HTMLElement} container - Container onde o alerta será inserido
 */
function showSuccessMessage(message, container) {
    showErrorAlert({
        type: ALERT_TYPES.SUCCESS,
        title: 'Sucesso',
        errors: [{ field: 'generic', message }]
    }, container);
}

/**
 * Exibe mensagem de aviso
 * 
 * @param {string} message - Mensagem de aviso
 * @param {HTMLElement} container - Container onde o alerta será inserido
 */
function showWarningMessage(message, container) {
    showErrorAlert({
        type: ALERT_TYPES.WARNING,
        title: 'Atenção',
        errors: [{ field: 'generic', message }]
    }, container);
}

/**
 * Exibe mensagem informativa
 * 
 * @param {string} message - Mensagem informativa
 * @param {HTMLElement} container - Container onde o alerta será inserido
 */
function showInfoMessage(message, container) {
    showErrorAlert({
        type: ALERT_TYPES.INFO,
        title: 'Informação',
        errors: [{ field: 'generic', message }]
    }, container);
}

console.log('✅ Error Handler carregado com sucesso');
