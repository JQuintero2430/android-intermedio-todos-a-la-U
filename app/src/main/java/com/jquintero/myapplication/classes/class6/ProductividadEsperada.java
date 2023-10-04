package com.jquintero.myapplication.classes.class6;

public class ProductividadEsperada {
    public static double energiaEsperada(double produccionActual, int aniosRestantes) {
        if (aniosRestantes == 0) {
            return produccionActual;
        } else {
            double nuevaProduccion = produccionActual * 1.1;
            return energiaEsperada(nuevaProduccion, aniosRestantes - 1);

        }
    }
}
