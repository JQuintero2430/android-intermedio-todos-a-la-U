package com.jquintero.myapplication.classes.class1;

public class Activity {
    private String phrase;
    private int number;

    public Activity(String phrase, int number) {
        this.phrase = phrase;
        this.number = number;
    }

    public String readPhrase() {
        return this.phrase;
    }

    public void readNumber() {
        System.out.println("El numero es: " + number);
    }
}
