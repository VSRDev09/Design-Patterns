package Questao1.factories;

import Questao1.calendarios.Calendario;
import Questao1.eventos.Evento;

public interface CalendarioEventoFactory {

    Calendario criarCalendario(Evento evento);
    Evento criarEvento();
} 
