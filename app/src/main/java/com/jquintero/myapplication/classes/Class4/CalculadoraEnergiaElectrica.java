package com.jquintero.myapplication.classes.Class4;

public class CalculadoraEnergiaElectrica {

    private double altura;
    private double masaAgua;
    private final double GRAVEDAD = 9.81;

    public CalculadoraEnergiaElectrica(double masaAgua, double altura ) {
        this.altura = altura;
        this.masaAgua = masaAgua;
    }

    public double calcularaEnergiaElectrica() {
        return altura * masaAgua * GRAVEDAD;
    }
}
