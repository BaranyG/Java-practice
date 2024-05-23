import java.util.ArrayList;

public class Deck {   
    private ArrayList<String> deck = new ArrayList<String>(52);


    public Deck(ArrayList<String> deck){
        this.deck = deck;
    }

    public ArrayList<String> getDeck(){
        return deck;
    }
}
