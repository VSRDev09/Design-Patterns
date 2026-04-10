package ConcreteFactory;


import DarkFactory.ButtonDark;
import DarkFactory.CardDark;
import DarkFactory.ModalDark;
import Factory.UIThemeFactory;
import Produtos.Button;
import Produtos.Card;
import Produtos.Modal;

public class DarkFactory implements UIThemeFactory {
    
    public Button createButton(){
        return new ButtonDark();
    }

    public Card createCard(){
        return new CardDark();
    }

    public Modal createModal(){
        return new ModalDark();
    }
}
