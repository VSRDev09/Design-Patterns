````markdown
# 🧠 Abstract Factory — Guia Completo e Didático

## 📌 O que é o Abstract Factory?

O **Abstract Factory** é um padrão de projeto **criacional** que tem como objetivo:

> Criar famílias de objetos relacionados **sem precisar especificar suas classes concretas**.

Em outras palavras:

👉 Você cria uma **fábrica de objetos**,  
👉 que garante que os objetos criados são **compatíveis entre si**.

---

## 🧩 Problema que ele resolve

Imagine que você tem um sistema com múltiplos temas:

- Dark
- Light

E cada tema possui vários componentes:

- Button
- Card
- Modal

❌ Problema sem Abstract Factory:

Você teria código assim espalhado:

```java
if (theme.equals("Dark")) {
    button = new ButtonDark();
    card = new CardDark();
}
````

👉 Isso gera:

* Acoplamento forte
* Código difícil de manter
* Violação do princípio **Open/Closed**

---

## 💡 Ideia central do padrão

👉 Criar uma **interface de fábrica**
👉 Que define métodos para criar objetos

E cada implementação concreta da fábrica:

* Cria uma **família completa de objetos compatíveis**

---

## 🏗️ Estrutura do Abstract Factory

### 1. Produtos Abstratos

Interfaces dos objetos que serão criados:

```java
Button
Card
Modal
```

---

### 2. Produtos Concretos

Implementações específicas:

* ButtonDark / ButtonLight
* CardDark / CardLight
* ModalDark / ModalLight

---

### 3. Fábrica Abstrata

Define o contrato de criação:

```java
public interface UIThemeFactory {
    Button createButton();
    Card createCard();
    Modal createModal();
}
```

---

### 4. Fábricas Concretas

Cada fábrica cria uma família específica:

* DarkFactory → cria tudo DARK
* LightFactory → cria tudo LIGHT

---

### 5. Cliente

Classe que usa a fábrica sem conhecer as implementações:

```java
Application
```

---

## ⚙️ Como implementar (passo a passo)

### ✅ Passo 1 — Criar interfaces dos produtos

```java
public interface Button { void render(); }
public interface Card { void show(); }
public interface Modal { void pop(); }
```

---

### ✅ Passo 2 — Criar implementações concretas

Exemplo:

```java
public class ButtonDark implements Button {
    public void render() {
        System.out.println("Rendering Dark button");
    }
}
```

---

### ✅ Passo 3 — Criar a fábrica abstrata

```java
public interface UIThemeFactory {
    Button createButton();
    Card createCard();
    Modal createModal();
}
```

---

### ✅ Passo 4 — Criar fábricas concretas

```java
public class DarkFactory implements UIThemeFactory {
    public Button createButton() { return new ButtonDark(); }
    public Card createCard() { return new CardDark(); }
    public Modal createModal() { return new ModalDark(); }
}
```

---

### ✅ Passo 5 — Usar no cliente

```java
Application app = new Application(new DarkFactory());
```

---

## 🚀 Agora explicando o código

---

## 🧠 Application (Cliente)

```java
public class Application {
    
    private Button button;
    private Card card;
    private Modal modal;

    public Application(UIThemeFactory factory){
        button = factory.createButton();
        card = factory.createCard();
        modal = factory.createModal();
    }

    public void render(){
        button.render();
        card.show();
        modal.pop();
    }
}
```

### 🔍 O que está acontecendo aqui?

👉 A classe **não sabe** quais objetos está usando

Ela só sabe:

* Que existe um Button
* Um Card
* Um Modal

🔥 Isso é o coração do padrão:

> O cliente depende de **interfaces**, não de implementações

---

## 🏭 UIThemeFactory (Fábrica Abstrata)

```java
public interface UIThemeFactory {
    Button createButton();
    Card createCard();
    Modal createModal();
}
```

### 🔍 Papel dela:

Define **o contrato**:

* Toda fábrica deve saber criar:

  * Button
  * Card
  * Modal

---

## 🌑 DarkFactory

```java
public class DarkFactory implements UIThemeFactory {
    public Button createButton(){ return new ButtonDark(); }
    public Card createCard(){ return new CardDark(); }
    public Modal createModal(){ return new ModalDark(); }
}
```

### 🔥 Aqui está a mágica:

👉 Ela garante que:

* Tudo que será criado é **Dark**
* Não existe mistura com Light

---

## 🌕 LightFactory

```java
public class LightFactory implements UIThemeFactory {
    public Button createButton(){ return new ButtonLight(); }
    public Card createCard(){ return new CardLight(); }
    public Modal createModal(){ return new ModalLight(); }
}
```

👉 Mesma lógica, mas para outro tema

---

## 🎮 Main (decisão de fábrica)

```java
if (theme.equals("Dark")){
    app = new Application(new DarkFactory());
} else if (theme.equals("Light")){
    app = new Application(new LightFactory());
}
```

### 🔍 Aqui acontece:

👉 A escolha da fábrica
👉 Uma única vez

Depois disso:

💥 O sistema inteiro segue aquele padrão

---

## 🧠 Por que isso é poderoso?

### ✅ 1. Baixo acoplamento

Application não depende de:

* ButtonDark
* ButtonLight

---

### ✅ 2. Fácil de expandir

Quer adicionar um novo tema?

👉 Cria:

* BlueFactory
* ButtonBlue
* CardBlue
* ModalBlue

🔥 Sem alterar código existente

---

### ✅ 3. Consistência garantida

Nunca vai acontecer:

❌ Button Dark + Card Light

---

### ✅ 4. Segue SOLID

* ✔ Open/Closed
* ✔ Dependency Inversion

---

## ⚠️ Quando usar Abstract Factory?

Use quando:

✔ Existe **família de objetos relacionados**
✔ Você precisa garantir **compatibilidade entre eles**
✔ Quer evitar `new` espalhado pelo código
✔ Precisa trocar comportamento em runtime

---

## ❌ Quando NÃO usar

❌ Quando só existe um tipo de objeto
❌ Quando não há variações reais
❌ Quando o sistema é simples demais
