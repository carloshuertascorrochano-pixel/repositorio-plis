package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores6 {

        public static void main(String[] args) {



            Scanner entrada = new Scanner(System.in);


            int i = 0;
            int aux = 0;

            int vector[] = {5,4,3,2,1,9};

            System.out.println( Arrays.toString(vector));

            aux = vector[vector.length - 1];


            for ( i= vector.length-1; i>=1;i--) {
                if (i == vector.length - 1){

                    vector[i] = vector[i - 1];
                vector[i] = aux;

                }else {
                 vector[i]= vector[i - 1];
                }

            }
                vector[0]= aux;
                System.out.println(Arrays.toString(vector));
                System.out.println(aux);

        }
}