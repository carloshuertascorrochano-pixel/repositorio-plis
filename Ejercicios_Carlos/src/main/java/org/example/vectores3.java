package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectores3 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int vector[] = {5,4,3,2,1};


        for ( int i=0; i< vector.length/2 ; i++){


        int aux = vector[i];
        vector[i] = vector[ vector.length -1 - i ];
        vector [vector.length -1-i] = aux;


        }


        System.out.println(Arrays.toString(vector));


    }

}