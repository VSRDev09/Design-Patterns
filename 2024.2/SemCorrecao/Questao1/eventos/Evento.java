package Questao1.eventos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Evento {
    protected String descricao;
    protected LocalDate inicio = LocalDate.now();
    protected LocalDateTime fim = LocalDateTime.now().plusHours(2);
    protected int prioridade = 5;
    protected boolean concluido = false;
    protected String localizacao = "Salvador - Bahia";

    public String getDescricao() {
        return this.descricao;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
}
