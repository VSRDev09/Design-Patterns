package Questao1.factories;

import Questao1.eventos.*;

public class ReuniaoFactory implements EventoFactory {
    
    public Evento criarEvento(){
        return new Reuniao();
    }
}
