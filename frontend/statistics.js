// Statistics Page - Data Visualization
// Load and display insights from the ML model analysis

// Embedded insights data (from ML model analysis - 3,240 simulations)
const INSIGHTS_DATA = {
    "aeroportos_pontuais": {
        "probabilidade_atraso": {
            "SBBR": 0.3625253736972809,
            "SBGL": 0.4227183163166046,
            "SBSV": 0.43939539790153503,
            "SBRF": 0.44157493114471436,
            "SBCT": 0.44524407386779785
        },
        "origem_nome": {
            "SBBR": "Brasília (BSB)",
            "SBGL": "Galeão (GIG)",
            "SBSV": "Salvador (SSA)",
            "SBRF": "Recife (REC)",
            "SBCT": "Curitiba (CWB)"
        }
    },
    "melhores_horarios": {
        "probabilidade_atraso": {
            "6": 0.38529378175735474,
            "10": 0.3860282897949219,
            "8": 0.388942688703537,
            "22": 0.46171557903289795,
            "20": 0.4619753956794739
        }
    },
    "melhores_turnos": {
        "probabilidade_atraso": {
            "manha": 0.38675493001937866,
            "noite": 0.4619124233722687,
            "tarde": 0.48020681738853455
        }
    },
    "companhias_pontuais": {
        "probabilidade_atraso": {
            "TAM": 0.42476552724838257,
            "ONE": 0.42580002546310425,
            "GLO": 0.45392173528671265,
            "AZU": 0.4673449397087097
        }
    },
    "total_simulacoes": 3240
};


// Airline name mapping
const airlineNames = {
    'TAM': 'LATAM',
    'ONE': 'Avianca',
    'GLO': 'GOL',
    'AZU': 'Azul'
};

// Airline logos
const airlineLogos = {
    'TAM': 'Imagens/latam_logo.png',
    'ONE': 'Imagens/avianca_logo.png',
    'GLO': 'Imagens/gol_logo.png',
    'AZU': 'Imagens/azul_logo.png'
};

// Airline slogans
const airlineSlogans = {
    'TAM': 'Cuidar de você. Esse é o nosso compromisso.',
    'ONE': 'Avianca. Para todos nós.',
    'GLO': 'Paixão por voar',
    'AZU': 'A vida é azul'
};

// Airport ICAO// Mapeamento de nomes de aeroportos
const airportNames = {
    'SBGR': 'Guarulhos',
    'SBSP': 'Congonhas',
    'SBBR': 'Brasília',
    'SBGL': 'Galeão',
    'SBRJ': 'Santos Dumont',
    'SBCF': 'Confins',
    'SBPA': 'Porto Alegre',
    'SBRF': 'Recife',
    'SBSV': 'Salvador',
    'SBCT': 'Curitiba',
    'SBFL': 'Florianópolis',
    'SBBE': 'Belém',
    'SBFZ': 'Fortaleza',
    'SBKP': 'Campinas',
    'SBMQ': 'Macapá',
    'SBMO': 'Maceió',
    'SBNF': 'Navegantes',
    'SBNT': 'Natal',
    'SBVT': 'Vitória',
    'SBEG': 'Manaus'
};

// Period name mapping
const periodNames = {
    'manha': 'Manhã',
    'tarde': 'Tarde',
    'noite': 'Noite',
    'madrugada': 'Madrugada'
};

// Period icons
const periodIcons = {
    'manha': '🌅',
    'tarde': '☀️',
    'noite': '🌙',
    'madrugada': '🌃'
};

// Load insights data
function loadInsights() {
    try {
        // Use embedded data (fixes CORS issue with file:// protocol)
        const data = INSIGHTS_DATA;

        renderAirportRankings(data.aeroportos_pontuais);
        renderBestTimes(data.melhores_horarios);
        renderPeriodAnalysis(data.melhores_turnos);
        renderAirlinePerformance(data.companhias_pontuais);

    } catch (error) {
        console.error('Erro ao carregar insights:', error);
        showErrorMessage();
    }
}

