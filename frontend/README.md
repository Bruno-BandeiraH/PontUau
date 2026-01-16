# 🛫 PontUau - Previsão Inteligente de Atraso de Voos

![MVP Hackathon](https://img.shields.io/badge/MVP-Hackathon%20Alura%20%2B%20No%20Country-blueviolet)
![Machine Learning](https://img.shields.io/badge/Machine%20Learning-Python-blue)
![Backend](https://img.shields.io/badge/Backend-Java%20Spring-green)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

## 📋 Sobre o Projeto

**PontUau** é uma solução completa de previsão de atrasos de voos baseada em Machine Learning, desenvolvida pela equipe **Araras Selvagens** durante o Hackathon promovido pela **Alura** em parceria com a **No Country**.

O projeto utiliza modelos de classificação binária treinados com dados históricos reais de voos nacionais para determinar se um voo será **Pontual** ou **Atrasado**, fornecendo também a probabilidade estimada da previsão.

## 🌐 Demonstração

Acesse a landing page do projeto:

```
file:///C:/Users/wellingtonsilva/.gemini/antigravity/scratch/pontuau-landing/index.html
```

Ou abra o arquivo `index.html` diretamente no seu navegador.

## ✨ Funcionalidades

- 🤖 **Modelo de Classificação**: Sistema de classificação binária (Pontual/Atrasado)
- 📊 **Probabilidade Associada**: Retorna a probabilidade estimada da previsão
- 📈 **Dados Históricos**: Treinamento baseado em dados reais de voos nacionais
- 🔌 **API REST**: Arquitetura preparada para integração com Spring Boot
- 🎨 **Interface Moderna**: Landing page responsiva com design premium
- 🧪 **Simulação Interativa**: Demonstração do funcionamento do modelo

## 🛠️ Tecnologias Utilizadas

### Data Science
- Python
- Pandas
- scikit-learn
- Jupyter Notebook
- Modelagem supervisionada

### Back-end
- Java
- Spring Boot
- APIs REST
- Persistência de dados

### Front-end (Landing Page)
- HTML5
- CSS3 (Vanilla CSS)
- JavaScript
- Google Fonts (Inter, Poppins)
- Font Awesome

## 📁 Estrutura do Projeto

```
pontuau-landing/
├── index.html          # Página principal
├── styles.css          # Estilos da landing page
├── Imagens/            # Assets e imagens
└── README.md           # Este arquivo
```

## 🔌 Integração com API de Machine Learning

A calculadora de previsão está integrada com a API real de Machine Learning desenvolvida pela equipe.

### 📡 Repositório da API

```
https://github.com/Bruno-BandeiraH/flight-prediction-model
```

### 🔄 Fluxo de Dados Completo

Entenda como funciona o processo desde o preenchimento do formulário até a exibição do resultado:

```
┌─────────────────┐
│   USUÁRIO       │
│  Preenche form  │
│  (Azul, GRU→GIG)│
└────────┬────────┘
         │
         ▼
┌─────────────────────────────────────┐
│  FRONT-END (calculator.js)          │
│  1. Coleta dados do formulário      │
│  2. Converte IATA → ICAO            │
│     • Azul (AD) → AZU               │
│     • GRU → SBGR, GIG → SBGL        │
│  3. Calcula tempo de voo            │
│  4. Formata data/hora               │
└────────┬────────────────────────────┘
         │
         │ POST /predict
         │ {
         │   "icao_empresa": "AZU",
         │   "icao_aerodromo_origem": "SBGR",
         │   "icao_aerodromo_destino": "SBGL",
         │   "partida_prevista": "12-11-2025T22:30:00",
         │   "tempo_voo_estimado_hr": 0.44,
         │   "distancia_km": 350.0
         │ }
         ▼
┌─────────────────────────────────────┐
│  API (FastAPI/Python)               │
│  1. Recebe requisição               │
│  2. Carrega modelo ML treinado      │
│  3. Processa dados                  │
│  4. Faz previsão                    │
└────────┬────────────────────────────┘
         │
         │ {
         │   "previsao_atraso": 0,
         │   "probabilidade_atraso": 0.29
         │ }
         ▼
┌─────────────────────────────────────┐
│  FRONT-END (result.js)              │
│  1. Recebe resposta                 │
│  2. Converte para texto             │
│     • 0 → "Pontual"                 │
│     • 0.29 → "29% de chance"        │
│  3. Exibe resultado                 │
└────────┬────────────────────────────┘
         │
         ▼
┌─────────────────┐
│   USUÁRIO       │
│  Vê resultado:  │
│  "Pontual"      │
│  "29% atraso"   │
└─────────────────┘
```

**Importante:** 
- O modelo de ML já foi **treinado previamente** com dados históricos
- O modelo treinado está **salvo em arquivo** no repositório da API
- A API **carrega o modelo** quando inicia (não busca dados do GitHub em tempo real)
- Cada previsão usa o **conhecimento já aprendido** pelo modelo

### ⚙️ Como Funciona

#### Modo Automático (Recomendado)

A calculadora detecta automaticamente o ambiente e se adapta:

- **Desenvolvimento Local**: Tenta conectar em `http://localhost:8000`
- **API Indisponível**: Usa dados simulados automaticamente (modo demonstração)
- **Produção**: Usa URL configurada (quando API estiver deployada)

#### Mapeamentos Automáticos

A API usa códigos **ICAO** (aviação civil), mas o formulário usa códigos **IATA** (comerciais). A conversão é automática:

**Companhias Aéreas:**
- `G3` (Gol) → `GLO`
- `AD` (Azul) → `AZU`
- `LA` (LATAM) → `TAM`
- `TP` (TAP) → `TAP`

**Aeroportos:**
- `GRU` (Guarulhos) → `SBGR`
- `GIG` (Galeão) → `SBGL`
- `BSB` (Brasília) → `SBBR`
- `CGH` (Congonhas) → `SBSP`
- `SDU` (Santos Dumont) → `SBRJ`
- E outros...

#### Cálculos Automáticos

- **Tempo de Voo**: Calculado automaticamente baseado na distância (velocidade média: 800 km/h)
- **Formato de Data**: Convertido automaticamente para o formato da API

### 🚀 Rodando a API Localmente

Para testar com a API real em desenvolvimento:

```bash
# 1. Clone o repositório da API
git clone https://github.com/Bruno-BandeiraH/flight-prediction-model.git
cd flight-prediction-model

# 2. Rode com Docker (recomendado)
docker build -t flight-prediction-model .
docker run -p 8000:8000 flight-prediction-model

# 3. API disponível em: http://localhost:8000
# Swagger docs: http://localhost:8000/docs
```

### 🌐 Configurando URL de Produção

Quando a API for deployada, atualize a URL em `calculator.js`:

```javascript
// Linha 24 do calculator.js
const API_CONFIG = {
    development: 'http://localhost:8000',
    production: 'https://SUA-URL-AQUI.com'  // ← Altere aqui
};
```

### 📋 Formato da Requisição

**Endpoint:** `POST /predict`

```json
{
  "icao_empresa": "AZU",
  "icao_aerodromo_origem": "SBRF",
  "icao_aerodromo_destino": "SBRJ",
  "partida_prevista": "12-11-2025T22:30:00",
  "tempo_voo_estimado_hr": 1.2,
  "distancia_km": 50.0
}
```

### 📋 Formato da Resposta

```json
{
  "previsao_atraso": 0,
  "probabilidade_atraso": 0.29
}
```

- `previsao_atraso`: `0` = Pontual, `1` = Atrasado
- `probabilidade_atraso`: Valor entre 0.0 e 1.0

### 🔍 Troubleshooting

**Problema:** "Modo de Demonstração" aparece na página de resultado

**Solução:** A API não está rodando. Verifique:
1. Docker está rodando?
2. Container da API está ativo? (`docker ps`)
3. API está respondendo em `http://localhost:8000/docs`?

**Problema:** Erro de CORS

**Solução:** A API já tem CORS configurado. Se o erro persistir, verifique se está acessando via `http://` e não `file://`

**Problema:** Erro 404 - Endpoint não encontrado

**Solução:** Verifique se a API está na versão correta e o endpoint é `/predict`

### 📝 Logs do Console

Abra o Console do navegador (F12) para ver logs detalhados:
- 🚀 Ambiente detectado
- 📡 URL da API
- 📤 Dados enviados
- 📥 Resposta recebida
- ⚠️ Avisos e erros

## 🚀 Como Executar

### Landing Page

1. Clone ou baixe o repositório
2. Navegue até a pasta do projeto
3. Abra o arquivo `index.html` no seu navegador preferido

```bash
# Ou use um servidor local
python -m http.server 8000
# Acesse: http://localhost:8000
```

### Projeto Completo

Para executar o projeto completo com back-end e modelo de ML, consulte os repositórios específicos da equipe.

## 👥 Equipe Araras Selvagens

### Data Science

| Nome | Função | GitHub | LinkedIn |
|------|--------|--------|----------|
| **Gabriel Schineider** | Data Scientist | [@gabriel-schineider](https://github.com/gabriel-schineider/) | [LinkedIn](https://www.linkedin.com/in/gabriel-schineider/) |
| **Gleice Araújo** | Data Scientist | [@GleiceAraujo22](https://github.com/GleiceAraujo22) | [LinkedIn](https://www.linkedin.com/in/gleicearaujo/) |
| **Wellington Gabriel** | Data Scientist | [@WellingtonGabriel20](https://github.com/WellingtonGabriel20) | [LinkedIn](https://www.linkedin.com/in/wellingtongabriel20) |
| **Cristiano Silveira** | Data Scientist | [@realcsilveira](https://github.com/realcsilveira) | [LinkedIn](https://www.linkedin.com/in/realcsilveira) |
| **Arley Ribeiro** | Data Scientist | [@ribeiroarley](https://github.com/ribeiroarley) | [LinkedIn](https://www.linkedin.com/in/ribeiroarley) |

### Back-end Development

| Nome | Função | GitHub | LinkedIn |
|------|--------|--------|----------|
| **Bruno Henrique** | Back-end Developer | [@Bruno-bandeirah](https://github.com/Bruno-bandeirah) | [LinkedIn](https://www.linkedin.com/in/bruno-bandeira-dev/) |
| **Rafael Vieira** | Back-end Developer | [@Rafael-LynX](https://github.com/Rafael-LynX) | [LinkedIn](https://www.linkedin.com/in/rafaelvieira-cyber/) |
| **Richard Silva** | Back-end Developer | [@RichardFFreitas](https://github.com/RichardFFreitas) | [LinkedIn](https://www.linkedin.com/in/richard-freitas-dev/) |
| **Juciano Gomes** | Back-end Developer | [@Jucianogp](https://github.com/Jucianogp) | [LinkedIn](https://www.linkedin.com/in/juciano-gomes-921830282) |
| **Matheus Vinícius** | Back-end Developer | - | - |

## 🎯 Objetivos do Projeto

1. **Educacional**: Aplicar conceitos avançados de Data Science e Engenharia de Software
2. **Prático**: Desenvolver uma solução real para um problema do setor aéreo
3. **Colaborativo**: Trabalhar em equipe multidisciplinar (Data Science + Back-end)
4. **Profissional**: Seguir boas práticas de desenvolvimento e documentação

## 🔮 Próximos Passos

- [ ] Integração completa do modelo ML com a API REST
- [ ] Deploy da aplicação em ambiente de produção
- [ ] Implementação de mais features de análise preditiva
- [ ] Dashboard administrativo para visualização de métricas
- [ ] Testes automatizados (unitários e integração)
- [ ] Documentação técnica completa da API

## 📊 Insights do Modelo

O modelo considera diversos fatores para realizar a previsão:

- ✅ Análise baseada em dados históricos
- ✅ Padrões de tráfego aéreo identificados
- ✅ Fatores sazonais considerados
- ✅ Rotas e horários de maior incidência

## 🤝 Contribuindo

Este é um projeto educacional desenvolvido durante um hackathon. Sugestões e feedbacks são bem-vindos!

## 📄 Licença

© 2026 PontUau - Equipe Araras Selvagens. Todos os direitos reservados.

Projeto desenvolvido durante o Hackathon Alura + No Country.

## 🏆 Agradecimentos

- **Alura**: Pela organização do hackathon e suporte educacional
- **No Country**: Pela parceria e oportunidade de aprendizado
- **Equipe Araras Selvagens**: Pela dedicação e trabalho em equipe

---

<div align="center">

**Desenvolvido com 💜 pela Equipe Araras Selvagens**

[🏠 Início](#-pontuau---previsão-inteligente-de-atraso-de-voos) • [📋 Sobre](#-sobre-o-projeto) • [👥 Equipe](#-equipe-araras-selvagens)

</div>
