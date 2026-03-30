# 🐍 Exercícios Python — Resolvidos

> Exercícios práticos de Python com foco em `print()`, `input()`, variáveis, estruturas condicionais e laços de repetição.

---

## Exercício 1 — Adivinhe o número 🔮

**Enunciado:** Crie um programa que simule um truque de mágica! Peça para a pessoa pensar em um número de 1 a 10 e "adivinhe" o número no final.

```python
print("🔮 Bem-vindo ao truque de mágica!")
input("Pense em um número de 1 a 10... (pressione Enter quando estiver pronto)")

print("🧠 Estou lendo sua mente...")
input("Multiplique seu número por 2 e pressione Enter...")

print("✨ Interessante...")
input("Agora some 5 ao resultado e pressione Enter...")

print("🔍 Quase lá...")
input("Agora divida por 2 e pressione Enter...")

print("😏 Já sei qual é o seu número...")
input("Concentre-se bem e pressione Enter para eu revelar...")

print("🎉 O número que você pensou foi... 3! 😱🔮")
print("Uau! Acertei? Sou um gênio da mente! 😎")
```

**💡 Como funciona:** O programa sempre revela o mesmo número no final — é só uma brincadeira para parecer mágica! Usamos `print()` para narrar e `input()` apenas como pausa entre os passos.

---

## Exercício 2 — Pense em uma cor 🎨

**Enunciado:** Peça para a pessoa pensar em uma cor e, após alguns passos, "adivinhe" a cor escolhida usando uma mensagem divertida!

```python
print("🎩✨ Bem-vindo ao truque mágico das cores!")
input("Pense em uma cor bem forte... (aperte Enter quando estiver pronto)")

print("🔮 Estou captando suas ondas mentais...")
input("Imagine essa cor ficando mais brilhante... (Enter)")

print("🧠 Interessante...")
input("Agora imagine essa cor pintando uma parede inteira... (Enter)")

print("✨ Concentre-se mais um pouco...")
input("Não mude a cor! Estou quase descobrindo... (Enter)")

print("😏 Já sei qual é...")
input("Preparado para a revelação? (Enter)")

print("🎉 A cor que você pensou foi... AZUL! 💙😱")
print("Incrível! Acertei? Ou estou precisando treinar meus poderes? 😂🔮")
```

**💡 Como funciona:** Assim como no exercício anterior, o programa sempre revela a mesma cor. A narrativa é o que cria o efeito de mágica! Conceitos usados: `print()` e `input()` como pausa.

---

## Exercício 3 — Criando uma história maluca 📖

**Enunciado:** Crie um programa que peça ao usuário 6 palavras (lugar, pessoa famosa, objeto, cor, verbo, número) e monte uma historinha engraçada com elas.

```python
print("🤪 Vamos criar uma história maluca!")
print("Responda às perguntas abaixo:\n")

lugar = input("Digite um lugar: ")
pessoa = input("Digite o nome de uma pessoa famosa: ")
objeto = input("Digite um objeto: ")
cor = input("Digite uma cor: ")
verbo = input("Digite um verbo: ")
numero = input("Digite um número: ")

print("\n✨ Aqui está sua história maluca:\n")

print(f"Um dia, no(a) {lugar}, encontrei o(a) {pessoa} segurando um(a) {objeto} {cor}.")
print(f"Do nada, ele(a) começou a {verbo} sem parar!")
print(f"E o mais estranho: isso durou por {numero} horas! 😱")
print("Foi a coisa mais bizarra que já vi! 😂")
```

**Exemplo de saída:**
```
Um dia, no(a) praia, encontrei o(a) Neymar segurando um(a) caneca roxa.
Do nada, ele(a) começou a cantar sem parar!
E o mais estranho: isso durou por 9 horas! 😱
Foi a coisa mais bizarra que já vi! 😂
```

**💡 Conceitos usados:** `input()`, variáveis e f-strings para interpolação de texto.

---

## Exercício 4 — Meu crachá de programador(a) 🎟️

**Enunciado:** Peça o nome, idade, linguagem favorita e um emoji que representa a pessoa. Depois, mostre tudo formatado como um crachá de evento tech.

```python
print("🎟️ Vamos criar seu crachá de programador(a)!\n")

nome = input("Digite seu nome: ")
idade = input("Digite sua idade: ")
linguagem = input("Digite sua linguagem favorita: ")
emoji = input("Escolha um emoji que te representa: ")

print("\n" + "_" * 30)
print("\n👩‍💻 Crachá do Dev\n")

print(f"Nome: {nome}")
print(f"Idade: {idade}")
print(f"Linguagem favorita: {linguagem}")
print(f"Emoji: {emoji}")

print("\n" + "_" * 30)
```

**Exemplo de saída:**
```
______________________________

👩‍💻 Crachá do Dev

Nome: Andre
Idade: 25
Linguagem favorita: Python
Emoji: 🐍

______________________________
```

**💡 Conceitos usados:** `input()`, variáveis, f-strings e `"_" * 30` para criar uma moldura automática.

---

## Exercício 5 — Oráculo da sabedoria Python 🔮

**Enunciado:** Crie um assistente que responde perguntas sobre programação usando `match case`.

