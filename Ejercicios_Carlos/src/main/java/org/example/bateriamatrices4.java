package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bateriamatrices4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("cuantos alumnos tienes ?");
        int alum = entrada.nextInt();

        System.out.println("cuantas asignatura tienes ");
        int asig = entrada.nextInt();

        entrada.nextLine();

        String notas[][] = new String[alum + 1][asig + 1];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("nombres");
            notas[i][0] = entrada.next();
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("asignatura");
            notas[0][i] = entrada.next();
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("introduce las notas " + notas[0][i] + " para la asignatura de " + notas [0][j]);
                notas[i][j] = entrada.next();
            }

        }




        for (String fila[] : notas) {
            for (String valor : fila) {

                System.out.print(valor + " ");

            }

            System.out.println();

            int suma=0;
            for (int i = 1; i < notas.length; i++) {
                suma = 0;
                for (int j = 1; j < notas[i].length; j++) {
                    suma += Integer.parseInt(notas[i][j]);
                }
                System.out.println("La nota media del alumno " +notas[i][0] + " es " + (double) (suma/asig));
            }
            for (String columna[] : notas) {
                for (String valor : columna) {

                    System.out.print(valor + "");

                }
            }
            for (int i = 1; i < notas[0].length; i++) {
                suma = 0;
                for (int j = 1; j < notas.length; j++) {
                    suma += Integer.parseInt(notas[i][j]);
                }
                System.out.println("La nota media del alumno " +notas[0][i] + " es " + (double) (suma/alum));

        }
    }
}
}

