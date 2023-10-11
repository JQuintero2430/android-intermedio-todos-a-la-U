package com.jquintero.myapplication.classes.class8;

public class PrintTriangle {
    public static void printTriangle(int niveles) {
        for (int i = 1; i <= niveles; i++) {  // Iniciar i desde 1 en lugar de 0
            for (int j = i; j < niveles; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
