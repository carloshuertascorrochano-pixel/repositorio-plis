package org.example;

import java.util.Scanner;

public class trazas {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        int a = 24;
        int b= 6;
        int c = 0;
        int d = 0;

    if(a >= b){
        do{
            a = a - b;
            c++;
        }while(a >= b);
    }

    d = a;
        System.out.println(d + " y " + c);
}}

