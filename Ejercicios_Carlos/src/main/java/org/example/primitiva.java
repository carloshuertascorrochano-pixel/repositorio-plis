package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class primitiva {

    public static void main(String[] args) {

        // Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Random para generar los números del sorteo
        Random aleatorio = new Random();


        String boleto;

        // Pedimos el boleto hasta que tenga el formato correcto
        do {
            System.out.println("Introduce tu numero de loteria de la siguiente forma (nn nn nn nn nn nn/R)");
            System.out.println("Los primeros numeros (nn) serán tu número y R el reintegro");
            boleto = entrada.nextLine();

            // Validamos el formato con matches()
            if (!boleto.matches("\\d{1,2} \\d{1,2} \\d{1,2} \\d{1,2}\\d{1,2} \\d{1,2}/\\d")) {
                System.out.println("Formato no válido.");
                return;
            }

        } while (!boleto.matches("\\d{1,2} \\d{1,2} \\d{1,2} \\d{1,2}\\d{1,2} \\d{1,2}/\\d"));

        // Convertimos el boleto a int[] (los números del usuario)
        String[] miboletoString = boleto.split("[ /]");
        int[] miboleto = new int[miboletoString.length];

        for (int i = 0; i < miboleto.length; i++) {
            miboleto[i] = Integer.parseInt(miboletoString[i]);
        }

        // El último número es el reintegro del usuario
        int reintegroUsuario = miboleto[6];

        System.out.println("Tu boleto es: " + Arrays.toString(miboleto));

        // Sorteo de los 6 números principales SIN repetición
        int[] numeros = new int[6];
        boolean repetido;

        do {
            repetido = false;

            // generamos los 6 números
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = aleatorio.nextInt(49) + 1;
            }

            // los ordenamos
            Arrays.sort(numeros);

            // comprobamos si hay repetidos
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] == numeros[i + 1]) {
                    repetido = true;
                }
            }

        } while (repetido);  // si había repetidos, se vuelve a generar

        System.out.println("Números ganadores: " + Arrays.toString(numeros));

        // Sorteo del complementario (no debe repetirse)
        int complementario;
        do {
            complementario = aleatorio.nextInt(49) + 1;

            // Comprobamos si está repetido dentro del array numeros[]
            boolean numrepetido = false;
            for (int n : numeros) {
                if (n == complementario) {
                    numrepetido = true;
                    break;
                }
            }

            if (!numrepetido) break;

        } while (true);

        System.out.println("Complementario: " + complementario);

        // Sorteo del reintegro (0–9)
        int reintegroGanador = aleatorio.nextInt(10);
        System.out.println("Reintegro ganador: " + reintegroGanador);

        // Contamos aciertos del usuario
        int aciertos = 0;
        boolean aciertaComplementario = false;

        for (int i = 0; i < 6; i++) {
            // Comprobar coincidencia con los números ganadores SIN contiene()
            for (int n : numeros) {
                if (miboleto[i] == n) {
                    aciertos++;
                }
            }

            // Comprobar si acierta el complementario
            if (miboleto[i] == complementario) {
                aciertaComplementario = true;
            }
        }

        // Resultado final
        System.out.println("\nRESULTADO:");

        if (aciertos == 6 && reintegroUsuario == reintegroGanador)
            System.out.println("Categoría Especial (6 + reintegro)");
        else if (aciertos == 6)
            System.out.println("1ª Categoría (6 aciertos)");
        else if (aciertos == 5 && aciertaComplementario)
            System.out.println("2ª Categoría (5 + complementario)");
        else if (aciertos == 5)
            System.out.println("3ª Categoría (5 aciertos)");
        else if (aciertos == 4)
            System.out.println("4ª Categoría (4 aciertos)");
        else if (aciertos == 3)
            System.out.println("5ª Categoría (3 aciertos)");
        else if (reintegroUsuario == reintegroGanador)
            System.out.println("Reintegro");
        else
            System.out.println("No premiado");
    }
}