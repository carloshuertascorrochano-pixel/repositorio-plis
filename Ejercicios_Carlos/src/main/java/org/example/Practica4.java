package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Practica4 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        do{
        try {
            System.out.println("Introduce un número ( de tres cifras)");
            num1 = entrada.nextInt();
            System.out.println("Introduce un número ( de tres cifras)");
            num2 = entrada.nextInt();
        }catch(Exception e) {
            System.out.println("NO ES VALIDO");
        }

       }while ( num1 <= 99 || num1 >= 1000 || num2 <= 99 || num2 >= 1000);


        String numC = Integer.toString(num2);
        String numC_1 = numC.substring(0,1);
        String numC_2 = numC.substring(1,2);
        String numC_3 = numC.substring(2,3);
        int a = Integer.parseInt(numC_1);
        int b = Integer.parseInt(numC_2);
        int c = Integer.parseInt(numC_3);

        int resultado1 = c * num2;
        int resultado2 = b * num2;
        int resultado3 = a * num2;

        int resultado = num1 * num2;
        System.out.println("El producto del resultado" + resultado);
        System.out.println("El proceso es:");
        System.out.println("       " + num1);
        System.out.println(" x     " + num2);
        System.out.println("--------------");
        System.out.println("       " + resultado1);
        System.out.println("      " + resultado2);
        System.out.println("     " + resultado3);
        System.out.println("--------------");
        System.out.println("     " + resultado );




    }}
