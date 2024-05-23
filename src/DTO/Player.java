package DTO;
import Service.PlayerOperations;

public class Player {
    public String name;
    public String hand1;
    public String hand2;
    public int bet;




    public Player(Deck deck){
        this.name = "Joseph";

        PlayerOperations playerOperations = new PlayerOperations();

        this.hand1 = (playerOperations.draw(deck));
        this.hand2 = (playerOperations.draw(deck));
    }

    
    public Player(String name, Deck deck){
        this.name = name;

        PlayerOperations playerOperations = new PlayerOperations();

        this.hand1 = (playerOperations.draw(deck));
        this.hand2 = (playerOperations.draw(deck));
    }

}