```python
print("🔮 Bem-vindo ao Oráculo da Sabedoria Python!")
print("Pergunte sobre um tema de programação...\n")

tema = input("Digite um tema (ex: variáveis, loops, funções): ").lower()

print("\n🧠 Consultando os conhecimentos antigos...\n")

match tema:
    case "variáveis":
        print("📦 Variáveis são como caixinhas que guardam valores para usar depois!")

    case "loops":
        print("🔁 Loops servem para repetir ações várias vezes, como um robô obediente!")

    case "funções":
        print("🛠️ Funções são blocos de código reutilizáveis que facilitam sua vida!")

    case "listas":
        print("📋 Listas guardam vários valores em uma única variável!")

    case "condições":
        print("🤔 Condições ajudam o programa a tomar decisões (if, else, etc.)!")

    case _:
        print("🤖 Hmm... ainda estou aprendendo sobre isso. Pergunte outra coisa!")
```

**💡 Conceitos usados:** `input()`, `.lower()` para normalizar a entrada e `match case` para múltiplas condições. O `case _:` funciona como um "caso padrão" quando nenhuma outra opção bate.

---

## Exercício 6 — Quiz de perguntas e respostas 🎯

**Enunciado:** Crie um jogo de quiz com pontuação. O programa percorre uma lista de perguntas, verifica as respostas e exibe o resultado final.

```python
print("🎯 Bem-vindo ao Quiz de Programação!\n")

# Lista de perguntas e respostas
perguntas = [
    ["Qual linguagem estamos aprendendo?", "python"],
    ["Qual comando usamos para mostrar algo na tela?", "print"],
    ["Como se chama uma repetição em Python?", "loop"],
    ["Qual estrutura usamos para decisões?", "if"]
]

acertos = 0

# Percorre a lista de perguntas
for pergunta, resposta in perguntas:
    print(pergunta)
    resposta_usuario = input("Sua resposta: ").lower()

    if resposta_usuario == resposta:
        print("✅ Correto!\n")
        acertos += 1
    else:
        print(f"❌ Errado! A resposta era: {resposta}\n")

# Resultado final
print("🏁 Fim do quiz!")
print(f"🎉 Você acertou {acertos} de {len(perguntas)} perguntas!")
```

**💡 Conceitos usados:** lista de listas, laço `for`, `.lower()` para comparação sem erro de maiúsculas, variável de contagem `acertos` e `len()` para o total de perguntas.

---

## Exercício 7 — Número secreto 🔢

**Enunciado:** Escolha um número fixo e peça para o usuário tentar adivinhar até acertar, contando as tentativas.

```python
print("🎮 Bem-vindo ao jogo do Número Secreto!\n")

numero_secreto = 7
tentativas = 0
chute = 0

while chute != numero_secreto:
    chute = int(input("Digite um número: "))
    tentativas += 1

    if chute == numero_secreto:
        print(f"🎉 Parabéns! Você acertou o número secreto!")
        print(f"Você precisou de {tentativas} tentativas! 😄")
    else:
        print("❌ Errou! Tente novamente...\n")
```

**💡 Conceitos usados:** `while` para repetir enquanto o jogador não acertar, `int(input())` para converter a entrada em número inteiro e variável `tentativas` incrementada a cada rodada.

---

## Exercício 8 — Caça ao tesouro espacial 🚀💎

**Enunciado:** Um tesouro está escondido em um mapa 3x3. O jogador tem 5 chances para encontrá-lo indicando linha e coluna.

```python
print("🚀 Bem-vindo ao Caça ao Tesouro Espacial!\n")

# Criando tabuleiro 3x3
tabuleiro = [
    [" ", " ", " "],
    [" ", " ", " "],
    [" ", " ", " "]
]

# Posição fixa do tesouro
tesouro_linha = 1
tesouro_coluna = 2

tentativas = 0
max_tentativas = 5

while tentativas < max_tentativas:
    print("\n🗺️ Mapa atual:")
    for linha in tabuleiro:
        print(linha)

    print(f"\nTentativa {tentativas + 1} de {max_tentativas}")

    linha = int(input("Escolha a linha (0 a 2): "))
    coluna = int(input("Escolha a coluna (0 a 2): "))

    # Verificar posição inválida
    if linha < 0 or linha > 2 or coluna < 0 or coluna > 2:
        print("⚠️ Posição inválida! Tente valores entre 0 e 2.")
        continue

    # Verificar se já tentou
    if tabuleiro[linha][coluna] == "X":
        print("🔁 Você já tentou esse lugar!")
        continue

    tentativas += 1

    # Verificar acerto
    if linha == tesouro_linha and coluna == tesouro_coluna:
        tabuleiro[linha][coluna] = "💎"
        print("\n🎉 Você encontrou o tesouro espacial!!! 💎🚀")
        break
    else:
        tabuleiro[linha][coluna] = "X"
        print("❌ Nada aqui... continue explorando!")

else:
    print("\n💀 Suas tentativas acabaram!")

# Revelar tesouro no mapa final
tabuleiro[tesouro_linha][tesouro_coluna] = "💎"

print("\n🗺️ Mapa final:")
for linha in tabuleiro:
    print(linha)

print("\n📍 O tesouro estava escondido aí! 😄")
```

**💡 Conceitos usados:** lista de listas (matriz), `while` com limite de tentativas, validação de entrada com `if`, `continue` para pular tentativas inválidas, `break` para encerrar ao acertar e o bloco `else` do `while` (executado quando as tentativas se esgotam sem `break`).

---

*Exercícios desenvolvidos para prática de Python — do básico ao intermediário. 🐍*
