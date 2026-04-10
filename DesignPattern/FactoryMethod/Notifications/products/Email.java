package FactoryMethod.Notifications.products;
import FactoryMethod.Notifications.*;

public class Email implements Notification{
    
    @Override
    public void send(){
        System.out.println("Sending email");
    }
}
