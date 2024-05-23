import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Builder.DeckBuilder;
import DTO.Deck;
import DTO.Player;
import Service.DeckOperations;
import Service.PlayerOperations;

public class Frame{

    public Frame(){
        

        
        Deck deck = new Deck(DeckBuilder.createDeck());

        DeckOperations deckOperations = new DeckOperations();

        deckOperations.shuffle(deck);

        PlayerOperations playerOperations = new PlayerOperations();


        Player player1 = new Player(deck);
        Player player2 = new Player("Moni", deck);

        // Create the main frame
        JFrame frame = new JFrame();
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
        JPanel buttonPanel = new JPanel();
        JButton buttonBet = new JButton("Bet");
        JButton buttonFold = new JButton("Fold");
        JButton buttonCall = new JButton("Call");
        JButton buttonRaise = new JButton("Raise");
        JButton buttonAllIn = new JButton("All In");
        JTextField playerName = new JTextField(10);
        buttonPanel.add(buttonBet);
        buttonPanel.add(buttonFold);
        buttonPanel.add(buttonCall);
        buttonPanel.add(buttonRaise);
        buttonPanel.add(buttonAllIn);
        buttonPanel.add(playerName);

        // Add action to the button
        buttonFold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame, "Button Clicked!");
                createGui(frame);
            }
        });

        
        // Create another panel with status
        JPanel statusPanel = new JPanel();
        JLabel label = new JLabel("Player: " + player1.name + " Keze: " + player1.hand1 + " es " + player1.hand2);
        JLabel label2 = new JLabel("Player: " + player2.name + " Keze: " + player2.hand1 + " es " + player2.hand2);
        statusPanel.add(label);
        statusPanel.add(label2);

        // Set layout for the main frame
        frame.setLayout(new BorderLayout());
        frame.setJMenuBar(menuBar);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(statusPanel, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
    protected static void createGui(JFrame frame){
        
        // Create the main frame
        //JFrame frame1 = new JFrame("DialogEx");
        //frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame1.setUndecorated(true);
        //frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame1.setVisible(true);
  
        JDialog nonModalDialog = new JDialog(frame, "Non-Modal Dialog", Dialog.ModalityType.MODELESS);
        nonModalDialog.add(Box.createRigidArea(new Dimension(200, 200)));
        nonModalDialog.pack();
        nonModalDialog.setLocationByPlatform(true);
        nonModalDialog.setVisible(true);
  
        JDialog modalDialog = new JDialog(frame, "Modal Dialog", Dialog.ModalityType.APPLICATION_MODAL);
        modalDialog.add(Box.createRigidArea(new Dimension(200, 200)));
        modalDialog.pack();
        modalDialog.setLocationByPlatform(true);
        modalDialog.setVisible(true);
    }


}
