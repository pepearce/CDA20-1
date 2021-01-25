package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Classe contenant les méthodes spécifiques au panneau de boutons de la calculatrice.
 *
 * */


public class ButtonsPanel {
    JPanel buttons;
    GroupLayout buttonsLayout;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMulti;
    JButton buttonDivi;
    JButton buttonDel;
    JButton buttonC;
    JButton buttonCE;
    JButton buttonModulo;
    JButton buttonDiviX;
    JButton buttonSq;
    JButton buttonSqRt;
    JButton buttonEqual;
    JButton buttonSign;
    JButton buttonDot;
    AbstractAction buttonPressed = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            button.doClick();
        }
    };



    /**
     * Methode qui permet d'ajouter le panneau de boutons à la calculatrice
     *
     * */
    public void addButtonsPanel(JPanel calculatorPanel, MainWindow mainWindow) {
        buttons = new JPanel();
        buttonsLayout = new GroupLayout(buttons);
        buttonsLayout.setAutoCreateGaps(true);
        buttonsLayout.setAutoCreateGaps(true);
        buttons.setLayout(buttonsLayout);
        calculatorPanel.add(buttons, BorderLayout.CENTER);




        button0 = new JButton("0");
        button0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "button0");
        button0.getActionMap().put("button0", buttonPressed);
        button0.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button1 = new JButton("1");
        button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "button1");
        button1.getActionMap().put("button1", buttonPressed);
        button1.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button2 = new JButton("2");
        button2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "button2");
        button2.getActionMap().put("button2", buttonPressed);
        button2.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button3 = new JButton("3");
        button3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "button3");
        button3.getActionMap().put("button3", buttonPressed);
        button3.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button4 = new JButton("4");
        button4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "button4");
        button4.getActionMap().put("button4", buttonPressed);
        button4.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button5 = new JButton("5");
        button5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "button5");
        button5.getActionMap().put("button5", buttonPressed);
        button5.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button6 = new JButton("6");
        button6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "button6");
        button6.getActionMap().put("button6", buttonPressed);
        button6.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button7 = new JButton("7");
        button7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "button7");
        button7.getActionMap().put("button7", buttonPressed);
        button7.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button8 = new JButton("8");
        button8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "button8");
        button8.getActionMap().put("button8", buttonPressed);
        button8.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        button9 = new JButton("9");
        button9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "button9");
        button9.getActionMap().put("button9", buttonPressed);
        button9.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonPlus = new JButton("+");
        buttonPlus.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "buttonPlus");
        buttonPlus.getActionMap().put("buttonPlus", buttonPressed);
        buttonPlus.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonMinus = new JButton("-");
        buttonMinus.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "buttonMinus");
        buttonMinus.getActionMap().put("buttonMinus", buttonPressed);
        buttonMinus.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonMulti = new JButton("*");
        buttonMulti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "buttonMulti");
        buttonMulti.getActionMap().put("buttonMulti", buttonPressed);
        buttonMulti.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonDivi = new JButton("/");
        buttonDivi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "buttonDivi");
        buttonDivi.getActionMap().put("buttonDivi", buttonPressed);
        buttonDivi.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonDel = new JButton("Del");
        buttonDel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "buttonDel");
        buttonDel.getActionMap().put("buttonDel", buttonPressed);
        buttonDel.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonC = new JButton("C");
        buttonC.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "buttonC");
        buttonC.getActionMap().put("buttonC", buttonPressed);
        buttonC.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonCE = new JButton("CE");
        buttonCE.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, InputEvent.SHIFT_DOWN_MASK), "buttonCE");
        buttonCE.getActionMap().put("buttonCE", buttonPressed);
        buttonCE.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonModulo = new JButton("%");
        buttonModulo.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonDiviX = new JButton("1/x");
        buttonDiviX.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonSq = new JButton("sq(x)");
        buttonSq.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonSqRt = new JButton("SqRt(x)");
        buttonSqRt.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonEqual = new JButton("=");
        buttonEqual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "buttonEqual");
        buttonEqual.getActionMap().put("buttonEqual", buttonPressed);
        buttonEqual.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonSign = new JButton("+/-");
        buttonSign.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        buttonDot = new JButton(".");
        buttonDot.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "buttonDot");
        buttonDot.getActionMap().put("buttonDot", buttonPressed);
        buttonDot.addActionListener(new AppActionListener(mainWindow, mainWindow.screenLine, mainWindow.screen));

        addButtonsToLayout();
    }


    /**
     * Methode qui permet d'ajouter les boutons en GroupeLayout dans le panneau de boutons
     * */
    public void addButtonsToLayout() {
        buttonsLayout.setHorizontalGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonModulo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDiviX, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button7, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSign, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonCE, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSq, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button8, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button0, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonC, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSqRt, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button9, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button6, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDot, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonDel, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDivi, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMulti, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMinus, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPlus, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEqual, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        buttonsLayout.setVerticalGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonModulo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCE, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonC, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDel, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonDiviX, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSq, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSqRt, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDivi, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(button7, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button8, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button9, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMulti, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(button4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button6, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMinus, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(button1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPlus, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(buttonsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(buttonSign, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button0, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDot, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEqual, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }
}
