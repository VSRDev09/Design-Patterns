package FactoryMethod.Payment;

import FactoryMethod.Payment.factories.BoletoFactory;
import FactoryMethod.Payment.factories.CreditCardFactory;
import FactoryMethod.Payment.factories.PixFactory;

public class Main {
    
    public static void main(String[] args) {
        
        PaymentFactory factory;

        factory = new PixFactory();
        factory.processPayment();

        factory = new BoletoFactory();
        factory.processPayment();

        factory = new CreditCardFactory();
        factory.processPayment();
        
    }
}
