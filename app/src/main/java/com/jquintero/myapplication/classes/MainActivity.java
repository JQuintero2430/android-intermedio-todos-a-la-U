package com.jquintero.myapplication.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jquintero.myapplication.R;
import com.jquintero.myapplication.classes.Class4.CalculadoraDeCalorias;
import com.jquintero.myapplication.classes.Class4.CalculadoraEnergiaElectrica;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Actividad de la clase 1
        /*
        Activity actividad = new Activity("la frase mas linda del mundo", 1234567);

        actividad.readNumber();
        System.out.println("La frase es: " + actividad.readPhrase()); */

        // Actividad de la clase 2
        /*
        Comparador comparador = new Comparador(10, 56);

        comparador.comparar(); */

        // Actividad de la clase 3
        /*
        CostoVehiculo costoVehiculo = new CostoVehiculo();

        costoVehiculo.pedirDatos();

        System.out.println("Costo diario de gasolina: $" + costoVehiculo.getCostoGasolina());
        System.out.println("Costo diario de energía eléctrica: $" + costoVehiculo.getCostoEnergia());
        System.out.println("Costo diario de mantenimiento: $" + costoVehiculo.getCostoMantenimiento());
         */

        // Actividad de la clase 3
        /*
        CalculadoraDeCalorias calculadora = new CalculadoraDeCalorias(70, 45, 3.5);

        System.out.println("El usuario quemó un total de: " + calculadora.calcularCaloriasQuemadas() + " calorías");
          */

        CalculadoraEnergiaElectrica calculadoraEnergia = new CalculadoraEnergiaElectrica(500, 20);

        System.out.println("La energia potencial generada es: " + calculadoraEnergia.calcularaEnergiaElectrica() + " Joules");

    }


}
