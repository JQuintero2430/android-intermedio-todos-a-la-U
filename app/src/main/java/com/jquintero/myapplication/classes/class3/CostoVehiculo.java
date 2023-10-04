package com.jquintero.myapplication.classes.class3;

import java.util.ArrayList;

public class CostoVehiculo {
    private ArrayList<Integer> kmRecorridos= new ArrayList<Integer>();
    private ArrayList<Integer> litrosConsumidos= new ArrayList<Integer>();

    // Pedir datos al usuario y almacenarlos en los ArrayLists
    public void pedirDatos() {
        kmRecorridos.add(80);
        litrosConsumidos.add(5);
    }

    // Calcular el costo diario de gasolina
    double precioGasolina = 8000.0;

    public double getCostoGasolina() {
        return litrosConsumidos.get(0) * precioGasolina;
    }

    // Calcular el costo diario de energía eléctrica
    double consumoEnergia = 0.2;
    double precioEnergia = 150.0;

    public double getCostoEnergia() {
        return kmRecorridos.get(0) * consumoEnergia * precioEnergia;
    }

    }