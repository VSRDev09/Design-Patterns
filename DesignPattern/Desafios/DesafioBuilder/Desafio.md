
# 🧠💥 DESAFIO — Sistema de Construção de Requisições HTTP (Builder Pattern)

## 📌 Contexto (muito real)

Você está desenvolvendo uma biblioteca interna de backend.

O sistema precisa montar **requisições HTTP complexas**, tipo:

* URL
* Método (GET, POST, PUT…)
* Headers (vários, opcionais)
* Query Params (opcional)
* Body (opcional)
* Timeout
* Autenticação

---

## ❌ Problema

Sem Builder, ficaria algo assim:

```java
HttpRequest req = new HttpRequest(
    "https://api.com/users",
    "POST",
    headers,
    params,
    body,
    5000,
    auth
);
```

👉 Impossível de ler
👉 Fácil de errar
👉 Parâmetros opcionais viram um caos

---

## 🎯 Objetivo

Implementar um **Builder Pattern** para construir requisições HTTP de forma:

* Legível
* Flexível
* Escalável

---

## 🧩 Requisitos

### 📦 Classe principal: `HttpRequest`

Ela deve conter:

* url (String) ✅ obrigatório
* method (String) ✅ obrigatório
* headers (Map<String, String>) ❌ opcional
* queryParams (Map<String, String>) ❌ opcional
* body (String) ❌ opcional
* timeout (int) ❌ opcional
* authToken (String) ❌ opcional

---

## 🏗️ Builder

Você deve criar:

```java
HttpRequestBuilder
```

---

## ⚙️ Regras do Builder

### 1. Construção fluente

```java
HttpRequest request = new HttpRequestBuilder("https://api.com", "POST")
    .addHeader("Authorization", "Bearer token")
    .addHeader("Content-Type", "application/json")
    .addQueryParam("page", "1")
    .setBody("{ \"name\": \"Vinicius\" }")
    .setTimeout(5000)
    .build();
```

---

### 2. Métodos obrigatórios no construtor

```java
new HttpRequestBuilder(url, method)
```

---

### 3. Métodos encadeáveis

Todos devem retornar o próprio builder:

```java
builder.addHeader(...)
       .setBody(...)
       .build();
```

---

### 4. Método final

```java
build()
```

👉 Deve retornar o objeto `HttpRequest`

---

## 🔥 Regras extras (nível hard)

### ✅ Validação

* URL não pode ser vazia
* Method deve ser válido (GET, POST, PUT, DELETE)

---

### ✅ Imutabilidade (diferencial)

Depois de criado, o `HttpRequest` **não pode ser alterado**

---

### ✅ Bonus (nível arquiteto)

Implementa:

```java
toString()
```

Pra imprimir algo assim:

```
POST https://api.com/users?page=1
Headers:
  Authorization: Bearer token
  Content-Type: application/json
Body:
  { "name": "Vinicius" }
Timeout: 5000ms
```

---

## 🧠 O que isso vai te ensinar

Se fizer direito, você aprende:

* Builder na prática real
* Encadeamento fluente
* Imutabilidade
* Design limpo
* Evitar construtores gigantes

---

## 🚀 Missão

Implementa:

* `HttpRequest`
* `HttpRequestBuilder`
