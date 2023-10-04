package com.jquintero.myapplication.classes.class5;

public class Recursividad {

    public static int factorial(int numero) {
        if(numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
