public class Player {
    String name;
    String[] hand = new String[2];

    public Player(String name, String[] hand){
        this.name = name;
        this.hand = hand;
    }

    public Player(){
        String[][] pakli = new Deck().pakli;
        
        this.name = "Joska";

        this.hand[0] = pakli[0][0];
        this.hand[0] += pakli[1][0];

        this.hand[1] = pakli[0][1];
        this.hand[1] += pakli[1][1];


        
    }
}

