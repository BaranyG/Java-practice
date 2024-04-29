public class App {
    public App(){

    }

    public static void main(String[] args) {
        new App();
        new Deck();
        Player joska = new Player();

        System.out.println(joska.name);
        System.out.println(joska.hand[0] + joska.hand[1] );

        new Frame();
    }
}
