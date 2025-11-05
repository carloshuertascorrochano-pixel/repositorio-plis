package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectores2 {

    public static void main(String[] args) {

        Random aleatorio= new Random();
        Scanner entrada = new Scanner(System.in);



        int resultado = 0;
        int vector[] = {0,0,0,0,0,0,0,0};

        for (int i = 0; i < vector.length; i++){

            vector[i] = aleatorio.nextInt(501);
            System.out.println(Arrays.toString(vector));
            resultado += vector[i];
            System.out.println(resultado);




            }
        }
    }
