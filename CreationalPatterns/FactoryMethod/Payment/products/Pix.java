package FactoryMethod.Payment.products;

import FactoryMethod.Payment.Payment;

public class Pix implements Payment {
    
    @Override
    public void process(){
        System.out.println("Processando pix");
    }
}
