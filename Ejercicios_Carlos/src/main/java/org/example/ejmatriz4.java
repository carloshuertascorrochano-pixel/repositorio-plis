package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejmatriz4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

int a[][] = {{1,2,3,4},{5,4,6,7},{7,8,9,10}};
int b[][] = {{12,21,32,6},{56,76,87,97},{45,67,1,67}};

int m[][]= new int[3][4];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>b[i][j]){
                    m[i][j] = (a[i][j]);

                }else
                    m[i][j] = (b[i][j]);
            }
            for (int fila[] : m){
                System.out.println(Arrays.toString(fila));
            }
        }

    }
}