````markdown
# 🧠 Prototype Pattern — Explicação Completa

## 📌 O que é o Prototype?

O **Prototype** é um padrão de projeto criacional que permite criar novos objetos **a partir da cópia de objetos existentes**, ao invés de instanciá-los diretamente com `new`.

> Em vez de **construir**, você **clona**.

---

## 🎯 Problema que ele resolve

Normalmente, quando você quer criar um objeto:

```java
Product p = new Product(...);
````

Isso funciona, mas começa a dar problema quando:

* o objeto tem **muitos atributos**
* a criação exige **muita configuração**
* existem **variações pequenas** entre objetos
* você não quer depender da classe concreta

Além disso:

* copiar manualmente campo por campo é **chato e propenso a erro**
* alguns campos podem ser **privados**
* você pode acabar **acoplando seu código à classe concreta**

---

## 💡 Ideia central do Prototype

Delegar a responsabilidade de cópia para o próprio objeto.

Ou seja:

```text
"Ei objeto, se copie"
```

Isso é feito através de um método como:

```java
clone()
```

---

## 🧱 Estrutura do padrão

### 1. Interface Prototype

Define o contrato de clonagem:

```java
clone()
```

---

### 2. Classe concreta

Implementa:

* um **construtor de cópia**
* o método `clone()`

---

### 3. Cliente

Usa o clone sem precisar saber:

* como o objeto foi criado
* quais campos ele tem
* qual é sua classe concreta

---

## ⚠️ Shallow Copy vs Deep Copy

### ❌ Shallow Copy (errado na maioria dos casos)

Copia apenas a referência:

```java
this.tags = other.tags;
```

Problema:

* dois objetos compartilham a mesma lista
* alterar um → altera o outro

---

### ✅ Deep Copy (correto)

Cria uma nova instância:

```java
this.tags = new ArrayList<>(other.tags);
```

Agora:

* cada objeto tem sua própria lista
* alterações são independentes

---

## 🔥 Prototype com Registro

Além de clonar objetos, você pode ter um **catálogo de protótipos prontos**.

Isso é o **Prototype Registry**.

---

### 📌 Ideia

Você armazena objetos base:

```text
"notebook" → produto configurado
"console" → produto configurado
```

E quando precisa:

```text
clona ao invés de criar
```

---

### 🎯 Benefícios

* evita recriação de objetos complexos
* centraliza configurações
* reduz duplicação de código
* melhora performance (em alguns casos)

---

## 🧠 Agora vamos aplicar no seu código

---

# 🔹 Parte 1 — Sem Registro

## 📌 O que você fez

Você criou:

* uma interface `Prototype`
* uma classe `Product`
* implementou clone via construtor de cópia

---

## 🔍 Análise do seu código

### Interface

```java
public interface Prototype {
    Prototype clone();
}
```

✔️ Correto — define o contrato de clonagem

---

### Classe Product

#### Construtor de cópia

```java
public Product(Product outro){
    this.nome = outro.nome;
    this.preco = outro.preco;
    this.tags = new ArrayList<>(outro.tags);
}
```

✔️ Perfeito — aqui está o coração do Prototype

* você fez **deep copy da lista**
* evitou compartilhamento de referência

---

#### Método clone

```java
@Override
public Prototype clone(){
    return new Product(this);
}
```

✔️ Correto — delega a cópia para o construtor

---

### Uso no Main

```java
Product notebook1 = (Product) notebook.clone();
```

✔️ Você:

* clonou o objeto
* não usou `new`
* desacoplou a criação

---

# 🔹 Parte 2 — Com Registro

Agora vem a parte mais interessante.

---

## 📌 O que você implementou

Um **registro de protótipos**:

```java
private Map<String, Prototype> registry = new HashMap<>();
```

---

## 🔍 Método add

```java
public void addRegistry(String key, Prototype prototype){
    registry.put(key, prototype);
}
```

✔️ Armazena protótipos base

---

## 🔍 Método get

```java
public Prototype get(String key){
    Prototype prototype = registry.get(key);
    return prototype != null ? prototype.clone() : null;
}
```

🔥 Aqui está o ponto mais importante:

* você **NÃO retorna o original**
* você retorna um **clone**

✔️ Isso garante isolamento entre objetos

---

## 🧪 Uso no Main

```java
Product notebook2 = (Product) registry.get("Notebook");
notebook2.addTags("Entretenimento");
```

Depois:

```java
notebook.show();
notebook2.setNome("Lenovo");
notebook2.show();
```

---

## 🧠 O que isso prova

* `notebook` é o protótipo original
* `notebook2` é uma cópia independente

👉 Quando você altera `notebook2`, o original NÃO muda

---

## 💥 Ponto forte do seu código

Você fez corretamente:

✔️ Deep copy
✔️ Clone via construtor
✔️ Registro retornando clone
✔️ Separação entre criação e uso

---

## ⚠️ Pequena melhoria (nível profissional)

Quando usa:

```java
Map<String, Prototype>
```

sempre tem que fazer cast:

```java
(Product) registry.get(...)
```

👉 Em código real, poderia usar generics:

```java
Map<String, Product>
```

Ou:

```java
interface Prototype<T>
```

---

# 💥 Conclusão

O Prototype resolve um problema muito específico:

> Criar objetos complexos de forma simples e desacoplada

---

## 🧠 Quando usar

* objetos complexos
* muitas variações de configuração
* evitar criação repetitiva
* trabalhar com interfaces ao invés de classes concretas

---

## 🚫 Quando NÃO usar

* objetos simples
* quando `new` já resolve
* quando não há necessidade de cópia

---

## ⚔️ Em uma frase

> Prototype é sobre **copiar objetos com segurança e desacoplamento**, ao invés de construí-los do zero.

---

