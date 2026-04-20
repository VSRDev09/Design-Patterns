import java.util.List;

public class PersonagemFactory {

    public static PersonagemBuilder criarPersonagem(String tipoSoldado) {
        if (tipoSoldado.equalsIgnoreCase("Cruzado")) {
            return new Cruzado.StarterBuilder();
        }

        if (tipoSoldado.equalsIgnoreCase("SoldadoGuerraSecessao")) {
            return new SoldadoGuerraSecessao.StarterBuilder();
        }
        if (tipoSoldado.equalsIgnoreCase("SoldadoGuerraGolfo")) {
            return new SoldadoGuerraGolfo.StarterBuilder();
        }
        throw new IllegalArgumentException("Tipo inválido");
    }

    public static PersonagemBuilder criarPersonagem(String tipoSoldado, List<Arma> armas) {
        if (tipoSoldado.equalsIgnoreCase("Cruzado")) {
            return new Cruzado.StarterBuilder().setArmas(armas);
        }

        if (tipoSoldado.equalsIgnoreCase("SoldadoGuerraSecessao")) {
            return new SoldadoGuerraSecessao.StarterBuilder().setArmas(armas);
        }
        if (tipoSoldado.equalsIgnoreCase("SoldadoGuerraGolfo")) {
            return new SoldadoGuerraGolfo.StarterBuilder().setArmas(armas);
        }
        throw new IllegalArgumentException("Tipo inválido");
    }
}
