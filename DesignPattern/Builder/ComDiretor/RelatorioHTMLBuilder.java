package Builder.ComDiretor;

class RelatorioHTMLBuilder implements RelatorioBuilder {

    private Relatorio relatorio = new Relatorio();

    public void buildTitulo() { relatorio.setTitulo("<h1>Título HTML</h1>"); }
    public void buildCorpo() { relatorio.setCorpo("<p>Parágrafo de texto HTML</p>"); }
    public void buildRodape() { relatorio.setRodape("<footer>Link de Contato</footer>"); }
    public Relatorio getRelatorio() { return relatorio; }
}
