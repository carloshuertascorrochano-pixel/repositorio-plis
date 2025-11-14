package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectoresduplicados {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int numeritos[] = {1,2,2,2,3,4,5,5};

        int numeritos_limpio[] = Arrays.stream(numeritos).distinct().toArray();

        System.out.println(Arrays.toString(numeritos_limpio));




    }}