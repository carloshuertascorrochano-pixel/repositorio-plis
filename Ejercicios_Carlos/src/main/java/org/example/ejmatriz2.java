//package org.example;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class ejmatriz2 {
//
//    public static void main(String[] args) {
//
//        Scanner entrada = new Scanner(System.in);
//
//        Random aleatorio = new Random();
//
//        int y = aleatorio.nextInt(6) + 2;
//
//        int matriz[][] = new int[y][y];
//
//        for (int i = 0; i < matriz.length; i++) {
//
//            for (int j = 0; j < matriz[i].length; j++) {
//
//                matriz[i][j] = aleatorio.nextInt(10000);
//
//            }
//
//        }
//
//
//        for ( y[] : matriz) {
//                System.out.println(Arrays.toString(y));
//
//        }
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                if(i==j){
//                    System.out.println(matriz[i][j]);
//                }
//
//
//            }
//        }
//        for (int i = 0; i < matriz.length; i++){
//
//            System.out.println(matriz[i][i]);
//        }
//
//    }
//}