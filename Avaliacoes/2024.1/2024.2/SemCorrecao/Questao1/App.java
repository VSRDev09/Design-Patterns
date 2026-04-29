package Questao1;

import java.time.LocalDate;

import Questao1.calendarios.Calendario;
import Questao1.eventos.*;
import Questao1.factories.CalendarioEsportivoFactory;
import Questao1.factories.CalendarioEventoFactory;
import Questao1.factories.CalendarioPessoalFactory;
import Questao1.factories.ReuniaoFactory;

public class App{
    
    public void run(CalendarioEventoFactory factory){
        
        Evento evento = factory.criarEvento();
        Calendario calendario = factory.criarCalendario(evento);
        calendario.download("calendar.ifba.edu.br");
        calendario.sinalizarEventos(LocalDate.of(LocalDate.now().getYear(),
  LocalDate.now().getMonth(),
  1));

} 
    public static void main(String[] args) {
        App app = new App();
        app.run(new CalendarioPessoalFactory(new ReuniaoFactory()));
        app.run(new CalendarioEsportivoFactory());
       
    }
}