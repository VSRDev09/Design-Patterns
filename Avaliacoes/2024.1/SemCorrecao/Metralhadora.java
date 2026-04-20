public class Metralhadora implements Arma{
    private final double danoAdicionalRapido = 20;
    private final double danoAdicionalForca = 5;
    private final double danoAdicionalEspecial =  50;
    private final boolean habilitada = true;

    public double getAdicionalRapido(){
        return danoAdicionalRapido;
    }

    public double getAdicionalForca(){
        return danoAdicionalForca;
    }

    public double getAdicionalEspecial(){
        return danoAdicionalEspecial;
    }

    public boolean habilidade(){
        return habilitada;
    }

   
}
