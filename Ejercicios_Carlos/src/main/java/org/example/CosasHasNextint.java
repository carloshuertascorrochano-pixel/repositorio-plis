package org.example;

import java.util.Scanner;

public class CosasHasNextint {
    static void main() {
    Scanner entrada = new Scanner(System.in);


    if (entrada.hasNextInt()) {
        int num= entrada.nextInt();
        System.out.println(num);
    }else{
        System.out.println("No eres el popodelas3000.");
    }

}}
