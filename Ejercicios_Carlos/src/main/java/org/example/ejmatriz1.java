package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejmatriz1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int matriz[][]= new int [aleatorio.nextInt(6)+2][];

        for (int i = 0 ; i<matriz.length ; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(9);

            }

        }
        for ( int y[] : matriz){
            System.out.println(Arrays.toString(y));
        }

    }
}