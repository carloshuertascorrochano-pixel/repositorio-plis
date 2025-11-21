package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rellenarmatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        String nombres[][]= new String[2][3];

        for (int i = 0; i < nombres.length; i++) {

            String fila[] = entrada.next().split(";");
            for (int j = 0; j < nombres[i].length; j++) {

                if ((fila.length==nombres[i].length)){
                    for (int k = 0; k < nombres[i].length; k++) {
                        nombres[i][j]=fila[j];
                    }
                }else{
                    System.out.println("el tamaño no es el adecuado");
                    i--;
                }

            }
        }

        //for(String fila[] : nombres);
        //System.out.println(Arrays.toString(fila));

    }
}