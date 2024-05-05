import java.util.ArrayList;

public class Player {
    String name;
    String hand1;
    String hand2;

    public Player(String name, String hand1, String hand2){
        this.name = name;
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public Player(String name){
        this.name = name;

        ArrayList<String> deck = new Deck().deck;
        
        // Shuffle the deck array
        deck = Deck.shuffle(deck);
        
        this.hand1 = deck.get(0);
        this.hand2 = deck.get(1);
    }

    public Player(String hand1, String hand2){
        this.name = "Joseph";
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public Player(){
        this.name = "Joseph";
        
        ArrayList<String> deck = new Deck().deck;

        // Shuffle the deck array
        deck = Deck.shuffle(deck);
        
        this.hand1 = deck.get(0);
        this.hand2 = deck.get(1);
    }
}
