package FactoryMethod.Notifications.products;
import FactoryMethod.Notifications.*;

public class SMS implements Notification{
    
     @Override
    public void send(){
        System.out.println("Sending SMS");
    }
}
