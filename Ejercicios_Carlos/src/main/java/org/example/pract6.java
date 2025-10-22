package org.example;

import java.util.Scanner;

public class pract6 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un número");
        double num1 = entrada.nextInt();

        System.out.println("introduce segundo número");
        double num2 = entrada.nextInt();


        System.out.println("introduce tipo de operación");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("x");
        System.out.println("R");
        System.out.println("---------------------------");
        String operacion = entrada.next();



        double resultado ;




        switch (operacion) {
            case "x":
            case "*":
                resultado = num1 * num2;
                System.out.println(" El resultado es " + resultado);
                break;
            case "+":
                resultado = num1 + num2;
                System.out.println(" El resultado es " + resultado);
                break;
            case "-":
                resultado = num1 + num2;
                System.out.println(" El resultado es " + resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(" El resultado es " + resultado);
                break;
            case "R":
                resultado =  Math.sqrt(num1);
                System.out.println(" El resultado es " + resultado);
                break;

        }
    }
}



