# 📝 Exercícios de Lógica Proposicional

Resoluções de exercícios envolvendo conectivos lógicos e tabelas verdade.

---

## 1. Estudei para a prova e fiz todos os exercícios

- p: estudei
- q: fiz os exercícios
- expressão: `p ∧ q`

| p   | q   | p ∧ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | F     |
| F   | F   | F     |

---

## 2. Vou ao cinema ou fico em casa

- p: ir ao cinema
- q: ficar em casa
- expressão: `p ∨ q`

| p   | q   | p ∨ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | V     |
| F   | V   | V     |
| F   | F   | F     |

---

## 3. Se acordar cedo, pego o ônibus

- p: acordar cedo
- q: pegar o ônibus
- expressão: `p → q`

| p   | q   | p → q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | V     |
| F   | F   | V     |

---

## 4. Se estudar muito, passo e ganho presente

- p: estudar
- q: passar
- r: ganhar presente
- expressão: `p → (q ∧ r)`

| p   | q   | r   | q ∧ r | resultado |
| --- | --- | --- | ----- | --------- |
| V   | V   | V   | V     | V         |
| V   | V   | F   | F     | F         |
| V   | F   | V   | F     | F         |
| V   | F   | F   | F     | F         |
| F   | V   | V   | V     | V         |
| F   | V   | F   | F     | V         |
| F   | F   | V   | F     | V         |
| F   | F   | F   | F     | V         |

---

## 5. Jogar videogame ou estudar lógica

- p: jogar
- q: estudar
- expressão: `p ∨ q`

| p   | q   | p ∨ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | V     |
| F   | V   | V     |
| F   | F   | F     |

---

## 6. Comi pizza e tomei refrigerante

- p: pizza
- q: refrigerante
- expressão: `p ∧ q`

| p   | q   | p ∧ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | F     |
| F   | F   | F     |

---

## 7. Se tiver dinheiro, viajo

- p: ter dinheiro
- q: viajar
- expressão: `p → q`

| p   | q   | p → q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | V     |
| F   | F   | V     |

---

## 8. Ler livro se e somente se terminar trabalho

- p: ler
- q: terminar trabalho
- expressão: `p ↔ q`

| p   | q   | p ↔ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | F     |
| F   | F   | V     |

---

## 9. Se estiver sol, vou à praia ou parque

- p: sol
- q: praia
- r: parque
- expressão: `p → (q ∨ r)`

| p   | q   | r   | q ∨ r | resultado |
| --- | --- | --- | ----- | --------- |
| V   | V   | V   | V     | V         |
| V   | V   | F   | V     | V         |
| V   | F   | V   | V     | V         |
| V   | F   | F   | F     | F         |
| F   | V   | V   | V     | V         |
| F   | V   | F   | V     | V         |
| F   | F   | V   | V     | V         |
| F   | F   | F   | F     | V         |

---

## 10. Fazer bolo se e somente se comprar ingredientes

- p: fazer bolo
- q: comprar ingredientes
- expressão: `p ↔ q`

| p   | q   | p ↔ q |
| --- | --- | ----- |
| V   | V   | V     |
| V   | F   | F     |
| F   | V   | F     |
| F   | F   | V     |

---

## Observações

- Exercícios básicos, mas importantes para fixar lógica
- Base para uso em estruturas condicionais na programação
- Próximo passo: trabalhar com negação (`¬`)
