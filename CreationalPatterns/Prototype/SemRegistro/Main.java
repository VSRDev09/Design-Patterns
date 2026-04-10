package Prototype.SemRegistro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> marcas = new ArrayList<>();
        marcas.add("PC Gamer");
        marcas.add("Duravel");
        marcas.add("Eletronicos");
        Product notebook = new Product("Azus", 4500, marcas);

        notebook.show();

        Product notebook1 = (Product) notebook.clone();
        System.out.println("Clone: ");
        notebook1.show();

    }
}
