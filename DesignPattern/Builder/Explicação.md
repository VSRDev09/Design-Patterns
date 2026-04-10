
# 🧱 Padrão Builder em Java (Com e Sem Diretor)

## 🧠 O que é o Builder?

O **Builder** é um padrão de projeto criacional que permite **construir objetos complexos passo a passo**, separando:

* **Como o objeto é construído**
* **Da representação final do objeto**

---

## 🚨 Problema que ele resolve

Quando você tem objetos com muitos atributos:

```java
Usuario u = new Usuario("Vinicius", "088...", 22, "31/08/2003", "Rua...");
```

❌ Problemas:

* Difícil leitura
* Ordem dos parâmetros importa
* Pouca flexibilidade
* Difícil manutenção

---

## ✅ Ideia do Builder

Você constrói assim:

```java
Usuario usuario = builder.nome("Vinicius")
                         .idade(22)
                         .cpf("08800535825")
                         .endereco("Rua do Javinha")
                         .nascimento("31/08/2003")
                         .build();
```

✔ Legível
✔ Flexível
✔ Escalável

---

# 🔀 Existem DUAS formas de usar Builder

## 1️⃣ Builder **SEM Diretor** (mais simples)

👉 O próprio cliente controla a construção.

---

## 📂 Exemplo: UsuarioBuilder

### 📄 Classe `Usuario`

```java
public class Usuario {
    String nome;
    String cpf;
    int idade;
    String nascimento;
    String endereco;

    @Override
    public String toString() {
        return "Usuario {" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", nascimento='" + nascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
```

---

### 📄 Classe `UsuarioBuilder`

```java
public class UsuarioBuilder {

    private Usuario usuario = new Usuario();

    public UsuarioBuilder nome(String nome){
        usuario.nome = nome;
        return this;
    }

    public UsuarioBuilder cpf(String cpf){
        usuario.cpf = cpf;
        return this;
    }

    public UsuarioBuilder idade(int idade){
        usuario.idade = idade;
        return this;
    }

    public UsuarioBuilder nascimento(String nascimento){
        usuario.nascimento = nascimento;
        return this;
    }

    public UsuarioBuilder endereco(String endereco){
        usuario.endereco = endereco;
        return this;
    }

    public Usuario build(){
        return usuario;
    }
}
```

---

### 📄 Classe `Main`

```java
UsuarioBuilder builder = new UsuarioBuilder();

Usuario usuario = builder.nome("Vinicius")
                  .idade(22)
                  .cpf("08800535825")
                  .endereco("Rua do Javinha")
                  .nascimento("31/08/2003")
                  .build();

System.out.println(usuario);
```

---

## ⚙️ Como funciona

* Cada método define um atributo
* Retorna `this` → permite encadeamento
* `build()` entrega o objeto final

---

## 🎯 Características (Sem Diretor)

* ✔ Simples
* ✔ Mais usado no mercado
* ✔ Controle total no cliente
* ❌ Pode gerar lógica duplicada se houver padrões de construção

---

# 2️⃣ Builder **COM Diretor**

👉 Aqui entra uma nova classe: **Diretor**

Ele define **PASSOS PADRÃO de construção**

---

## 📂 Exemplo: Sistema de Relatórios

Você tem diferentes formatos:

* PDF
* HTML

Mas o processo de construção é o mesmo.

---

## 📄 Interface `RelatorioBuilder`

```java
public interface RelatorioBuilder {
    void buildTitulo();
    void buildCorpo();
    void buildRodape();
    Relatorio getRelatorio();
}
```

👉 Define o contrato de construção.

---

## 📄 Classe `Relatorio`

```java
public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    public void setTitulo(String t) { this.titulo = t; }
    public void setCorpo(String c) { this.corpo = c; }
    public void setRodape(String r) { this.rodape = r; }

    @Override
    public String toString() {
        return "Relatorio [Titulo=" + titulo + ", Corpo=" + corpo + ", Rodape=" + rodape + "]";
    }
}
```

---

## 🧱 Builders concretos

### 📄 `RelatorioPDFBuilder`

```java
class RelatorioPDFBuilder implements RelatorioBuilder {

    private Relatorio relatorio = new Relatorio();

    public void buildTitulo() { relatorio.setTitulo("PDF: Cabeçalho com Logo"); }
    public void buildCorpo() { relatorio.setCorpo("Conteúdo formatado em colunas PDF"); }
    public void buildRodape() { relatorio.setRodape("Página 1 de 10 (PDF)"); }

    public Relatorio getRelatorio() { return relatorio; }
}
```

---

### 📄 `RelatorioHTMLBuilder`

```java
class RelatorioHTMLBuilder implements RelatorioBuilder {

    private Relatorio relatorio = new Relatorio();

    public void buildTitulo() { relatorio.setTitulo("<h1>Título HTML</h1>"); }
    public void buildCorpo() { relatorio.setCorpo("<p>Parágrafo de texto HTML</p>"); }
    public void buildRodape() { relatorio.setRodape("<footer>Link de Contato</footer>"); }

    public Relatorio getRelatorio() { return relatorio; }
}
```

---

## 🎯 Classe `Diretor`

```java
class Diretor {
    
    private RelatorioBuilder builder;

    public Diretor(RelatorioBuilder builder) {
        this.builder = builder;
    }

    public void construirRelatorioCompleto() {
        builder.buildTitulo();
        builder.buildCorpo();
        builder.buildRodape();
    }

    public void construirRelatorioSimples() {
        builder.buildTitulo();
        builder.buildCorpo();
    }
}
```

👉 Ele define **roteiros prontos de construção**

---

## 📄 Classe `Main`

```java
RelatorioBuilder builder = new RelatorioPDFBuilder();

Diretor diretor = new Diretor(builder);
diretor.construirRelatorioCompleto();

Relatorio relatorioFinal = builder.getRelatorio();
System.out.println(relatorioFinal);

// HTML
builder = new RelatorioHTMLBuilder();

diretor = new Diretor(builder);
diretor.construirRelatorioCompleto();

relatorioFinal = builder.getRelatorio();
System.out.println(relatorioFinal);
```

---

## ⚙️ Fluxo (Com Diretor)

1. Cliente escolhe o builder (PDF/HTML)
2. Passa para o Diretor
3. Diretor executa os passos
4. Builder monta o objeto
5. Cliente pega o resultado

---

## 🎯 Características (Com Diretor)

* ✔ Reutilização de processos de construção
* ✔ Padronização (ex: relatório completo, simples)
* ✔ Separa lógica de construção do cliente
* ❌ Mais complexo
* ❌ Mais classes

---

# 🆚 Comparação Final

| Aspecto                | Sem Diretor | Com Diretor                 |
| ---------------------- | ----------- | --------------------------- |
| Complexidade           | Baixa       | Média                       |
| Controle               | Cliente     | Diretor                     |
| Reutilização de passos | ❌           | ✔                           |
| Flexibilidade          | ✔           | ✔                           |
| Uso no mercado         | Muito comum | Usado em cenários complexos |

---

# 🧠 Quando usar cada um?

## 👉 Use SEM Diretor quando:

* Objeto simples/moderado
* Não há padrões fixos de construção
* Você quer simplicidade

## 👉 Use COM Diretor quando:

* Existem **vários modos de construção**
* Há **processos padronizados**
* Você quer reaproveitar lógica
