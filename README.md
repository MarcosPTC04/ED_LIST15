# 📌 Descrição

Este repositório apresenta a implementação da **EDList15**, desenvolvida para a disciplina de **Estrutura de Dados I**. O projeto consiste na implementação da estrutura de dados **Fila (Queue)** em Java, utilizando duas abordagens: **Fila Estática** (array circular) e **Fila Dinâmica** (lista encadeada), seguindo o princípio **FIFO (First In, First Out)**.

Além das implementações, o projeto contém exercícios práticos que demonstram o funcionamento das operações básicas de uma fila, como inserção, remoção, consulta do primeiro e último elemento, verificação de tamanho, limpeza da estrutura e validação de fila vazia.

---

# 🛠 Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# 📂 Estrutura do Projeto

## 🔹 Queue<T>

Interface responsável por definir as operações básicas da estrutura de fila:

* `push()`
* `pop()`
* `peek()`
* `back()`
* `size()`
* `isEmpty()`
* `clear()`

---

## 🔹 StaticQueue<T>

Implementação da fila estática utilizando um **array circular**, permitindo o reaproveitamento das posições do vetor e controlando a capacidade máxima da estrutura.

---

## 🔹 LinkedQueue<T>

Implementação da fila dinâmica utilizando **lista encadeada**, permitindo crescimento conforme a necessidade da aplicação.

---

## 🔹 QueueNode<T>

Classe utilizada pela fila dinâmica para representar cada nó da lista encadeada.

---

## 🔹 Exercise01 até Exercise05

Classes responsáveis por executar os exercícios propostos na EDList15, demonstrando o funcionamento das implementações e validando as operações da fila.

---

# ⚙️ Funcionalidades

* Inserção de elementos (`push`)
* Remoção de elementos (`pop`)
* Consulta do primeiro elemento (`peek`)
* Consulta do último elemento (`back`)
* Verificação do tamanho da fila (`size`)
* Verificação de fila vazia (`isEmpty`)
* Limpeza completa da fila (`clear`)
* Implementação genérica utilizando `<T>`
* Fila Estática com array circular
* Fila Dinâmica com lista encadeada

---

# ▶️ Exemplo de Execução

```text
Fila:
10 -> 20 -> 30

Elemento removido:
10

Fila após remoção:
20 -> 30

Primeiro elemento:
20

Último elemento:
30
```

---

# 👨‍💻 Autor

**Marcos Antonio de Oliveira Filho**
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: Estrutura de Dados I

