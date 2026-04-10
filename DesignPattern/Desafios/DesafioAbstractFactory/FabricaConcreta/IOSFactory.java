package FabricaConcreta;

import FabricaAbstrata.BackendFactory;
import IOSConcreto.ArmazenamentoIOS;
import IOSConcreto.AutenticacaoIOS;
import IOSConcreto.MediaPlayerIOS;
import Produtos.Armazenamento;
import Produtos.Autenticacao;
import Produtos.MediaPlayer;

public class IOSFactory extends BackendFactory{
    
    public Armazenamento createStorage(){
        return new ArmazenamentoIOS();
    }

    public MediaPlayer createMediaPlayer(){
        return new MediaPlayerIOS();
    }

    public Autenticacao createAutenticacao(){
        return new AutenticacaoIOS();
    }
}