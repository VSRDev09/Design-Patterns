package WebConcreto;

import Produtos.Armazenamento;

public class ArmazenamentoWeb implements Armazenamento {
    public void save(){
        System.out.println("Web Downloading");
    }
}