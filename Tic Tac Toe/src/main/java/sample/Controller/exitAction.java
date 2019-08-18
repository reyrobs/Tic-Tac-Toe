package main.java.sample.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class exitAction extends AbstractAction {

    public exitAction() {
        super();
    }

    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
}
