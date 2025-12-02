package org.example;

import java.util.Random;

public class matrizochoporocho {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int matriz[][] = new int[8][16]; // modificad el tamaño como queráis (múltiplos de 8)

        // yo la relleno de aleatorios, vosotros las letras que tengáis
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(5);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int bloq_horizontal = (matriz[0].length/8); // no lo usamos, pero podríamos en lugar de los verticales
        int bloq_vertical = (matriz.length/8); // debemos saber los bloques que hay verticalmente para ir recorriéndolos

        int aux_bloq = 0; //para ir contando los bloques verticales que nos recorremos

        int aux_8 = 8; //variables para controlar el recorrido de las filas
        int aux_ini = 0;
        int aux_ini_vert = 0; //variables para controlar el recorrido de las columnas
        int aux_8_vert = 8;

        //bucles para ir recorriendo y pintando bloques de 8x8 de arriba a abajo (vertical)
        do {
            for (int i = aux_ini; i < aux_8; i++) {
                for (int j = aux_ini_vert; j < aux_8_vert; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            aux_8 += 8; //muevo el inicio y fin de las filas para recorrer el siguiente bloque
            aux_ini += 8;
            aux_bloq++; //he recorrido un bloque vertical +
            if (aux_bloq == bloq_vertical) { //ya hemos recorrido todos los bloques verticalmente de 0-8
                aux_bloq = 0;             //ahora recorremos los bloques verticales de la siguiente columna 8-16
                aux_ini_vert += 8;  //movemos el inicio y final para adaptarlos a la siguiente columna
                aux_8_vert += 8;
                aux_8 = 8; //reiniciamos el inicio y el final para las filas
                aux_ini = 0;
            }
        } while (aux_8 <= matriz.length && aux_8_vert <= matriz[0].length);

    }
}