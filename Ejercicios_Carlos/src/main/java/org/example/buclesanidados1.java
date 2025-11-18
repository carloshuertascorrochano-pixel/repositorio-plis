package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class buclesanidados1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce num maximo");
        int maximo = entrada.nextInt();
        tabla:


        for (int i = 1; i <= 9 ; i++){

            System.out.println("Tabla del " + i  +":");


            for(int j = 1; j <=10;j++){

                System.out.println(i + " x " + j + " = " + (i * j));

                if (maximo < (i*j)){
                    break tabla;
                }

            }
        }



    }}