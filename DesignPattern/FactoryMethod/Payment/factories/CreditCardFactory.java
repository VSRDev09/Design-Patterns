package FactoryMethod.Payment.factories;
import FactoryMethod.Payment.*;
import FactoryMethod.Payment.products.CreditCard;

public class CreditCardFactory extends PaymentFactory{
    
    @Override
    public Payment createPayment(){
        return new CreditCard();
    }
}
