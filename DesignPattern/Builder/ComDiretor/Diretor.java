package Builder.ComDiretor;

class Diretor {
    
    private RelatorioBuilder builder;

    public Diretor(RelatorioBuilder builder) {
        this.builder = builder;
    }

    
    public void construirRelatorioCompleto() {
        builder.buildTitulo();
        builder.buildCorpo();
        builder.buildRodape();
    }

    
    public void construirRelatorioSimples() {
        builder.buildTitulo();
        builder.buildCorpo();
    }
}
