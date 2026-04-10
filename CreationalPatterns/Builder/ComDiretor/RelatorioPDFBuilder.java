package Builder.ComDiretor;

class RelatorioPDFBuilder implements RelatorioBuilder {

    private Relatorio relatorio = new Relatorio();

    public void buildTitulo() { relatorio.setTitulo("PDF: Cabeçalho com Logo"); }
    public void buildCorpo() { relatorio.setCorpo("Conteúdo formatado em colunas PDF"); }
    public void buildRodape() { relatorio.setRodape("Página 1 de 10 (PDF)"); }
    public Relatorio getRelatorio() { return relatorio; }
}
