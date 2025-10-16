package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ejer23 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce la numero..");
        int numero = entrada.nextInt();
        System.out.println("cuantas cifras quieres?...");
        int quitar = entrada.nextInt();


        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();
        int nuevo_tamanyo = tamanyo - quitar;


        String resultado = numero_string.substring(0, nuevo_tamanyo);
        System.out.println("El resultado es " + resultado);

    }}