# InsightFlow AI
### Planejamento de Produto Digital com IA, MVP e Roadmap
**Disciplina:** Fundamentos de Gestão de Projetos — UniFECAF  
**Autor:** Diego Colombari Rapichan  
**Data:** Junho de 2026

---

## O que é este projeto?

Planejamento estratégico completo de um produto digital baseado em IA Generativa — o **InsightFlow AI** — desenvolvido como trabalho final da disciplina de Fundamentos de Gestão de Projetos.

O InsightFlow AI é uma plataforma SaaS que processa automaticamente grandes volumes de dados de atendimento ao cliente (tickets, chats, e-mails) e entrega insights priorizados e planos de ação via IA, sem necessidade de analistas de dados.

> **Nota:** este projeto é um planejamento estratégico, não um produto em código.

---

## Estrutura dos Entregáveis

```
InsightFlow_AI/
├── README.md                           ← este arquivo
├── InsightFlow_AI_Parte_Teorica.docx   ← Parte 1: documento teórico (1,5 pts)
├── InsightFlow_AI_Script_Pitch.md      ← Parte 3: script do vídeo pitch (2,0 pts)
│
├── 01_lean_canvas.html                 ← Artefato visual: Lean Canvas
├── 02_documento_mvp.html               ← Artefato visual: Documento de MVP
├── 03_roadmap.html                     ← Artefato visual: Roadmap Visual
└── 04_matriz_riscos.html               ← Artefato visual: Matriz de Riscos
```

---

## Links dos Artefatos (GitHub Pages)

| Artefato | Link |
|----------|------|
| Lean Canvas | *(inserir link após publicar no GitHub Pages)* |
| Documento de MVP | *(inserir link após publicar no GitHub Pages)* |
| Roadmap Visual | *(inserir link após publicar no GitHub Pages)* |
| Matriz de Riscos | *(inserir link após publicar no GitHub Pages)* |
| Vídeo Pitch | *(inserir link do YouTube não listado após gravação)* |

### Como publicar no GitHub Pages (2 minutos)

1. Crie um repositório público no GitHub (ex: `insightflow-ai`)
2. Faça upload dos 4 arquivos `.html`
3. Vá em **Settings → Pages → Source: Deploy from branch → main → / (root)**
4. Aguarde ~1 minuto — os links ficam no formato `https://seu-usuario.github.io/insightflow-ai/01_lean_canvas.html`
5. Cole os links na tabela acima

---

## Como Interpretar Cada Artefato

### Documento Teórico (`.docx`)

| Seção | Conteúdo | Critério |
|-------|----------|----------|
| 1. Visão de Produto | Descrição, público-alvo, proposta de valor e vantagem competitiva | 1.1 |
| 2. Definição do MVP | 6 funcionalidades com MoSCoW, sprint e critério de aceitação | 1.2 |
| 3. Roadmap | 4 fases com objetivos, entregáveis e critérios de conclusão | 1.3 |
| 4. Ciclo de Vida | Descoberta → Validação → Entrega → Evolução com recursos e métricas | 1.4 |
| 5. Gerenciamento de Riscos | 8 riscos com probabilidade × impacto (PMI/PMBOK) | 1.5 |
| 6. Gestão de Produtos e IA | LGPD/GDPR/EU AI Act, riscos de IA, ética, impactos organizacionais | 1.6 |

### Artefatos Visuais (HTMLs)

**01 — Lean Canvas**  
Leia da esquerda para a direita: Problema → Solução → Proposta de Valor Única → Vantagem Injusta → Segmentos. As duas células inferiores completam a viabilidade de negócio (Custos e Receita). O bloco central em fundo escuro é a proposta de valor — o coração do produto.

**02 — Documento de MVP**  
Tabela priorizada com framework MoSCoW. Leia por coluna: funcionalidade → critério de aceitação → prioridade (Must/Should) → sprint de entrega. Funcionalidades fora da tabela são candidatas à Fase 2+.

**03 — Roadmap Visual**  
Linha do tempo com 4 fases em cores distintas (cinza = descoberta, azul = MVP, roxo = expansão, verde = escala). Cada fase tem duração, entregas e critério de conclusão. **A transição entre fases é orientada por resultado, não por tempo** — só avança quando as métricas de gate são atingidas.

**04 — Matriz de Riscos**  
Score = Probabilidade (1–5) × Impacto (1–5). Semáforo de criticidade:
- 🔴 **Alto (≥15):** ação imediata, bloqueante para o MVP
- 🟡 **Médio (8–14):** mitigação planejada, monitoramento ativo
- 🟢 **Baixo (≤7):** monitoramento periódico, plano de contingência documentado

---

## Lógica do Planejamento

### Por que esse MVP?
A decisão central foi separar o que entrega valor imediato do que é nice-to-have. Análise de sentimento, modelo preditivo e integrações enterprise são funcionalidades poderosas — mas nenhuma resolve a dor central antes que o usuário confie no produto. O MVP resolve a dor central. O restante evolui depois que a confiança está construída.

### Por que roadmap orientado a critérios, não a datas?
Em produtos com IA, as premissas mudam rápido — qualidade de modelo, custo de API, comportamento do usuário. Um roadmap engessado por datas ignora esses sinais. O modelo adotado permite acelerar quando as métricas são atingidas e pausar quando não são, sem perder o plano geral.

### Por que 8 riscos na matriz?
O enunciado pede mínimo 5. Os primeiros 7 cobrem riscos técnicos e operacionais típicos de produtos com IA. O **risco 8 (concorrência de mercado)** foi adicionado para demonstrar maturidade estratégica — todo produto existe em um mercado, e ignorar concorrentes é um risco de negócio tão real quanto um bug de segurança.

---

## Fontes e Referências

- PMI — PMBOK Guide, 7ª ed., 2021
- Scrum Guide (Schwaber & Sutherland, 2020)
- Lean Canvas (Ash Maurya)
- LGPD — Lei 13.709/2018
- GDPR — Regulamento UE 2016/679
- EU AI Act — Regulamento UE 2024/1689
- Disciplina: Fundamentos de Gestão de Projetos — UniFECAF, 2026