// Render Airport Rankings
function renderAirportRankings(data) {
    const container = document.getElementById('airport-rankings');
    const probabilities = data.probabilidade_atraso;
    const names = data.origem_nome;

    const airports = Object.keys(probabilities).map(code => ({
        code,
        name: names[code],
        probability: probabilities[code]
    }));

    airports.forEach((airport, index) => {
        const card = createAirportCard(airport, index + 1);
        container.appendChild(card);
    });
}

// Create Airport Card
function createAirportCard(airport, rank) {
    const card = document.createElement('div');
    card.className = 'stat-card';

    const rankBadgeClass = rank === 1 ? 'gold' : rank === 2 ? 'silver' : rank === 3 ? 'bronze' : '';
    const delayPercentage = (airport.probability * 100).toFixed(1);
    const punctualityPercentage = (100 - delayPercentage).toFixed(1);

    const delayClass = airport.probability < 0.4 ? 'low-delay' :
        airport.probability < 0.5 ? 'medium-delay' : 'high-delay';

    card.innerHTML = `
        <div class="rank-badge ${rankBadgeClass}">${rank}º</div>
        <div class="stat-icon">
            <i class="fas fa-plane-departure"></i>
        </div>
        <div class="stat-label">Aeroporto</div>
        <div class="stat-name">${airport.name.split('(')[0].trim()}</div>
        <div class="stat-code">${airport.name.match(/\(([^)]+)\)/)?.[1] || ''}</div>
        <div class="stat-progress">
            <div class="progress-label">
                <span class="progress-text">Pontualidade</span>
                <span class="progress-value">${punctualityPercentage}%</span>
            </div>
            <div class="progress-bar-container">
                <div class="progress-bar-fill ${delayClass}" style="width: 0%" data-width="${punctualityPercentage}%"></div>
            </div>
        </div>
    `;

    return card;
}

// Render Best Flight Times
function renderBestTimes(data) {
    const container = document.getElementById('best-times');
    const probabilities = data.probabilidade_atraso;

    const times = Object.keys(probabilities).map(hour => ({
        hour: parseInt(hour),
        probability: probabilities[hour]
    }));

    times.forEach((time, index) => {
        const card = createTimeCard(time, index + 1);
        container.appendChild(card);
    });
}

// Create Time Card
function createTimeCard(time, rank) {
    const card = document.createElement('div');
    card.className = 'stat-card';

    const delayPercentage = (time.probability * 100).toFixed(1);
    const punctualityPercentage = (100 - delayPercentage).toFixed(1);

    const delayClass = time.probability < 0.4 ? 'low-delay' :
        time.probability < 0.5 ? 'medium-delay' : 'high-delay';

    const timeFormatted = `${time.hour}:00`;

    card.innerHTML = `
        <div class="stat-icon">
            <i class="fas fa-clock"></i>
        </div>
        <div class="stat-label">Horário de Partida</div>
        <div class="stat-name">${timeFormatted}</div>
        <div class="stat-code">${rank}º melhor horário</div>
        <div class="stat-progress">
            <div class="progress-label">
                <span class="progress-text">Pontualidade</span>
                <span class="progress-value">${punctualityPercentage}%</span>
            </div>
            <div class="progress-bar-container">
                <div class="progress-bar-fill ${delayClass}" style="width: 0%" data-width="${punctualityPercentage}%"></div>
            </div>
        </div>
    `;

    return card;
}

// Render Period Analysis
function renderPeriodAnalysis(data) {
    const container = document.getElementById('period-analysis');
    const probabilities = data.probabilidade_atraso;

    const periods = Object.keys(probabilities).map(period => ({
        period,
        name: periodNames[period] || period,
        icon: periodIcons[period] || '⏰',
        probability: probabilities[period]
    }));

    // Sort by best punctuality
    periods.sort((a, b) => a.probability - b.probability);

    periods.forEach(period => {
        const card = createPeriodCard(period);
        container.appendChild(card);
    });
}

