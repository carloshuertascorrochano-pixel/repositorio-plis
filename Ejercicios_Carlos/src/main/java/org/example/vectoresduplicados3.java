package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectoresduplicados3 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {


            numeros[i] = aleatorio.nextInt(10) + i;


        }
        System.out.println(Arrays.toString(numeros));

        boolean comprobar = true;

        while (comprobar) {

            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            comprobar = false;
            for (int i = 0; i < numeros.length; i++) {

                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    System.out.println("duplicado:" + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(10) + i;
                    comprobar = true;
                }


            }
        }
    }
}