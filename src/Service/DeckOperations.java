package Service;
import java.util.ArrayList;
import java.util.Random;

import DTO.Deck;

public class DeckOperations {
    
    
    public DeckOperations() {

    }

 
    public void shuffle(Deck deckObject) {
        Random rand = new Random();

        ArrayList<String> deck = deckObject.getDeck();

        for (int i = 0; i < deck.size(); i++) {
            int randomInt = rand.nextInt(deck.size());
            String tmp = deck.get(randomInt);    
            deck.set(randomInt, deck.get(i));
            deck.set(i, tmp);
        }
        
    }
}
