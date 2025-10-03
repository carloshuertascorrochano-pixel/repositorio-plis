package org.example;

import java.util.Scanner;

public class ejercicio4 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

         do {
             System.out.println("introduce numero...");
             num1 = entrada.nextInt();

             System.out.println("introduce numero...");
             num2 = entrada.nextInt();

             System.out.println("introduce numero...");
             num3 = entrada.nextInt();

             if ( num1 == num2 || num1 == num3 || num2 == num3){

             }
         }while ( num1 == num2 || num1 == num3 || num2 == num3);




        if (num1<num2 && num1<num3 ) {
            System.out.println(" El número es..." + num1);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(" El número es..." + num2);
        }

        if (num3 < num1 && num3 < num2) {
            System.out.println(" El número es..." + num3);







        }


    }
}
