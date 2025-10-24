package org.example;

import java.util.Scanner;

public class trazas3 {
    static void main() {


        int a, b, c, d;

    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = 0;
    c = 1;

while(a!=0){
        b++;
        c = c * a / b;
        a = sc.nextInt();
    }

    d = b + c;

 System.out.println(d);
}}
