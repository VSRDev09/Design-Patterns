package Builder.SemDiretor;

public class Usuario {
    String nome;
    String cpf;
    int idade;
    String nascimento;
    String endereco;

    public Usuario() {

    }

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
