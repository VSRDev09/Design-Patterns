package Prototype.ComRegistro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductRegistry registry = new ProductRegistry();

        List<String> marcas = new ArrayList<>();
        marcas.add("PC Gamer");
        marcas.add("Duravel");
        marcas.add("Eletronicos");
        Product notebook = new Product("Azus", 4500, marcas);
        registry.addRegistry("Notebook", notebook);

        marcas = new ArrayList<>();
        marcas.add("Entretenimento");
        marcas.add("Duravel");
        marcas.add("Eletronicos");
        Product console = new Product("Playstation", 3000, marcas);
        registry.addRegistry("Console", console);

        marcas = new ArrayList<>();
        marcas.add("periferico");
        marcas.add("Duravel");
        marcas.add("Eletronicos");
        Product controle = new Product("Dualshock", 150, marcas);
        registry.addRegistry("Controle", controle);

        Product notebook2 = (Product) registry.get("Notebook");
        notebook2.addTags("Entretenimento");

        notebook.show();
        notebook2.setNome("Lenovo");
        notebook2.show();
    }
}
