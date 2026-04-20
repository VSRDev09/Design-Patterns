public class Espada implements Arma{
    private final double danoAdicionalRapido = 15;
    private final double danoAdicionalForca = 20;
    private final double danoAdicionalEspecial =  30;
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
