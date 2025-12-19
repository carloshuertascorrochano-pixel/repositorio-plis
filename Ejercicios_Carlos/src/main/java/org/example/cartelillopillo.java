package org.example;

import java.util.*;

public class cartelillopillo {

    static Scanner in = new Scanner(System.in);

    static boolean[][] digito = {
            {true,true,true,true,true,true,false},   // 0
            {false,true,true,false,false,false,false}, // 1
            {true,true,false,true,true,false,true},  // 2
            {true,true,true,true,false,false,true},  // 3
            {false,true,true,false,false,true,true}, // 4
            {true,false,true,true,false,true,true},  // 5
            {true,false,true,true,true,true,true},   // 6
            {true,true,true,false,false,false,false},// 7
            {true,true,true,true,true,true,true},    // 8
            {true,true,true,true,false,true,true}    // 9
    };

    public static void main(String[] args) {
        while (casoDePrueba());
    }

    static boolean casoDePrueba() {

        List<Integer> mensaje = new ArrayList<>();
        int x;

        while ((x = in.nextInt()) != -1) {
            mensaje.add(x);
        }

        if (mensaje.isEmpty()) return false;

        int ancho = mensaje.size();

        // marcador[dígito][segmento]
        boolean[][] marcador = new boolean[ancho][7];
        int cambios = 0;

        // pasos = entrada + salida
        for (int paso = 0; paso < mensaje.size() + ancho; paso++) {

            boolean[][] nuevo = new boolean[ancho][7];

            // desplazamiento
            for (int i = ancho - 1; i > 0; i--) {
                nuevo[i] = marcador[i - 1];
            }

            // entra nuevo dígito
            if (paso < mensaje.size()) {
                nuevo[0] = digito[mensaje.get(paso)];
            }

            // contar cambios
            for (int i = 0; i < ancho; i++) {
                for (int s = 0; s < 7; s++) {
                    if (marcador[i][s] != nuevo[i][s]) {
                        cambios++;
                    }
                }
            }

            marcador = nuevo;
        }

        System.out.println(cambios);
        return true;
    }
}