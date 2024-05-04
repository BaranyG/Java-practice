public class Player {
    String name;
    String[] hand = new String[2];

    public Player(String name, String[] hand){
        this.name = name;
        this.hand = hand;
    }

    public Player(String name){
        this.name = name;

        String[] deck = new Deck().deck;
        
        // Shuffle the deck2 array
        deck = Deck.shuffle(deck);

        // Print the shuffled deck2 deck
        for (String card : deck) {
            System.out.println(card);
        }
        
        this.hand[0] = deck[0];
        this.hand[1] = deck[1];
    }

    public Player(){
        this.name = "Joska";
        
        String[] deck = new Deck().deck;
        
        // Shuffle the deck2 array
        deck = Deck.shuffle(deck);

        // Print the shuffled deck2 deck
        for (String card : deck) {
            System.out.println(card);
        }
        
        this.hand[0] = deck[0];
        this.hand[1] = deck[1];
    }


}
