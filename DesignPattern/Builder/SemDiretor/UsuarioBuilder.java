package Builder.SemDiretor;

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