// Create Period Card
function createPeriodCard(period) {
    const card = document.createElement('div');
    card.className = 'period-card';

    const delayPercentage = (period.probability * 100).toFixed(1);
    const punctualityPercentage = (100 - delayPercentage).toFixed(1);

    card.innerHTML = `
        <div class="period-icon">${period.icon}</div>
        <div class="period-name">${period.name}</div>
        <div class="period-percentage">${punctualityPercentage}%</div>
        <div class="period-description">de pontualidade</div>
    `;

    return card;
}

// Render Airline Performance
function renderAirlinePerformance(data) {
    const container = document.getElementById('airline-performance');
    const probabilities = data.probabilidade_atraso;

    const airlines = Object.keys(probabilities).map(code => ({
        code,
        name: airlineNames[code] || code,
        probability: probabilities[code]
    }));

    airlines.forEach(airline => {
        const card = createAirlineCard(airline);
        container.appendChild(card);
    });
}

// Create Airline Card
function createAirlineCard(airline) {
    const card = document.createElement('div');
    card.className = 'airline-card';

    const delayPercentage = (airline.probability * 100).toFixed(1);
    const punctualityPercentage = (100 - delayPercentage).toFixed(1);

    const delayClass = airline.probability < 0.4 ? 'low-delay' :
        airline.probability < 0.5 ? 'medium-delay' : 'high-delay';

    const logoSrc = airlineLogos[airline.code] || '';
    const slogan = airlineSlogans[airline.code] || '';

    card.innerHTML = `
        <div class="airline-logo-img">
            <img src="${logoSrc}" alt="${airline.name}" />
        </div>
        <div class="airline-name">${airline.name}</div>
        <div class="airline-slogan">${slogan}</div>
        <div class="stat-progress">
            <div class="progress-label">
                <span class="progress-text">Pontualidade</span>
                <span class="progress-value">${punctualityPercentage}%</span>
            </div>
            <div class="progress-bar-container">
                <div class="progress-bar-fill ${delayClass}" style="width: 0%" data-width="${punctualityPercentage}%"></div>
            </div>
        </div>
    `;

    return card;
}

// Animate progress bars
function animateProgressBars() {
    const progressBars = document.querySelectorAll('.progress-bar-fill');

    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                const bar = entry.target;
                const targetWidth = bar.getAttribute('data-width');
                setTimeout(() => {
                    bar.style.width = targetWidth;
                }, 100);
                observer.unobserve(bar);
            }
        });
    }, { threshold: 0.5 });

    progressBars.forEach(bar => observer.observe(bar));
}

// Show error message
function showErrorMessage() {
    const sections = ['airport-rankings', 'best-times', 'period-analysis', 'airline-performance'];

    sections.forEach(sectionId => {
        const container = document.getElementById(sectionId);
        container.innerHTML = `
            <div style="text-align: center; padding: 3rem; color: var(--text-secondary);">
                <i class="fas fa-exclamation-triangle" style="font-size: 3rem; margin-bottom: 1rem; color: var(--warning-red);"></i>
                <p>Erro ao carregar os dados. Por favor, tente novamente mais tarde.</p>
            </div>
        `;
    });
}

// Initialize on page load
document.addEventListener('DOMContentLoaded', () => {
    loadInsights();
    animateProgressBars();
    initializeTabs();
});

// Tab Switching Functionality
function initializeTabs() {
    const tabButtons = document.querySelectorAll('.tab-button');
    const tabContents = document.querySelectorAll('.tab-content');

    tabButtons.forEach(button => {
        button.addEventListener('click', () => {
            const targetTab = button.getAttribute('data-tab');

            // Remove active class from all buttons and contents
            tabButtons.forEach(btn => btn.classList.remove('active'));
            tabContents.forEach(content => content.classList.remove('active'));

            // Add active class to clicked button and corresponding content
            button.classList.add('active');
            document.getElementById(`${targetTab}-tab`).classList.add('active');

            // Re-animate progress bars in the newly visible tab
            setTimeout(() => {
                animateProgressBars();
            }, 100);
        });
    });
}
