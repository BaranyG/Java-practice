import java.util.Random;

public class Deck {
    //String array[][];
    String[] deck = new String[52];

    public Deck(){
        String[][] cards = new String[][]{ {"Pikk", "Karo", "Treff", "Kor"}, {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"} };
//                                                    [0]                                         [1]
//                                                    [3]                                         [12]              
        // Convert from 2D cards array to 1D deck array
        int index = 0;
        for (String color : cards[0]){
            for (String card : cards[1]){
                deck[index++] = color + " " + card;
            }
        }
    }

    public static String[] shuffle(String[] array){
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++){
            int rand_int = rand.nextInt(array.length);
            while( rand_int == i ){
                rand_int = rand.nextInt(array.length);
            }
            String tmp = array[rand_int];    
            array[rand_int] = array[i];
            array[i] = tmp;
        }

        return array;
    }

}
