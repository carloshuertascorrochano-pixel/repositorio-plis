package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class samurais {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int resultado1 = 0;
        int i = 0;
        String cadena = entrada.nextLine();
        String cadena2 = entrada.nextLine();

        String equipo1[] = cadena.split(" ");
        String equipo2[] = cadena2.split(" ");

        System.out.println(Arrays.toString(equipo1));
        System.out.println(Arrays.toString(equipo2));

        int vector[] = new int[equipo1.length];
        int vector2[] = new int[equipo2.length];

        for (i = 0; i < equipo1.length; i++) {

            vector[i] = Integer.parseInt(equipo1[i]);
            vector2[i] = Integer.parseInt(equipo2[i]);

        }
        for (i = 0; i < vector.length; i++) {

            resultado1 += vector[i];
            System.out.println(resultado1);

        }
    }
}