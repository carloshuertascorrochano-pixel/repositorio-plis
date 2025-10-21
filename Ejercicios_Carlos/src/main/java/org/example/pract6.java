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
        String operacion =
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("x");
        System.out.println("R");
        System.out.println("---------------------------");

        String operacion = "";
        switch (operacion.toLowerCase()) {
            case "x":
                double resultadomultiplicacion = num1 * num2;
                System.out.println(" El resultado es " + resultadomultiplicacion);
            case "+":
                double resultadosuma = num1 + num2;
                System.out.println(" El resultado es " + resultadosuma);
            case "-":
                double resultadoresta = num1 + num2;
                System.out.println(" El resultado es " + resultadoresta);
            case "/":
                double resultadodivision = num1 / num2;
                System.out.println(" El resultado es " + resultadodivision);
            case "R":
                double resultadoraiz =  Math.sqrt(num1);
                System.out.println(" El resultado es " + resultadoraiz);


        }


    }
}
