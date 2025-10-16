package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ejer24 {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        String texto = "Hola, Mundo, bienveniido a Mundo. Mundo es genial.";
        String  palabra = "Mundo";

        int texto_tamanyo = texto.length();
        int palabra_tamanyo = palabra.length();
        String frase_sin =texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamanyo - conteo;
        int resultado = resta / palabra_tamanyo;
        System.out.println(resultado);



    }}