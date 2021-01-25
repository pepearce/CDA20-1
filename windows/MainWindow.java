package windows;

import javax.swing.*;
import java.awt.*;

/**
 * Classe qui génère la fenêtre principale.
 *
 * */

public class MainWindow extends JFrame {

    //Interface components :
    JPanel contentPane;
    JTextField screen;
    JPanel calculatorPanel;

    // ActionPerformed variables :
    StringBuilder screenLine = new StringBuilder();

    /**
     * Constructeur qui permet de crée la fenêtre principale de la calculatrice
     *
     * */
    public MainWindow() {
        initControls();

        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new BorderLayout(10,10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        calculatorPanel = new JPanel(new BorderLayout());
        contentPane.setBackground(calculatorPanel.getBackground());
        contentPane.add(calculatorPanel, BorderLayout.CENTER);
        // Add screen :
        screen = new JTextField();
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false);
        screen.setText("0.25");
        screen.setFont(new Font("Arial", Font.BOLD, 50));
        screen.setText(screenLine.toString());
        calculatorPanel.add(screen, BorderLayout.NORTH);


        // Add buttons panel :
        ButtonsPanel buttonsPAnel = new ButtonsPanel();
        buttonsPAnel.addButtonsPanel(calculatorPanel, this);


    }

    /**
    * Methode qui permet d'initialiser la fenêtre principale
    *
    * */
    public void initControls() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setVisible(true);
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
    }





}
