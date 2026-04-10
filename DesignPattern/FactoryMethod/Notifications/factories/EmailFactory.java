package FactoryMethod.Notifications.factories;
import FactoryMethod.Notifications.*;
import FactoryMethod.Notifications.products.Email;

public class EmailFactory extends NotificationFactory {
    
    @Override
    public Notification createNotification(){
        return new Email();
    }
}
