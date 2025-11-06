package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores11 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        String palabras []= {"caca","de","baca","con","b"};

        System.out.println("introduce la letra que te salga de los cojones");

        char letra = entrada.next().charAt(0);

        for(int i = 0 ; i < palabras.length;i++){

            if ( letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }



    }
}