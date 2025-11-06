package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores7 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int aux = 0;
        boolean es_o_no= true;
        int vector[] = {5, 4, 3, 2, 1, 9};


        for (i = 0; i < vector.length / 2; i++) {
            if(vector[i]==vector[vector.length-1-i]){
                System.out.println("te bailan las neuronas desde los huevos de tu padre");
                es_o_no=false;
                break;

            }


        }


        if (es_o_no) System.out.println("es palindromo champion sendocai");

    }

}

