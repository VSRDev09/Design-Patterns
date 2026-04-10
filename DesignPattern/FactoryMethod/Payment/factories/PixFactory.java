package FactoryMethod.Payment.factories;
import FactoryMethod.Payment.Payment;
import FactoryMethod.Payment.PaymentFactory;
import FactoryMethod.Payment.products.Pix;

public class PixFactory extends PaymentFactory{
    
    @Override
    public Payment createPayment(){
        return new Pix();
    }
}
