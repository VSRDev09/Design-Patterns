import java.util.ArrayList;
import java.util.List;

public class SoldadoGuerraSecessao implements Personagem {

    private final double ataqueRapido;
    private final double ataqueForca;
    private final double ataqueEspecial;
    private final double defesa;
    private final double moedas;
    private final boolean habilidade;
    private final List<Arma> armas;

    public double getAtaqueRapido() {
        return ataqueRapido;
    }

    public double getAtaqueForca() {
        return ataqueForca;
    }

    public double getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public double getDefesa() {
        return defesa;
    }

    public SoldadoGuerraSecessao(StarterBuilder builder) {
        this.ataqueRapido = builder.ataqueRapido;
        this.ataqueForca = builder.ataqueForca;
        this.ataqueEspecial = builder.ataqueEspecial;
        this.defesa = builder.defesa;
        this.moedas = builder.moedas;
        this.habilidade = builder.habilidade;
        this.armas = List.copyOf(builder.armas);

    }

    public static class StarterBuilder implements PersonagemBuilder{
        private double ataqueRapido = 15;
        private double ataqueForca = 30;
        private double ataqueEspecial = 75;
        private double defesa = 150;
        private double moedas = 200;
        private boolean habilidade = false;
        private List<Arma> armas = new ArrayList<>(List.of(new Bacamarte()));

        @Override
        public StarterBuilder setAtaqueRapido(double ataqueRapido){
            this.ataqueRapido = ataqueRapido;
            return this;
        }

        @Override
        public StarterBuilder setAtaqueForca(double ataqueForca){
            this.ataqueForca = ataqueForca;
            return this;
        }


        public StarterBuilder setAtaqueEspecial(double ataqueEspecial){
            this.ataqueEspecial = ataqueEspecial;
            return this;
        }

        public StarterBuilder setDefesa(double defesa){
            this.defesa = defesa;
            return this;
        }

        public StarterBuilder setMoedas(double moedas){
             this.moedas = moedas;
             return this;
        }

        public StarterBuilder setHabilidade(boolean habilidade){
            this.habilidade = habilidade;
            return this;
        }

        public StarterBuilder adicionarArma(Arma arma){
            this.armas.add(arma);
            return this;
        }

        public StarterBuilder setArmas(List<Arma> armas){
            this.armas = new ArrayList<>(armas);
            return this;
        }

        @Override
        public SoldadoGuerraSecessao build(){
            return new SoldadoGuerraSecessao(this);
        }

    }
}
