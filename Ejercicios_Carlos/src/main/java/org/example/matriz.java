package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);



        int matriz[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        int matriz2[][] = new int [3][3];

        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);

        //matriz [0] columnas
        for (int x = 0; x< matriz.length; x++){
            for (int y=0; y<matriz[x].length;y++){
                System.out.println(matriz[x][y]);
            }
            System.out.println();
        }
        for(int x[] : matriz){
            for (int y : x){
                System.out.println(y);
            }
        }
        for(int x[]: matriz){
            System.out.println(Arrays.toString(x));
        }
        int vector[] = {1,2,3,4};
        for (int num: vector){
            System.out.println(num);
        }
    }

}
