public class Player {
    String name;
    String[] hand = new String[2];

    public Player(String name, String[] hand){
        this.name = name;
        this.hand = hand;
    }

    public Player(){
        this.name = "Joska";
        
        String[][] pakli = new Deck().pakli;
        String[] pakli2 = new String[52];
        
        // Convert from 2D pakli array to 1D pakli2 array
        int darab = 0;
        for (int i = 0; i < pakli[0].length; i++){
            String szin = pakli[0][i];
            for (int j = 0; j < pakli[1].length; j++) {
                String lap = szin + " " + pakli[1][j];
                pakli2[darab] = lap;
                darab++;
            }
        }

        // Shuffle the pakli2 array
        pakli2 = new Deck().shuffle(pakli2);

        // Print the shuffled pakli2 deck
        for (String card : pakli2) {
            System.out.println(card);
        }

        
        this.hand[0] = pakli2[0];
        this.hand[1] = pakli2[1];

    }


}


/* 
Treff 7
Kor 3
Pikk K
Karo 9
Kor J
Kor A
Karo 5
Karo 10
Karo 3
Pikk 9
Kor Q
Pikk 5
Pikk 2
Treff 2
Treff J
Karo A
Karo 8
Karo 2
Treff 6
Kor 6
Kor 2
Kor 9
Pikk Q
Kor 8
Pikk J
Treff Q
Treff 3
Kor 7
Pikk 4
Karo 6
Treff 4
Karo 7
Karo Q
Pikk 8
Kor 5
Pikk 7
Treff A
Treff 9
Pikk 3
Karo 4
Kor 4
Kor K
Karo J
Treff 8
Karo K
Treff 10
Pikk A
Treff 5
Pikk 10
Pikk 6
Kor 10
Treff K
*/