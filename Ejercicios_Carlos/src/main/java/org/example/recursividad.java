package org.example;

public class recursividad {

    static int limite = 10;

   public static void main (String[] args){





   }
   public static void impr (int inicio){


       if (inicio > limite){
           return;
       }else {
           System.out.println(inicio);
           impr(inicio+1);
       }


   }



}


