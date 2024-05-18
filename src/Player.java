import java.util.ArrayList;

public class Player {
    String name;
    String hand1;
    String hand2;


    public Player(){
        this.name = "Joseph";
        
        ArrayList<String> deck = Deck.get().deck;
        
        this.hand1 = Deck.draw(deck);
        this.hand2 = Deck.draw(deck);
    }

    
    public Player(String name){
        this.name = name;

        ArrayList<String> deck = Deck.get().deck;
        
        this.hand1 = Deck.draw(deck);
        this.hand2 = Deck.draw(deck);
    }

}
