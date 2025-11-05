package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectores4 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[25];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(101);
        }

        int num = entrada.nextInt();
        int contador = 0;

        System.out.println(Arrays.toString(vector));

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num ) {
                contador++;

            }


        }
        System.out.println("el numero se repite " + contador);

    }


}


