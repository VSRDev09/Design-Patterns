package Questao1.calendarios;

import java.time.LocalDate;

import Questao1.eventos.Evento;


public class CalendarioEsportivo extends Calendario{
    
    private Evento evento;

    public CalendarioEsportivo(Evento evento){
        this.evento = evento;
    }

    public CalendarioEsportivo(){

    }

    public void sinalizarEventos(LocalDate of){
        evento.setInicio(of); 
        System.out.println("Evento " + evento.getDescricao() + " no dia " + evento.getDescricao());
    }
    public void download(String string){
        System.out.println("Baixando calendario esportivo " + string);
    }
}
