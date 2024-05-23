import java.util.ArrayList;

public class DeckBuilder {
    
    private DeckBuilder(){
        
    }

    
    public  ArrayList<String> createDeck(){
        ArrayList<String> deck = new ArrayList<String>(52);
        
        String[][] cards = new String[][]{ 
            {"Pikk", "Karo", "Treff", "Kor"}, //[0][3]
            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"} }; //[1][12]
                    
        // Convert from 2D Array cards to ArrayList deck
        for (String color : cards[0]){
            for (String card : cards[1]){
                deck.add(color + " " + card) ;
            }
        }

        return deck;
    }
}
