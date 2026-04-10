package Builder.ComDiretor;

public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    
    public void setTitulo(String t) { this.titulo = t; }
    public void setCorpo(String c) { this.corpo = c; }
    public void setRodape(String r) { this.rodape = r; }

    @Override
    public String toString() {
        return "Relatorio [Titulo=" + titulo + ", Corpo=" + corpo + ", Rodape=" + rodape + "]";
    }
}


