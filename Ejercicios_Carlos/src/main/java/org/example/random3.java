package org.example;

import java.util.Random;
import java.util.Scanner;

public class random3 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int num = 0;
        System.out.println("Intruduzca el numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduzca el minimo y el maximo");

        System.out.println("minimo");
        int num2 = entrada.nextInt();

        System.out.println("maximo");
        int num3 = entrada.nextInt();



        for (int i = 0; i <= num1 ; i++) {

            num = random.nextInt(num2,num3);



        }

        System.out.println(num);
    }
}