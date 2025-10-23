package org.example;

import java.util.Scanner;

public class pruebas5 {
    static void main() {
    Scanner entrada = new Scanner(System.in);


    System.out.println("introduce una palabra");

    String palabra = entrada.next();
    int letras = palabra.length();
    for( int i = letras - 1 ; i >= 0; i-- ) {
        System.out.println(palabra.charAt(i));
    }}}

