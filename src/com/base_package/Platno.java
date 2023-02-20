package com.base_package;

import javax.swing.*;
import java.awt.*;

public class Platno extends JPanel {

    public Platno() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(100, 100, 200, 200);
    }
}
