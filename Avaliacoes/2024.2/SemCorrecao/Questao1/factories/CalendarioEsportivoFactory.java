package Questao1.factories;

import Questao1.calendarios.Calendario;
import Questao1.calendarios.CalendarioEsportivo;
import Questao1.eventos.Evento;
import Questao1.eventos.Partida;

public class CalendarioEsportivoFactory implements CalendarioEventoFactory{
    
    public Evento criarEvento(){
        return new Partida();
    }

    public Calendario criarCalendario(Evento evento){
        return new CalendarioEsportivo(evento);
    }
}
