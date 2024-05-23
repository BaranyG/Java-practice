package Service;
import java.util.ArrayList;

import DTO.Deck;

public class PlayerOperations {
    
    
    public String draw(Deck deckObject){
        ArrayList<String> deck = deckObject.getDeck();

        String card = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return card;
    }
}
