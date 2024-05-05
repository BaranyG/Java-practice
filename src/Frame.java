import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame{

    public Frame(){
        ArrayList<String> deck = new Deck().deck;
        Deck.shuffle(deck);
        
        Player joseph = new Player("Joska", Deck.draw(deck), Deck.draw(deck));
        Player moni = new Player("Moni", Deck.draw(deck), Deck.draw(deck));

        // Create the main frame
        JFrame frame = new JFrame("JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Poker Game");

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Create a panel with a button
        JPanel panel = new JPanel();
        JButton buttonBet = new JButton("Bet");
        JButton buttonFold = new JButton("Fold");
        JButton buttonCall = new JButton("Call");
        JButton buttonRaise = new JButton("Raise");
        JButton buttonAllIn = new JButton("All In");
        panel.add(buttonBet);
        panel.add(buttonFold);
        panel.add(buttonCall);
        panel.add(buttonRaise);
        panel.add(buttonAllIn);

        // Add action to the button
        buttonFold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        
        // Create another panel with text

        JPanel textPanel = new JPanel();
        JLabel label = new JLabel("Player: " + joseph.name + " Keze: " + joseph.hand1 + " es " + joseph.hand2);
        JLabel label2 = new JLabel("Player: " + moni.name + " Keze: " + moni.hand1 + " es " + moni.hand2);
        textPanel.add(label);
        textPanel.add(label2);

        // Set layout for the main frame
        frame.setLayout(new BorderLayout());
        frame.setJMenuBar(menuBar);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(textPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
