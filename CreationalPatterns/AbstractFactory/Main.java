
import java.util.Scanner;

import ConcreteFactory.DarkFactory;
import ConcreteFactory.LightFactory;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String theme;
        Application app;

        System.out.println("Informe o tema (Dark ou Light): ");
        theme = sc.nextLine();

        if (theme.equals("Dark")){
            app = new Application(new DarkFactory());
            app.render();
        } else
        if (theme.equals("Light")){
            app = new Application(new LightFactory());
            app.render();  
        }
        
        sc.close();

        


    }

}
