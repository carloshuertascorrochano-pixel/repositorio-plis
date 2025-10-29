package org.example;

import java.util.Random;

    public class random2 {

        static void main() {

            Random entrada = new Random();

            String contrasenya = "";

            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            for (int i = 0; i <= 12; i++){
                int num = entrada.nextInt(63);
            String caracter = caracteres.substring(num, num + 1);

            contrasenya += caracter;

            }

            System.out.println(contrasenya);



        }
    }