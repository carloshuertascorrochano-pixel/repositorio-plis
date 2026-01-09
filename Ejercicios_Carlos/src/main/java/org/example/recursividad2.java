package org.example;

public class recursividad2 {

    public static int suma (int num){
    if (num==0){
        return 0;


    }else{
       return num + suma(num-1);

    }


    }
}
