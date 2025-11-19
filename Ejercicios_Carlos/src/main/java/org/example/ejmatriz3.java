package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejmatriz3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int y = aleatorio.nextInt(6) + 2;

       int matriz[][] = new int[y][y];

        for (int i = 0; i < matriz.length; i++) {

                System.out.println(matriz[i][matriz.length-1-i] + " ");

            }

        }



    }
