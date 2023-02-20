package com.base_package;

import javax.swing.*;

public class Ramecek {
    private JFrame jframe;

    public Ramecek(Platno platno){
        jframe = new JFrame();

        jframe.setSize(400,400);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(platno);
        jframe.setVisible(true);
    }
}
