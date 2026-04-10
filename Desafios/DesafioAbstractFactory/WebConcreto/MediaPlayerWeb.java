package WebConcreto;

import Produtos.MediaPlayer;

public class MediaPlayerWeb implements MediaPlayer{
    public void play(){
        System.out.println("Reproduzindo midia na rede");
    }
}