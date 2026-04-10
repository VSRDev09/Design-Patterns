package FactoryMethod.Notifications.products;
import FactoryMethod.Notifications.*;

public class Push implements Notification{
    
     @Override
    public void send(){
        System.out.println("Sending push");
    }
}
