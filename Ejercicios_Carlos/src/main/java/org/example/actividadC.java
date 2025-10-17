package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class actividadC {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        boolean seguir = true;
        final int fecha_min = 1900;
        int modo = 0;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();



        System.out.println("elige un modo");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] -                  ");

        if (entrada.hasNextInt()){
            int modo = entrada.nextInt();
        }else{
            System.out.println("valor del modo incorrecto");
            seguir=false;
        }
       if (seguir){

           if(modo==1) {
               System.out.println("introduce tu año de nacimiento");
               String anyo_nacimiento = entrada.next();
               int anyo_naciiento_int = Interger.parseInt(anyo_nacimiento);

               int anyo_nacimiento_int = 0;

               try{
               anyo_nacimiento_int = Interger.parseInt(anyo_nacimiento);
                }catch (NumberFormatExcepcion e) {
                   System.out.println("El formato no es numérico");
                   return;




                   if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual) {

                       if (anyo_naciento_int <= 1927) {
                           System.out.println("Generación sin bautizar.");
                       } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1924) {
                           System.out.println("Generación silent");
                       } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                           System.out.println("Generación silent");
                       } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                           System.out.println("Generación silent");
                       } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                           System.out.println("Generación silent");
                       }
                   }
               }
           }
       } else if (modo==2) {
           int edad = 0;


           System.out.println("Introduce la edad");
           if (entrada.hasNextInt()) {
               edad = entrada.nextInt();
           }else{
               System.out.println("La edad no tiene formato correcto (numéricos)");


           }



       }
    }
}
