package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class vectores {
    public static void main(String[] args) {


            Scanner entrada = new Scanner(System.in);

            int vector[] = {5, 8, 6, 7, 9};
            int vector2[] = {3, 4, 4, 1, 2};
            vector[3] = 5;
        vector = vector2.clone();

        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

            for (int i = 0; i < vector.length; i++){

                System.out.println(vector[i]);




            }



        }


    }