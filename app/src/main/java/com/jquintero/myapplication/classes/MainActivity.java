package com.jquintero.myapplication.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jquintero.myapplication.R;
import com.jquintero.myapplication.classes.Class2.Comparador;

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

        Comparador comparador = new Comparador(10, 56);

        comparador.comparar();

    }
}

