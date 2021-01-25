package windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui implémente "ActionListener" et qui permet de répondre à une action sur les boutons
 *
 * @implNote implémente la classe ActionListener
 */
class AppActionListener implements ActionListener {
    private final MainWindow mainWindow;
    private StringBuilder screenLine;
    private JTextField screen;

    public AppActionListener(MainWindow mainWindow, StringBuilder screenLine, JTextField screen) {
        this.mainWindow = mainWindow;
        this.screenLine = screenLine;
        this.screen = screen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Algo.calculatorAlgo(e, this.screenLine, this.screen);
    }
}
