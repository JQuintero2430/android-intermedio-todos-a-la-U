package com.jquintero.myapplication.classes.class8;

import java.util.ArrayList;

public class PrintFirstLetter {
    ArrayList<String> fruits;
    public static void getFirstLetter() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Tomate");
        fruits.add("Pera");
        fruits.add("Mango");

        for (String fruit : fruits) {
            if (fruit.length() > 3){
                System.out.println(fruit.substring(0, 3));
            } else {
                System.out.println(fruit);
            }
        }
    }
}
