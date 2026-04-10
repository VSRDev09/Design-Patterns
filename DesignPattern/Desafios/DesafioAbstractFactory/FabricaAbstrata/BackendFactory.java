package FabricaAbstrata;

import Produtos.Armazenamento;
import Produtos.Autenticacao;
import Produtos.MediaPlayer;

public abstract class BackendFactory {
    
    public abstract Armazenamento createStorage();
    public abstract Autenticacao createAutenticacao();
    public abstract MediaPlayer createMediaPlayer();

    
}
