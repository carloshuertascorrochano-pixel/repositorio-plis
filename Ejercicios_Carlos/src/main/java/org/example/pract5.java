package org.example;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class pract5 {

    static void main() {
        Scanner entrada = new Scanner(System.in);


        int a;
        int b;
        int c;

        System.out.println("Introduce la fecha dd/mm/aaaa");
       String fecha = entrada.next();


       do{

        String num1 = fecha.substring(0,2);
        String num2 = fecha.substring(3,5);
        String num3 = fecha.substring(6,10);
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);
        c = Integer.parseInt(num3);
        
    }while (a > 31 );

        int resultado1 = a + b + c;
        System.out.println(resultado1);


        String numC = Integer.toString(resultado1);
        String num4 = numC.substring(0,1);
        String num5 = numC.substring(1,2);
        String num6 = numC.substring(2,3);
        String num7 = numC.substring(3,4);

        int d = Integer.parseInt(num4);
        int f = Integer.parseInt(num5);
        int g = Integer.parseInt(num6);
        int e = Integer.parseInt(num7);


        int resultado2 = d + f + g + e;
        System.out.println(resultado2);




    }}