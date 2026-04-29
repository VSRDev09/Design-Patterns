package Questao1.calendarios;
import java.time.LocalDate;

import Questao1.eventos.Evento;


public class CalendarioPessoal extends Calendario{
    
    private Evento evento;
    private String divisor = "////////////////////////////////";
    public CalendarioPessoal(Evento evento){
        this.evento = evento;
    }

    public CalendarioPessoal(){

    }

    public void sinalizarEventos(LocalDate of){
        evento.setInicio(of); 
        System.out.println("Evento " + evento.getDescricao() + " no dia " + evento.getDescricao());
        System.out.println(divisor);
    }
    public void download(String string){
        
        System.out.println("Baixando calendario pessoal " + string);
    }
}
