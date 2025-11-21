package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class space_invaders {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce número de filas");
        int filas = entrada.nextInt();

        String mensaje[][]= new String [filas][3];

        for (int i = 0; i < mensaje.length; i++) {
         String fila[] = entrada.next().split("");

             if(fila.length== mensaje[i].length) {
                 for (int j = 0; j < mensaje[i].length; j++) {
                     mensaje[i][j] = fila[j];
                 }
             }else {
                 System.out.println("longitud incorrecta (3");
                 i--;
             }
        }

        for (String fila[]: mensaje){
            System.out.println(Arrays.toString(fila));
        }
        for (int i = 0; i < mensaje[0].length; i++) {
            for (int j = 0; j < mensaje.length; j++) {
                System.out.print(mensaje[i][j]);

            }

        }

    }
}