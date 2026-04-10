package FactoryMethod.Notifications.factories;
import FactoryMethod.Notifications.*;
import FactoryMethod.Notifications.products.SMS;

public class SMSFactory extends NotificationFactory{
    
    @Override
    public Notification createNotification(){
        return new SMS();
    }
}
