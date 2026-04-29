package Questao1.factories;


import Questao1.eventos.*;

public class PartidaFactory implements EventoFactory{

    public Evento criarEvento(){
        return new Partida();
    }
}
