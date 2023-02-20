package com.base_package;

public class hra {
    private Platno platno;
    private Ramecek ramecek;

    public hra(){
        platno = new Platno();
        ramecek = new Ramecek(platno);
    }

}
