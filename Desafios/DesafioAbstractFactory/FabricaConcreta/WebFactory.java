package FabricaConcreta;

import FabricaAbstrata.BackendFactory;
import Produtos.Armazenamento;
import Produtos.Autenticacao;
import Produtos.MediaPlayer;
import WebConcreto.ArmazenamentoWeb;
import WebConcreto.AutenticacaoWeb;
import WebConcreto.MediaPlayerWeb;

public class WebFactory extends BackendFactory{
    
    public Armazenamento createStorage(){
        return new ArmazenamentoWeb();
    }

    public MediaPlayer createMediaPlayer(){
        return new MediaPlayerWeb();
    }

    public Autenticacao createAutenticacao(){
        return new AutenticacaoWeb();
    }
}