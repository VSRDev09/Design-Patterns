package FactoryMethod.Payment.products;

import FactoryMethod.Payment.Payment;

public class CreditCard implements Payment{
    
    @Override
    public void process(){
        System.out.println("Processando cartao de credito");
    }
}
