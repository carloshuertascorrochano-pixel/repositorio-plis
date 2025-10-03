package org.example;

import java.util.Scanner;

public class ejercicio {
    static void main() {


        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        try {
            System.out.println("introduce la hora...");
            num1 = entrada.nextInt();
        }catch(Exception e) {
            System.out.println("pelele");

        }


        try {
            System.out.println("introduce la tarifa...");
            num2 = entrada.nextInt();

        }catch(Exception e) {
            System.out.println("no escribas sao");

        }

        int resultado = num1 * num2;
        System.out.println("El resultado es " + resultado);


















}}






