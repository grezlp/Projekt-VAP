package com.base_package;


import java.awt.*;

public class hra {
    private Platno platno;
    private Ramecek ramecek;
    private MyMenu menu;

    public hra(){
        platno = new Platno();
        menu = new MyMenu();
        ramecek = new Ramecek(platno, menu);
    }

}
