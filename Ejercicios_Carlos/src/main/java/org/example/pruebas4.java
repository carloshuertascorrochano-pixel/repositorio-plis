package org.example;

import javax.print.DocFlavor;
import java.util.Scanner;

public class pruebas4 {static void main() {
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce una palabra");
    String palabra = entrada.next();
    int letras = palabra.length();
    for( int i = 0 ; i < letras; i++ ){
        System.out.println(palabra.charAt(i));

    }
}}





