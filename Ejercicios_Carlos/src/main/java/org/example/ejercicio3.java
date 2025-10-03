package org.example;

import java.util.Scanner;

public class ejercicio3 {

    static void main() {

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce numero...");
        double num1 = entrada.nextInt();

        if ( num1 < 0)
            System.out.println(" Este número es negativo..." + num1);

        else if ( num1 > 0)
            System.out.println(" Este número es positivo..." + num1);


        else
            System.out.println(" Este número es..." + num1);




    }


}