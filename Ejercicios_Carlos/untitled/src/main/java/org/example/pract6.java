package org.example;


import java.util.Scanner;


public class pract6 {


    static void main() {

        Scanner entrada = new Scanner(System.in);


        double resultado;
        double num1 = 0 ;
        double num2 = 0;
        // Declaro las variables que voy a usar: resultado, y los dos números.

        try {
            // Uso un try-catch para evitar que el programa pete si escribo algo mal.
            System.out.println("introduce un número");
            num1 = entrada.nextInt();
            // Pido el primer número y lo guardo en num1.
            System.out.println("introduce segundo número");
            num2 = entrada.nextInt();
            // Pido el segundo número y lo guardo en num2.
        } catch (Exception e) {
            // Si el usuario mete letras o símbolos, salto aquí.
            System.out.println("no puedes poner palabras ni caracteres aqui");
            return;
            // El return hace que el programa se pare si hay error.
        }

        System.out.println("introduce tipo de operación");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("x");
        System.out.println("R");
        System.out.println("---------------------------");
        // Muestro todas las operaciones que puede elegir el usuario.

        String operacion = entrada.next();
        // Guardo en la variable “operacion” lo que el usuario elija.


        if (operacion.equals("+") ||
                operacion.equals("-") ||
                operacion.equals("/") ||
                operacion.equals("x") ||
                operacion.equals("R")){
            //Esta es una mejor forma de hacerlo pero ns si lo hemos hecho en clase y como no quiero
            //ser acusado lo pongo por si acaso. Le pregunte a chat gpt para resolverlo por si acaso no estaba bien lo mio.

            switch (operacion) {
                // Uso switch para hacer una cosa distinta según la operación.

                case "x":
                    // Si la operación es x hago una multiplicación.
                    resultado = num1 * num2;
                    System.out.println(" El resultado es " + resultado);
                    break;

                case "+":
                    // Si el usuario pone +, hago la suma.
                    resultado = num1 + num2;
                    System.out.println(" El resultado es " + resultado);
                    break;

                case "-":
                    // Aquí debería restar, pero en el código realmente vuelve a sumar.
                    resultado = num1 - num2;
                    System.out.println(" El resultado es " + resultado);
                    break;

                case "/":
                    // Si la operación es /, hago una división.
                    if (num2 == 0.0) {
                        // Compruebo que el segundo número no sea 0.
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        // Si no es 0, hago la división normal.
                        resultado = num1 / num2;
                        System.out.println(" El resultado es " + resultado);
                        break;
                    }

                case "R":
                    // Si la operación es R, hago la raíz cuadrada.
                    if (num1 < 0) {
                        // si es menor que 0 diga “negativo”
                        System.out.println("El numero es negativo");
                    } else {
                        // Si no, calcula la raíz cuadrada.
                        resultado = Math.sqrt(num1);
                        System.out.println(" El resultado es " + resultado);
                        break;
                    }
            }

        } else {
            // Si el usuario pone otra cosa muestro este mensaje.
            System.out.println("Introduzca los caracteres dados en la calculadora");
        }
    }

}

