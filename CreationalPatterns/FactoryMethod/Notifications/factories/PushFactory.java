package FactoryMethod.Notifications.factories;

import FactoryMethod.Notifications.*;
import FactoryMethod.Notifications.products.Push;

public class PushFactory extends NotificationFactory{
    
    @Override
    public Notification createNotification(){
        return new Push();
    }
}
