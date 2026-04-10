package FactoryMethod.Payment.factories;

import FactoryMethod.Payment.Payment;
import FactoryMethod.Payment.PaymentFactory;
import FactoryMethod.Payment.products.CreditCard;

public class BoletoFactory extends PaymentFactory{
    
    @Override
    public Payment createPayment(){
        return new CreditCard();
    }
}
