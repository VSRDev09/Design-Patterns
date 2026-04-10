

import Factory.UIThemeFactory;
import Produtos.Button;
import Produtos.Card;
import Produtos.Modal;

public class Application {
    
    private Button button;
    private Card card;
    private Modal modal;

    public Application(UIThemeFactory factory){

        button = factory.createButton();
        card = factory.createCard();
        modal = factory.createModal();

    }

    public void render(){
        
        button.render();
        card.show();
        modal.pop();
    }
}
