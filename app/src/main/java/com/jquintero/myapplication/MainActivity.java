package com.jquintero.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Activity actividad = new Activity("la frase mas linda del mundo", 1234567);

        actividad.readNumber();
        System.out.println("La frase es: " + actividad.readPhrase());
    }
}