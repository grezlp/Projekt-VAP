package com.base_package;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Platno extends JPanel {

    private BufferedImage menuImage;

    public Platno() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            menuImage = ImageIO.read(new File("./img/menu_background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(menuImage,0,0,this);

    }
}
