package com.base_package;

import javax.swing.*;
import java.awt.*;

public class Ramecek {
    private JFrame jframe;

    public Ramecek(Platno platno, MyMenu menu){
        jframe = new JFrame();
        jframe.setSize(1920,1080);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setExtendedState(jframe.MAXIMIZED_BOTH);
        jframe.add(platno);
        jframe.add(menu);
        jframe.setVisible(true);
    }
}
