package Questao1.factories;

import Questao1.calendarios.Calendario;
import Questao1.calendarios.CalendarioPessoal;
import Questao1.eventos.Evento;

public class CalendarioPessoalFactory implements CalendarioEventoFactory {

    EventoFactory factory;

    public CalendarioPessoalFactory(EventoFactory factory) {
        this.factory = factory;
    }

    public Evento criarEvento() {

        return factory.criarEvento();
    }

    public Calendario criarCalendario(Evento evento) {
        return new CalendarioPessoal(evento);
    }
}
