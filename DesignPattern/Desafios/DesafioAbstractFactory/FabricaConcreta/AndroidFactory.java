package FabricaConcreta;

import AndroidConcreto.ArmazenamentoAndroid;
import AndroidConcreto.AutenticacaoAndroid;
import AndroidConcreto.MediaPlayerAndroid;
import FabricaAbstrata.BackendFactory;
import Produtos.Armazenamento;
import Produtos.Autenticacao;
import Produtos.MediaPlayer;

public class AndroidFactory extends BackendFactory{
    
    public Armazenamento createStorage(){
        return new ArmazenamentoAndroid();
    }

    public MediaPlayer createMediaPlayer(){
        return new MediaPlayerAndroid();
    }

    public Autenticacao createAutenticacao(){
        return new AutenticacaoAndroid();
    }
}
