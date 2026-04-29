package Questao1.calendarios;

import java.time.LocalDate;

import Questao1.Email;


public abstract class Calendario{
    protected int mes;
    protected int ano;
    protected boolean notification;
    protected Email proprietario;

    public abstract void sinalizarEventos(LocalDate of);
    public abstract void download(String string);
}