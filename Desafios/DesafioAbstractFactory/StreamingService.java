import FabricaAbstrata.BackendFactory;
import Produtos.Armazenamento;
import Produtos.Autenticacao;
import Produtos.MediaPlayer;

public class StreamingService {

    private final Autenticacao auth;
    private final Armazenamento storage;
    private final MediaPlayer player;

    public StreamingService(BackendFactory factory) {
        this.auth = factory.createAutenticacao();
        this.storage = factory.createStorage();
        this.player = factory.createMediaPlayer();
    }

    public void start() {
        auth.auth();
        storage.save();
        player.play();
    }
}
