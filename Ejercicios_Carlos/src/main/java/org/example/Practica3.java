package org.example;

import java.util.Scanner;

public class Practica3 {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        final int ALTURAMAX = 230;
        final int ALTURAMIN = 140;
        final int PESOMAX = 120;

        System.out.println("Bienvenido al ratón juguetón.");



        do {
            try {
                System.out.println("introduce la altura...");
                num1 = entrada.nextInt();
            }catch(Exception e) {
                System.out.println("NO ES VALIDO");
            }
            if (num1 > ALTURAMAX || num1 < 0) {
                System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

            }
        } while (num1 < 0 || num1 > ALTURAMAX);


        if (num1 < ALTURAMIN){

            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN");
            int resultado1 = ALTURAMIN - num1;
            System.out.println("TE FALTAN "+resultado1 +"cm");
            System.exit(0);
        }
        try {
            System.out.println("introduce el peso...");
            num2 = entrada.nextInt();
        }catch(Exception e) {
            System.out.println("NO ES VALIDO");
        }
        final int PESOMIN = (num1 * 2) / 8;

        if (num2 > PESOMIN && num2 < PESOMAX) {
            System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
        }else{
            if (num2 < PESOMIN){
                int resultado = PESOMIN-num2;
                System.out.println("TE FALTAN "+ resultado + " kg");
                System.exit(0);

            }else{
                int resultado1 = num2-PESOMAX;
                System.out.println("TE sobran "+ resultado1 + " kg");
                System.exit(0);

            }


        }}}























