package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vectores5 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int i;
        int vector[] = {5,4,3,2,1};
        int num = entrada.nextInt();

        System.out.println("el vector es " + Arrays.toString(vector));
        System.out.println("introduzca la posición que desea eliminar");

        int filtrado[] = new int [vector.length-1];

        
        int borrar = 2;


        for ( i=0; i < filtrado.length; i++ ) {


            if (i == borrar){
                filtrado[i]= vector[i+1];
            }else{
                filtrado[i] = vector[i];
            }

            System.out.println(Arrays.toString(vector));
    }


    }

}
