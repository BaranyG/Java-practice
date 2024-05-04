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
        
        // Shuffle the deck array
        deck = Deck.shuffle(deck);
        
        this.hand[0] = deck[0];
        this.hand[1] = deck[1];
    }

    public Player(){
        this.name = "Joska";
        
        String[] deck = new Deck().deck;
        
        // Shuffle the deck array
        deck = Deck.shuffle(deck);

        
        this.hand[0] = deck[0];
        this.hand[1] = deck[1];
    }


}
