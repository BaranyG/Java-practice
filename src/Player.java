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
        pakli2 = Deck.shuffle(pakli2);

        // Print the shuffled pakli2 deck
        for (String card : pakli2) {
            System.out.println(card);
        }
        
        this.hand[0] = pakli2[0];
        this.hand[1] = pakli2[1];

    }


}
