package Prototype.ComRegistro;

import java.util.ArrayList;
import java.util.List;

public class Product implements Prototype{
    
    private String nome;
    private double preco;
    private List<String> tags;

    public Product(){

    }

    public Product(String nome, double preco, List<String> tags){
        this.nome = nome;
        this.preco = preco;
        this.tags = tags;
    }

    public Product(Product outro){
        this.nome = outro.nome;
        this.preco = outro.preco;
        this.tags = new ArrayList<>(outro.tags);
    }

    @Override
    public Prototype clone(){
        return new Product(this);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addTags(String tag){
        tags.add(tag);
    }

    public void show(){
        System.out.println("Produto: " + nome
                            + "\nPreco: " + preco
                            + "\n Tags: " + tags
        );
    }
}
