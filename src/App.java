import javax.swing.JFrame;

public class App {
    public App(){

    }

    public static void main(String[] args) {
        new App();
        new Deck();
        Player joska = new Player();

        System.out.println(joska.name);
        System.out.println(joska.hand[0] + joska.hand[1] );



        
        JFrame frame = new JFrame();
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Frame");
        frame.setVisible(true);
    }
}
