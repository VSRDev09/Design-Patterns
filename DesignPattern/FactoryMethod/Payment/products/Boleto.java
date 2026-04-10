package FactoryMethod.Payment.products;

import FactoryMethod.Payment.Payment;

public class Boleto implements Payment{
    
    @Override
    public void process(){
        System.out.println("Gerando novo boleto");
    }
}
