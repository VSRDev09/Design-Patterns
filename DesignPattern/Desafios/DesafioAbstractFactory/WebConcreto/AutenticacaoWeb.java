package WebConcreto;

import Produtos.Autenticacao;

public class AutenticacaoWeb implements Autenticacao{
    public void auth(){
        System.out.println("Autenticando rede...");
    }
}