import java.util.Random;

public class Deck {
    //String array[][];
    String[] pakli = new String[52];

    public Deck(){
        String[][] kartyak = new String[][]{ {"Pikk", "Karo", "Treff", "Kor"}, {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"} };
//                                                    [0]                                         [1]
//                                                    [3]                                         [12]              
        // Convert from 2D kartyak array to 1D pakli array
        for (int i = 0; i < kartyak[0].length; i++){
            for (int j = 0; j < kartyak[1].length; j++) {
                pakli[((j+1)+(i*13))-1] = kartyak[0][i] + " " + kartyak[1][j];
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
