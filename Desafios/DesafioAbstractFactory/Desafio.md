
# 🧠 💥 DESAFIO — Sistema de Streaming Multiplataforma

## 📌 Contexto

Você está desenvolvendo o backend de uma plataforma de streaming (semelhante a Netflix ou Spotify), que precisa funcionar em diferentes plataformas:

* Android
* iOS
* Web

---

## 📌 Problema

Cada plataforma possui suas próprias tecnologias e formas de lidar com funcionalidades essenciais do sistema.

Essas funcionalidades incluem:

### 🎬 Reprodução de mídia

Cada plataforma utiliza um mecanismo diferente para reproduzir vídeos ou músicas.

---

### 🔐 Autenticação

O processo de login varia de acordo com o ambiente onde a aplicação está rodando.

---

### 💾 Armazenamento local

Cada plataforma possui sua própria forma de persistir dados localmente.

---

## ⚠️ Restrições importantes

* Os componentes utilizados devem ser compatíveis entre si dentro de cada plataforma
* Não é permitido misturar tecnologias de plataformas diferentes
* O sistema deve funcionar corretamente independentemente da plataforma escolhida
* O código deve permitir a adição de novas plataformas no futuro sem grandes modificações
* O serviço principal não deve depender de implementações específicas

---

## 🎯 Objetivo

Modelar uma solução que permita:

* Inicializar corretamente o sistema para qualquer uma das plataformas
* Garantir que os componentes utilizados sejam sempre compatíveis entre si
* Manter baixo acoplamento entre as partes do sistema
* Facilitar a evolução e manutenção do código

---

## 🔥 Extensão do problema (opcional)

O sistema também pode ter variações adicionais, como:

* Diferentes tipos de plano (ex: gratuito e premium)
* Diferentes níveis de qualidade de mídia

Essas variações podem impactar o comportamento do sistema.

---

Quando você for resolver, pensa sempre nisso:

> “Como eu garanto consistência entre objetos que precisam nascer juntos sem acoplar tudo?”
