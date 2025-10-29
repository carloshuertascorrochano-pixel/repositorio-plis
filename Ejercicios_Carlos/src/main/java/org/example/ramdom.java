package org.example;

import java.util.Random;
import java.util.Scanner;



public class ramdom {

    static void main() {

        Random entrada = new Random();

        int num = entrada.nextInt(1,10)+1;
        System.out.println(num);



    }
}