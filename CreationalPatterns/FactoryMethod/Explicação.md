````markdown
# 🧠 Factory Method — Guia Completo e Didático

## 📌 O que é o Factory Method?

O **Factory Method** é um padrão de projeto **criacional** que define:

> Um método para criar objetos, mas deixa que as subclasses decidam **qual objeto será criado**.

---

## 💡 Ideia central

👉 Você **não instancia diretamente** (`new`) dentro do código principal  
👉 Você delega essa responsabilidade para uma **fábrica**

---

## 🧩 Problema que ele resolve

Sem Factory Method, você teria algo assim:

```java
if (type.equals("email")) {
    notification = new Email();
} else if (type.equals("sms")) {
    notification = new SMS();
}
````

❌ Problemas:

* Muito `if/else`
* Código acoplado
* Difícil de expandir
* Viola **Open/Closed**

---

## 🏗️ Estrutura do Factory Method

### 1. Produto (interface)

```java
Notification
Payment
```

---

### 2. Produtos Concretos

```java
Email, SMS, Push
Pix, Boleto, CreditCard
```

---

### 3. Creator (Fábrica Abstrata)

Define o método fábrica:

```java
public abstract Notification createNotification();
```

---

### 4. Concrete Creators

Cada um decide qual objeto criar:

```java
EmailFactory
SMSFactory
PixFactory
```

---

## ⚙️ Como implementar (passo a passo)

### ✅ Passo 1 — Criar interface do produto

```java
public interface Notification {
    void send();
}
```

---

### ✅ Passo 2 — Criar produtos concretos

```java
public class Email implements Notification {
    public void send() {
        System.out.println("Sending email");
    }
}
```

---

### ✅ Passo 3 — Criar fábrica abstrata

```java
public abstract class NotificationFactory {
    
    public abstract Notification createNotification();

    public void sendNotification(){
        Notification notification = createNotification();
        notification.send();
    }
}
```

---

### ✅ Passo 4 — Criar fábricas concretas

```java
public class EmailFactory extends NotificationFactory {
    public Notification createNotification(){
        return new Email();
    }
}
```

---

## 🚀 Agora explicando o código

---

# 📩 PARTE 1 — Notifications

---

## 🧠 Interface Notification

```java
public interface Notification {
    public void send();
}
```

👉 Define o comportamento comum

---

## 🏭 NotificationFactory

```java
public abstract class NotificationFactory {
    
    public abstract Notification createNotification();

    public void sendNotification(){
        
        Notification notification = createNotification();
        notification.send();
    }
}
```

### 🔥 Aqui está o padrão:

👉 `createNotification()` é o **Factory Method**

👉 `sendNotification()` é o **algoritmo fixo**

---

## 🏗️ Fábricas concretas

### EmailFactory

```java
public class EmailFactory extends NotificationFactory {
    
    public Notification createNotification(){
        return new Email();
    }
}
```

### PushFactory

```java
public class PushFactory extends NotificationFactory{
    
    public Notification createNotification(){
        return new Push();
    }
}
```

### SMSFactory

```java
public class SMSFactory extends NotificationFactory{
    
    public Notification createNotification(){
        return new SMS();
    }
}
```

---

## 📦 Produtos

### Email

```java
public class Email implements Notification{
    public void send(){
        System.out.println("Sending email");
    }
}
```

👉 Cada classe implementa seu comportamento

---

## 🧠 O que está acontecendo aqui?

👉 A lógica de envio está fixa:

```java
sendNotification()
```

👉 Mas o tipo de notificação varia:

```java
createNotification()
```

🔥 Isso é Factory Method:

> Separar **o que fazer** de **qual objeto usar**

---

# 💳 PARTE 2 — Payments

Agora você aplicou o padrão de novo (🔥 muito bom)

---

## 🧠 Interface Payment

```java
public interface Payment {
    public void process();
}
```

---

## 🏭 PaymentFactory

```java
public abstract class PaymentFactory {
    
    public abstract Payment createPayment();

    public void processPayment(){
        Payment payment = createPayment();
        payment.process();
    }
}
```

👉 Mesmo conceito:

* `createPayment()` → Factory Method
* `processPayment()` → fluxo fixo

---

## 🏗️ Fábricas concretas

### PixFactory

```java
public class PixFactory extends PaymentFactory{
    
    public Payment createPayment(){
        return new Pix();
    }
}
```

---

### CreditCardFactory

```java
public class CreditCardFactory extends PaymentFactory{
    
    public Payment createPayment(){
        return new CreditCard();
    }
}
```

---

### ⚠️ ERRO IMPORTANTE no seu código

```java
public class BoletoFactory extends PaymentFactory{
    
    public Payment createPayment(){
        return new CreditCard(); // ❌ ERRADO
    }
}
```

🚨 Aqui deveria ser:

```java
return new Boleto();
```

👉 Senão você quebra o padrão (e a lógica do sistema)

---

## 📦 Produtos

### Pix

```java
public class Pix implements Payment {
    public void process(){
        System.out.println("Processando pix");
    }
}
```

---

### Boleto

```java
public class Boleto implements Payment{
    public void process(){
        System.out.println("Gerando novo boleto");
    }
}
```

---

### CreditCard

```java
public class CreditCard implements Payment{
    public void process(){
        System.out.println("Processando cartao de credito");
    }
}
```

---

## 🎮 Main

```java
factory = new PixFactory();
factory.processPayment();
```

### 🔍 O que acontece:

1. Escolhe a fábrica
2. Chama o método padrão
3. A fábrica decide qual objeto criar

---

## 🧠 Diferença mental (IMPORTANTE)

### Factory Method

* Cria **um único produto**
* Subclasses decidem qual instância criar

---

### Abstract Factory

* Cria **famílias de produtos**
* Garante compatibilidade

---

## 🧠 Por que isso é poderoso?

### ✅ 1. Remove `new` do código principal

### ✅ 2. Facilita extensão

Quer adicionar:

* WhatsAppNotification?
* CryptoPayment?

👉 Só cria nova fábrica

---

### ✅ 3. Segue SOLID

* ✔ Open/Closed
* ✔ Dependency Inversion

---

## ⚠️ Quando usar Factory Method?

Use quando:

✔ Você não sabe qual classe instanciar
✔ Quer delegar a criação para subclasses
✔ Quer eliminar `if/else` de criação

---

## ❌ Quando NÃO usar

❌ Quando não há variação de objetos
❌ Quando a criação é trivial
