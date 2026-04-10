package Factory;


import Produtos.Button;
import Produtos.Card;
import Produtos.Modal;

public interface UIThemeFactory {
    
    public Button createButton();
    public Card createCard();
    public Modal createModal();
}
