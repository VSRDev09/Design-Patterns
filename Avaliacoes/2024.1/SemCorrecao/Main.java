public class Main {
    public static void main(String[] args) {
        SoldierSelection app = new SoldierSelection();
        PersonagemFactory factory = new PersonagemFactory();
        app.init(factory);
    }
}
