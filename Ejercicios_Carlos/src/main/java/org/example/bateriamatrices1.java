package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bateriamatrices1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int matriz [][] = new int [3][3];

        System.out.println("haz una matriz 3x3");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();


            }

        }
   for (int fila[] : matriz){
       System.out.println(Arrays.toString(fila));
   }
        System.out.println("introduce el numero a buscar");

        int numero = entrada.nextInt();

        externo:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <  matriz[i].length; j++) {

                if(matriz[i][j]==numero){
                    System.out.println("Lo encontras en la coordenada");
                    break externo;
                }

            }

        }






    }
}