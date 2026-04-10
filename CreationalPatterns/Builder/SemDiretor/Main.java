package Builder.SemDiretor;

public class Main {
    public static void main(String[] args) {

        UsuarioBuilder builder = new UsuarioBuilder();

        Usuario usuario = builder.nome("Vinicius")
                          .idade(22)
                          .cpf("08800535825")
                          .endereco("Rua do Javinha")
                          .nascimento("31/08/2003")
                          .build();

        usuario.toString();
    }
}
