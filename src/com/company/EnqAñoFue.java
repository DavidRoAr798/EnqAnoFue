package com.company;

import java.util.Scanner;

public class EnqAñoFue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce el primer año: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo año: ");
        b = sc.nextInt();

        int result = a + b;

        if (a==1 && b==1) {
            System.out.println("La respuesta es... ¡El fantástico Ralph!");
        } else {
            System.out.println("El años final es: " + result);
        }


    }
}
