package ConcreteFactory;


import Factory.UIThemeFactory;
import LightFactory.ButtonLight;
import LightFactory.CardLight;
import LightFactory.ModalLight;
import Produtos.Button;
import Produtos.Card;
import Produtos.Modal;

public class LightFactory implements UIThemeFactory {
    
    public Button createButton(){
        return new ButtonLight();
    }

    public Card createCard(){
        return new CardLight();
    }

    public Modal createModal(){
        return new ModalLight();
    }
}
