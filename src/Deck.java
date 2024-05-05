import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //String[] deck = new String[52];
    ArrayList<String> deck = new ArrayList<String>(52);


    public Deck(){
        String[][] cards = new String[][]{ 
            {"Pikk", "Karo", "Treff", "Kor"}, //[0][3]
            {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"} }; //[1][12]
                    
        // Convert from 2D cards array to ArrayList
        for (String color : cards[0]){
            for (String card : cards[1]){
                deck.add(color + " " + card) ;
            }
        }
    }
    

    public static ArrayList<String> shuffle(ArrayList<String> array){
        Random rand = new Random();
        
        for (int i = 0; i < array.size(); i++){
            int rand_int = rand.nextInt(array.size());
            String tmp = array.get(rand_int);    
            array.set(rand_int, array.get(i));
            array.set(i, tmp);
        }
        return array;
    }


    public static String draw(ArrayList<String> array){
        String card = array.get(array.size()-1);
        array.remove(array.size()-1);
        return card;
    }
}
