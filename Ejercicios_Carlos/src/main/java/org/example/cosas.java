package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class cosas {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        externo:
        for (int i=0;i<9;i++){
            System.out.println("soy el externo con =" + i);
            interno:
            for (int j=10;j>=0;j--){
                System.out.println("Soy el interno con j = " + j);
                if(j==5){
                    continue externo;
                }

                System.out.println("Hola" + (j+i));
            }
        }
    }





}
