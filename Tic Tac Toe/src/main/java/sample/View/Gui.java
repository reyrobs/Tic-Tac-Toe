package sample.View;

import sample.Controller.buttonClearAction;
import main.java.sample.Controller.exitAction;
import sample.Controller.buttonActionListener;
import sample.Model.Button.buttonClear;
import sample.Model.Button.buttonExit;


import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private String playerTurn = "X";
    private int playerXScore = 0;
    private int playerOScore = 0;
    private JButton[] buttons;
    private JPanel panelT;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    /**
     * Creating the GUI
     */

    public Gui () {
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Simple Game");
        this.getContentPane().setLayout(null);
        this.setResizable(false);

        label1 = GenerateLabel1();
        this.add(label1);

        label2 = GenerateLabel2();
        this.add(label2);

        label3 = GenerateLabel3();
        this.add(label3);

        panelT = GeneratePanel();
        this.add(panelT);

        JPanel panel2 = GeneratePanel2();
        this.add(panel2);
        this.setVisible(true);
    }

    /**
     * Methods used to create labels and panels to add to the GUI
     */

        private JLabel GenerateLabel1() {
            JLabel label = new JLabel("TIC TAC TOE",SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 100));
            label.setLocation(0,0);
            label.setSize(1200, 100);
            label.setBackground(new Color(32,178,170));
            label.setOpaque(true);
            return label;
        }

        private JLabel GenerateLabel2() {
            JLabel label = new JLabel("Player X Score: " + getPlayerXScore(),SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 30));
            label.setLocation(900,100);
            label.setSize(300, 100);
            label.setBackground(this.getBackground());
            label.setOpaque(true);
            return label;
        }

        private JLabel GenerateLabel3() {
        JLabel label = new JLabel("Player O Score: " + getPlayerOScore(),SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setLocation(900,200);
        label.setSize(300, 100);
        label.setBackground(this.getBackground());
        label.setOpaque(true);
        return label;
        }

        public JPanel GeneratePanel() {
            JPanel panelGame = new JPanel();
            panelGame.setLayout(new java.awt.GridLayout(3, 3, 1, 1));
            panelGame.setLocation(0, 100);
            panelGame.setSize(900, 480);

        buttons = new JButton[9];
        Font font = new Font("Arial", Font.PLAIN, 150);

        for(int i=0; i<9; i++) {
            JButton button = new JButton();
            buttons[i] = button;
            button.addActionListener(new buttonActionListener(this, button));
            button.setFont(font);
            panelGame.add(button);
        }
        return panelGame;
    }

    private JPanel GeneratePanel2() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        panel.setLocation(900, 330);
        panel.setSize(300, 500);
        panel.setBackground(this.getBackground());
        buttonClear clear = new buttonClear();
        clear.addActionListener(new buttonClearAction(this));
        buttonExit exit = new buttonExit();
        exit.addActionListener(new exitAction());
        panel.add(clear);

        clear.setFont(new Font("Arial", Font.PLAIN, 30));
        exit.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(exit);
        clear.setOpaque(true);
        return panel;
    }

    /**
     * Method to reset the game
     */

    public void clearPanel() {
        for(int i=0; i<9; i++) {
            buttons[i].setText("");
            buttons[i].setBackground(new Color(238, 238, 238));
        }

        setPlayerTurn("X");
    }
    /**
     * Method to check for a draw
     */

    public int checkDraw() {
        for(int i=0; i<9; i++) {
            if(buttons[i].getText().equals("")) {
                return 1;
            }
        }
        return 0;
    }

    /**
     * Method to check for a winner
     */

    public int checkWinner() {
        if(buttons[0].getText()==buttons[1].getText() && buttons[1].getText() == buttons[2].getText() && !buttons[0].getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;
        }
        else if(buttons[3].getText()==buttons[4].getText() && buttons[4].getText() == buttons[5].getText() && !buttons[3].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;

        }
        else if(buttons[6].getText()==buttons[7].getText() && buttons[7].getText() == buttons[8].getText() && !buttons[6].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;

        }
        else if(buttons[0].getText()==buttons[3].getText() && buttons[3].getText() == buttons[6].getText() && !buttons[0].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;

        }
        else if(buttons[1].getText()==buttons[4].getText() && buttons[4].getText() == buttons[7].getText() && !buttons[1].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;

        }
        else if(buttons[2].getText()==buttons[5].getText() && buttons[5].getText() == buttons[8].getText() && !buttons[2].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;

        }
        else if(buttons[0].getText()==buttons[4].getText() && buttons[4].getText() == buttons[8].getText() && !buttons[0].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;
        }

        else if(buttons[6].getText()==buttons[4].getText() && buttons[4].getText() == buttons[2].getText() && !buttons[6].getText().equals("")){
            JOptionPane.showMessageDialog(null, "Player "+ getPlayerTurn() + " wins. Well done!");
            if(getPlayerTurn().equals("X")) {
                setPlayerXScore(getPlayerXScore()+1);
                label2.setText("Player X Score: " + getPlayerXScore());
            }
            else{
                setPlayerOScore(getPlayerOScore()+1);
                label3.setText("Player O Score: " + getPlayerOScore());
            }
            clearPanel();
            return 1;
        }
        return 0;
    }

    /**
     * Getters and setters method
     */

    public String getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(String playerTurn) {
        this.playerTurn = playerTurn;
    }

    public int getPlayerXScore() {
        return playerXScore;
    }

    public void setPlayerXScore(int playerXScore) {
        this.playerXScore = playerXScore;
    }

    public int getPlayerOScore() {
        return playerOScore;
    }

    public void setPlayerOScore(int playerOScore) {
        this.playerOScore = playerOScore;
    }
}