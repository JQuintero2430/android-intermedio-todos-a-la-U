package com.jquintero.myapplication.classes.Class2;

public class Comparador {

    private int x;
    private int y;

    public Comparador(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void comparar() {
        if(x > y) {
            System.out.println("X es mayor que Y");
        } else if(x < y) {
            System.out.println("X es menor que Y");
        } else {
            System.out.println("X es igual a Y");
        }
    }
}
