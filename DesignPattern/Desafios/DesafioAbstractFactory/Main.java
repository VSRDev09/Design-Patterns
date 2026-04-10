import FabricaConcreta.AndroidFactory;
import FabricaConcreta.IOSFactory;
import FabricaConcreta.WebFactory;

public class Main {
    
    public static void main(String[] args) {

        AndroidFactory android = new AndroidFactory();
        IOSFactory ios = new IOSFactory();
        WebFactory web = new WebFactory();

        // mudando o factory no método muda as famílias de objetos relacionados
        // que são geradas
        StreamingService streaming = new StreamingService(web);
        streaming.start();
    }
}
