package org.example;

import java.util.Scanner;

public class pract6nomia {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            double a = input.nextDouble(); // Permitimos números decimales.
            System.out.print("Ingrese la operación (+, -, x, /): ");
            char operacion = input.next().charAt(0);
            System.out.print("Ingrese el segundo número: ");
            double b = input.nextDouble(); // Permitimos números decimales.

            double resultado = 0.0;

            switch (operacion) {
                case '+':
                    resultado = a + b;
                    System.out.printf("%.2f + %.2f = %.2f%n", a, b, resultado);
                    break;
                case '-':
                    resultado = a - b;
                    System.out.printf("%.2f - %.2f = %.2f%n", a, b, resultado);
                    break;
                case 'x':
                case '*':
                    resultado = a * b;
                    System.out.printf("%.2f x %.2f = %.2f%n", a, b, resultado);
                    break;
                case '/':
                    if (b != 0) {
                        resultado = a / b;
                        System.out.printf("%.2f / %.2f = %.2f%n", a, b, resultado);
                    } else {
                        System.out.println("División por cero no permitida");
                    }
                    break;
                default:
                    System.out.println("Caracter no reconocido");
            }
        }
    }

