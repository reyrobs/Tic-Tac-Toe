package main.java.sample.Controller;

import main.java.sample.View.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class buttonActionListener extends AbstractAction {

    private Gui gui;
    private JButton button;

    public buttonActionListener(Gui gui, JButton button) {
        super();
        this.gui = gui;
        this.button = button;
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                if(button.getText().equals("")) {
                    button.setBackground(new Color(255, 116, 30));
                    button.setOpaque(true);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(button.getText().equals("")) {
                    button.setOpaque(false);
                    button.setFocusPainted(false);
                    button.setBorderPainted(true);
                    button.setBackground(Color.white);
                }
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        if (gui.getPlayerTurn().equals("O")  && button.getText().equals("")) {
            button.setText("O");
            button.setBackground(Color.lightGray);
           if(gui.checkWinner()==0) {
               gui.setPlayerTurn("X");
           }
        }

        else if(gui.getPlayerTurn().equals("X") && button.getText().equals("")) {
            button.setText("X");
            button.setBackground(Color.lightGray);
            if(gui.checkWinner()==0) {
                gui.setPlayerTurn("O");
            }
        }
        if(gui.checkDraw()==0) {
            JOptionPane.showMessageDialog(null, "It's a draw, nobody wins");
            gui.clearPanel();
        }
    }
}