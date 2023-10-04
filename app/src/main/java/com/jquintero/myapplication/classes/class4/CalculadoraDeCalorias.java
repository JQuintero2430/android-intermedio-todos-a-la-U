package com.jquintero.myapplication.classes.class4;

public class CalculadoraDeCalorias {
    private double pesoUsuario;
    int tiempo;
    private double met;

    public CalculadoraDeCalorias(double pesoUsuario, int tiempo, double met) {
        this.pesoUsuario = pesoUsuario;
        this.tiempo = tiempo;
        this.met = met;
    }

    public double calcularCaloriasQuemadas(){
        return (pesoUsuario * met * tiempo) / 60;
    }
}
