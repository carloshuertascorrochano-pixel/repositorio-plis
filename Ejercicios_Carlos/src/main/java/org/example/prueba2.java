package org.example;

import java.util.Scanner;

public class prueba2 {
    static void main() {


   int a = 1, b = 2 , c = 3, f = 2, j = 6;


    int resultado = a++ == 1 && a-- == ++f ? a++:
                    a < ++b && ++a == c ? a += c:
                    a == ++b || a == ++c ? a -= j:
                    ++c == ++b && a * f == j ? ++a * j: a++;
        System.out.println("es " + resultado);

}}
