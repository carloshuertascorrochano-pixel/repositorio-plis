package org.example;

import java.util.Enumeration;

public class recursividad4 {
    public static void main(String[]args){





    }
    public static int contardig (int num){

        if (num < 10){
            return 1;
        }else{
            return 1 + contardig (num + 1);
        }

    }
    public static int elevar ( int num, int exp){

        if (exp==0){
        return num;
        }else {
         return num * elevar (num, exp-1);
        }

    }
    public static int contaratras (int num){



    }
}
