public class Player {
    String name;
    String[] hand = new String[2];

    public Player(String name, String[] hand){
        this.name = name;
        this.hand = hand;
    }

    public Player(String name){
        this.name = name;

        String[] pakli = new Deck().pakli;
        
        // Shuffle the pakli2 array
        pakli = Deck.shuffle(pakli);

        // Print the shuffled pakli2 deck
        for (String card : pakli) {
            System.out.println(card);
        }
        
        this.hand[0] = pakli[0];
        this.hand[1] = pakli[1];
    }

    public Player(){
        this.name = "Joska";
        
        String[] pakli = new Deck().pakli;
        
        // Shuffle the pakli2 array
        pakli = Deck.shuffle(pakli);

        // Print the shuffled pakli2 deck
        for (String card : pakli) {
            System.out.println(card);
        }
        
        this.hand[0] = pakli[0];
        this.hand[1] = pakli[1];
    }


}
