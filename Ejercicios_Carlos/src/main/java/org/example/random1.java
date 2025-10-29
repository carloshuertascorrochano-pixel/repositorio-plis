package org.example;

import java.util.Random;

public class random1 {

    static void main() {

        Random entrada = new Random();

        System.out.println("TIRA LOS DADOS");

        System.out.println("DADO 1");
        int num = entrada.nextInt(1, 6);
        System.out.println(num);

        System.out.println("DADO 2");
        int num1 = entrada.nextInt(1, 6);
        System.out.println(num1);

        int num2 = num + num1;

        System.out.println("HAS SACDADO UN " + num2 );

    }
}