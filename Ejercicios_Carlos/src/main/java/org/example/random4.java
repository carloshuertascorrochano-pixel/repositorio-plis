package org.example;

import java.util.Random;
import java.util.Scanner;

public class random4 {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();


            String contrasenya = "";
            int num = random.nextInt(8,12);
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            for (int i = 0; i <= num; i++){
                int num1 = entrada.nextInt(63);
                String caracter = caracteres.substring(num, num + 1);

                contrasenya += caracter;

            }

            System.out.println(contrasenya);









    }
}