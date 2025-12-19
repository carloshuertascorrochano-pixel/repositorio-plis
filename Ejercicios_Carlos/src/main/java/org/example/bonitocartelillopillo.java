package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase simula un marcador de 7 segmentos para dígitos del 0 al 9.
 * Permite leer secuencias de dígitos introducidas por el usuario,
 * mostrar el estado del display paso a paso y calcular el número de cambios
 * entre estados consecutivos.
 */
public class bonitocartelillopillo {

    static Scanner entradiña;

    /**
     * Tabla de conversión de dígitos a display de 7 segmentos.
     * Cada fila representa un dígito del 0 al 9.
     * Cada columna representa un segmento (a b c d e f g).
     */
    static final boolean numerines[][] = {
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


    /**
     * Lee una secuencia de dígitos introducidos por el usuario.
     * Los dígitos deben estar entre 0 y 9 y la secuencia termina en -1.
     * Si la entrada es inválida, solicita la entrada de nuevo.
     *
     * @return una lista de enteros con los dígitos introducidos
     */
    static List<Integer> leerNumerines() {
        List<Integer> numerinesuser = new ArrayList<>();
        while (true) {
            try {

                String linea = entradiña.nextLine().trim();


                if (!linea.matches("([0-9] +)*-1")) {
                    System.out.println("Vuelvetelo a leer que no te catas chavalin");
                            System.out.println("Ponme una cadena de numerines como por ejemplo: 1 2 3");
                    System.out.println("Separados por espacios y que la cadena termine en -1");

                            System.out.println("------------------------------------------------------");
                    continue;
                }


                numerinesuser.clear();
                for (String numerinesnuevos : linea.split(" ")) {
                    int x = Integer.parseInt(numerinesnuevos);
                    if (x != -1) {
                        numerinesuser.add(x);
                    }
                }

                if (!numerinesuser.isEmpty()) return numerinesuser;

            } catch (Exception e) {
                System.out.println("vuelvelo a intentar, pero leetelo bien.");
                entradiña.nextLine();
            }
        }
    }


    /**
     * Desplaza los estados del display hacia abajo.
     * El estado numerinesanteriores de cada posición pasa a la siguiente.
     *
     * @param numerinesanteriores estado numerinesanteriores del display
     * @param numerinesactuales estado numerinesactuales donde se
    copiarán los cambios
     */
    static void nosvamosamover(boolean[][] numerinesanteriores,
                               boolean[][] numerinesactuales) {
        for (int i = numerinesanteriores.length - 1; i > 0; i--) {
            numerinesactuales[i] = numerinesanteriores[i - 1].clone();
        }
    }

    /**
     * Inserta un dígito en la primera posición del display.
     *
     * @param metodoanterior estado metodoanterior del display
     * @param posi índice del dígito a insertar
     * @param numerinesmeter lista de dígitos del numerinesmeter
     */
    static void meternumerines(boolean[][] metodoanterior, int posi,
                               List<Integer> numerinesmeter) {
        if (posi < numerinesmeter.size())
            metodoanterior[0] = numerines[numerinesmeter.get(posi)].clone();
        else
            metodoanterior[0] = new boolean[7];
    }

    /**
     * Cuenta cuántos segmentos han cambiado entre dos estados del display.
     *
     * @param actualmente estado anterior
     * @param anteriormente estado actual
     * @return número de segmentos que han cambiado
     */
    static int contarnumerines(boolean[][] actualmente, boolean[][]
            anteriormente) {
        int cambios = 0;
        for (int i = 0; i < actualmente.length; i++) {
            for (int s = 0; s < 7; s++) {
                if (actualmente[i][s] != anteriormente[i][s])
                    cambios++;
            }
        }
        return cambios;
    }

    /**
     * Muestra el estado actual del display en consola.
     * Cada posición del display muestra sus 7 segmentos como 1
     (encendido) o 0 (apagado).
     *
     * @param display estado actual del display
     */
    static void mostrarnumerines(boolean[][] display) {
        for (int i = 0; i < display.length; i++) {
            System.out.print("Pos " + i + ": ");
            for (int s = 0; s < 7; s++)
                System.out.print(display[i][s] ? "1 " : "0 ");
            System.out.println();

        }
        System.out.println("-----------------------------");
    }


    /**
     * Ejecuta un caso de prueba completo:
     * lee el mensaje, desplaza e inserta, dígitos paso a paso,
     * muestra el display y cuenta los cambios.
     *
     * @return true si se realizó un caso de prueba, false si no hay
    más entradas
     */
    public static boolean casoDePrueba() {
        if (!entradiña.hasNextLine()) return false;

        List<Integer> mensaje = leerNumerines();
        if (mensaje == null || mensaje.isEmpty()) {
            return false;
        }
        boolean[][] anterior = new boolean[mensaje.size()][7];
        boolean[][] actual   = new boolean[mensaje.size()][7];

        int cambiosTotales = 0;

        for (int paso = 0; paso < mensaje.size() * 2; paso++) {

            System.out.println("PASO " + paso);

            nosvamosamover(anterior, actual);
            meternumerines(actual, paso, mensaje);

            int cambios = contarnumerines(anterior, actual);
            cambiosTotales += cambios;

            mostrarnumerines(actual);
            System.out.println("Cambios en este paso: " + cambios);
            System.out.println();


            boolean[][] tmp = anterior;
            anterior = actual;
            actual = tmp;
        }

        System.out.println("TOTAL CAMBIOS: " + cambiosTotales);
        return true;
    }

    
    /**
     * Método principal que ejecuta el programa.
     * Continúa solicitando casos de prueba hasta que no haya más entradas.
     *
     * @param args argumentos de línea de comando (no se usan)
     */
    public static void main(String[] args) {
        entradiña = new Scanner(System.in);

        // Mostrar instrucciones al usuario ANTES de leer cualquier dato
        System.out.println("Ponme una cadena de numerines como por ejemplo: 1 2 3");
        System.out.println("Separados por espacios y que la cadena termine en -1");
                System.out.println("------------------------------------------------------");

        while (casoDePrueba()) {}
    }
}
