package org.example;

import java.util.Scanner;

public class buacles2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tu numero");
        int num = entrada.nextInt();

        for( int i = 0 ; i < num ; num-- ){
        System.out.println(num);
            if (num == 1){
                System.out.println("cuenta atras " + num);
            }
        }
        System.out.println("terminado");

    }
}