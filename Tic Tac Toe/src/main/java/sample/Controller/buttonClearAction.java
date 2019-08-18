package sample.Controller;

import sample.View.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class buttonClearAction extends AbstractAction {

    private Gui gui;

    public buttonClearAction(Gui gui) {
        super();
        this.gui = gui;
    }


    public void actionPerformed(ActionEvent event) {
        gui.clearPanel();
    }
}
