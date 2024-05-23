import java.util.ArrayList;

public class Dealer {
    
    public ArrayList<String> hand = new ArrayList<String>(5);

    public Dealer(){
        for (String card : hand){
            //card = Deck.draw();
            hand.add(card);
        }
    }
    
}
