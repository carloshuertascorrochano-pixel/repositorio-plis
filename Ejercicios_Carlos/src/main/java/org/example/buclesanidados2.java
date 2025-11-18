package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class buclesanidados2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el numero maximo");
        int m = entrada.nextInt();

        primos:
        for (int i = 2 ; i <= m ; i++){


            for (int j = 2;j<i; j++){


                if (i % j == 0){
                    continue primos;
                }
            }
            System.out.println(i);
        }
    }
}
