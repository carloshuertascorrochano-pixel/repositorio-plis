package org.example;
import java.util.Scanner;

public class Actividad {

    static void main(){


        Scanner entrada = new Scanner(System.in);


        System.out.println("como te llamas?: ");
        String nombre = entrada.nextLine();

        System.out.println("A que curso vas?: ");
        String curso = entrada.nextLine();



        System.out.println("hola " + nombre + " bienbenid@ al curso " + curso);



        System.out.println("introduce un número...");
        long num1 = entrada.nextLong();


        System.out.println("introduce otro número...");
        long num2 = entrada.nextLong();

        long resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);



    }


}
