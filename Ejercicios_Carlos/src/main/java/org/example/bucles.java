package org.example;

import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        String contrasenya = "contrasenya" ;

        do {

            System.out.println("introduce tu contraseña");
            contrasenya = entrada.next();


        }while ( contrasenya == "contrasenya" );


    }

}
