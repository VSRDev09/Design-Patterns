package Builder.ComDiretor;

public class Main {
    public static void main(String[] args) {
        
        RelatorioBuilder builder = new RelatorioPDFBuilder();
        
        
        Diretor diretor = new Diretor(builder);
        diretor.construirRelatorioCompleto();
        
        
        Relatorio relatorioFinal = builder.getRelatorio();
        System.out.println(relatorioFinal);

        builder = new RelatorioHTMLBuilder();

        diretor = new Diretor(builder);
        diretor.construirRelatorioCompleto();
        
        
        relatorioFinal = builder.getRelatorio();
        System.out.println(relatorioFinal);
    }
}

