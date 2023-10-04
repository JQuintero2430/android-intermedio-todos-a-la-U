package com.jquintero.myapplication.classes.class6;
public class ProgramaCO2 {
    public static void main() {

        // Datos del problema
        int cantidadVehiculosCombustion = 1000;
        double emisionCombustion = 5.5; // Toneladas de CO2 por año por vehículo
        int cantidadVehiculosElectricos = 50;
        double capacidadBateria = 70; // kWh
        double eficienciaEnergetica = 5; // km por kWh
        double porcentajeRenovable = 0.7;
        double porcentajeNoRenovable = 0.3;
        double emisionRenovable = 500; // g de CO2 por kWh
        double emisionNoRenovable = 500; // g de CO2 por kWh

        // Cálculo de la emisión de CO2 de los vehículos eléctricos
        double energiaNecesaria = capacidadBateria / (eficienciaEnergetica * 1000);
        double emisionRenovablePorKm = porcentajeRenovable * energiaNecesaria * emisionRenovable / 1000;
        double emisionNoRenovablePorKm = porcentajeNoRenovable * energiaNecesaria * emisionNoRenovable / 1000;
        double emisionTotalPorKm = emisionRenovablePorKm + emisionNoRenovablePorKm;
        String emisionTotalPorKmString = String.format("%.3f", emisionTotalPorKm); // Redondeo a 3 decimales

        // Cálculo de la reducción de CO2 al reemplazar los vehículos de combustión interna por vehículos eléctricos
        double reduccionPor50Vehiculos = cantidadVehiculosElectricos * emisionCombustion; // Toneladas de CO2
        double reduccionPor1000Vehiculos = cantidadVehiculosCombustion * emisionCombustion; // Toneladas de CO2
        double emisionCombustionPorKm = emisionCombustion / (365 * 1000);
        double reduccionPorKm = emisionCombustionPorKm - (emisionTotalPorKm / 1000000); // Toneladas de CO2
        String reduccionPorKmString = String.format("%.6f", reduccionPorKm); // Redondeo a 6 decimales

        // Impresión de resultados
        System.out.println("Emisión de CO2 de los vehículos eléctricos por km recorrido: " + emisionTotalPorKmString + " g");
        System.out.println("Reducción de CO2 al reemplazar 50 vehículos de combustión interna: " + reduccionPor50Vehiculos + " ton");
        System.out.println("Reducción de CO2 al reemplazar 1000 vehículos de combustión interna: " +
                reduccionPor1000Vehiculos + " ton");
        System.out.println("Reducción de CO2 por km recorrido al reemplazar los vehículos de combustión interna por vehículos eléctricos: " + reduccionPorKmString + " ton");
    }
}