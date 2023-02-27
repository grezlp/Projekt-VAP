package com.base_package;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyMenu extends JPanel{
    private JLabel gameName = new JLabel("lol");
    private JButton buttonStart = new JButton("A");
    private JButton buttonCredits = new JButton("B");
    private JButton buttonExit = new JButton("A");

    public MyMenu(){
        this.setMaximumSize(new Dimension(200,200));
        this.add(gameName);
        this.add(buttonStart);
        this.add(buttonCredits);
        this.add(buttonExit);
    }
}
