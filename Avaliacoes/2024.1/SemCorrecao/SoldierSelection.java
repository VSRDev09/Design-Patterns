public class SoldierSelection {

    public void init(PersonagemFactory factory){
        
        Personagem p1 = factory.criarPersonagem("Cruzado").build();
        System.out.println(p1.toString());
    }

}
