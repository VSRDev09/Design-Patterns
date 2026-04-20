public interface PersonagemBuilder {
    PersonagemBuilder setAtaqueRapido(double ataqueRapido);
    PersonagemBuilder setAtaqueForca(double ataqueForca);
    PersonagemBuilder setAtaqueEspecial(double ataqueEspecial);
    Personagem build();
}
