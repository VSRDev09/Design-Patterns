package FactoryMethod.Payment;

public abstract class PaymentFactory {
    
    public abstract Payment createPayment();

    public void processPayment(){

        Payment payment = createPayment();
        payment.process();
    }

}
