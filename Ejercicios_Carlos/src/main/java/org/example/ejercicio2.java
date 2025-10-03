package org.example;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce la hora...");
        double num1 = entrada.nextInt();


        System.out.println("introduce la tarifa...");
        double num2 = entrada.nextInt();

        double resultado = num1 * num2;
        if ( num1 > 40 ){
            resultado = num1 *( num2 * 1.5 );
        }

        System.out.println("El resultado es " + resultado);


    }















}
