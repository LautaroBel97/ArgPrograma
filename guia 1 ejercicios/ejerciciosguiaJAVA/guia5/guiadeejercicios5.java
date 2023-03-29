package ejerciciosguiaJAVA.guia5;

import java.io.InputStream;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Random;

public class guiadeejercicios5 {

    public static void main(String[] args) {
        // EJERCICIO GUIA
        /*
         * Scanner leer = new Scanner(System.in);
         * 
         * String[] equipo = new String[5];
         * 
         * for (int i = 0; i < equipo.length; i++) {
         * System.out.println("Ingrese el nombre del miembro nro. "+(i+1));
         * equipo[i]=leer.next();
         * }
         * System.out.println("Los miembros del equipo son:");
         * for (int i = 0; i < equipo.length; i++) {
         * if (i == (equipo.length-1)) {
         * System.out.println(equipo[i]+".");
         * } else {
         * System.out.print(equipo[i]+", ");
         * }
         * }
         */

        // EJERCICIO 1 -------------------------------------------------
        /*
         * Realizar un algoritmo que llene un vector con los 100 primeros números
         * enteros y los muestre por pantalla en orden descendente.
         */

        /*
         * int[] vector= new int[100];
         * 
         * llenarVector(vector);
         * }
         * static void llenarVector(int[] vector) {
         * for (int i=0;i<100;i++) {
         * vector[i]= i+1;
         * }
         * for (int i=99;i>=0;i--) {
         * System.out.print(vector[i]+",");
         * }
         * }
         */

        // EJERCICIO 2 ---------------------------------------------------
        /*
         * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
         * y le pida al usuario un número a buscar en el vector. El programa mostrará
         * dónde se encuentra el numero y si se encuentra repetido
         */
        /*
         * Scanner leer = new Scanner(System.in);
         * System.out.println("Ingrese el tamaño del vector");
         * int tamaño = leer.nextInt();
         * int[] vector = new int[tamaño];
         * 
         * llenarVector(vector);
         * }
         * static void llenarVector(int[] vector) {
         * for (int i=0;i<vector.length;i++) {
         * vector[i]=(int) (Math.random() * 10);
         * }
         * Scanner leer = new Scanner(System.in);
         * System.out.println("Ingrese un numero a buscar del 0 al 9");
         * int num = leer.nextInt();
         * int rep=0;
         * for (int i=0;i<vector.length;i++) {
         * if (vector[i]==num) {
         * System.out.println("El numero " +num+ " se encuentra en la posicion " +i);
         * rep++;
         * }
         * }
         * if (rep<1) {
         * System.out.println("No se encontro el numero");
         * } else {
         * System.out.println("El numero se repite "+rep+" veces");
         * }
         * for (int i=0;i<vector.length;i++) {
         * System.out.print(vector[i]+",");
         * }
         */
        // EJERCICIO 3--------------------------------------------------------
        /*
         * Recorrer un vector de N enteros contabilizando cuántos números son de 1
         * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        /*
         * Random random = new Random();
         * int max = 15;
         * int min = 5;
         * int [] vector = new int[(int)(Math.random()*(max-min+1)+min)];
         * int unDigito=0;
         * int dosDigito=0;
         * int tresDigito=0;
         * int cuatroDigito=0;
         * int cincoDigito=0;
         * 
         * for (int i=0;i<vector.length;i++) {
         * vector[i]= random.nextInt(15000);
         * switch (String.valueOf(vector[i]).length()) {
         * case 1: unDigito++;
         * continue;
         * case 2: dosDigito++;
         * continue;
         * case 3: tresDigito++;
         * continue;
         * case 4: cuatroDigito++;
         * continue;
         * case 5: cincoDigito++;
         * continue;
         * }
         * }
         * for (int i=0; i<vector.length;i++) {
         * System.out.println("[" +vector[i]+"]");
         * }
         * System.out.println("");
         * 
         * System.out.println("En el vector hay: ");
         * if (unDigito>0) {
         * System.out.println(+unDigito+ " numeros de 1 digito");
         * }
         * if (dosDigito>0) {
         * System.out.println(+dosDigito+ " numeros de 2 digitos");
         * }
         * if (tresDigito>0) {
         * System.out.println(+tresDigito+ " numeros de 3 digitos");
         * }
         * if (cuatroDigito>0) {
         * System.out.println(+cuatroDigito+ " numeros de 4 digitos");
         * }
         * if (cincoDigito>0) {
         * System.out.println(+cincoDigito+ " numeros de 5 digitos");
         * }
         * }
         */

        // EJERCICIO 4 ----------------------------------------------------
        /*
         * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
         * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
         * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
         
        Scanner leer = new Scanner(System.in);
        Random random = new Random(); 
        System.out.println("Matriz original");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
         }

        System.out.println("");
         
        System.out.println("Matriz traspuesta");

        for (int i = 0; i < matrizT.length; i++) {
             for (int j = 0; j < matrizT.length; j++) {
                matrizT[i][j] = matriz[j][i];
            System.out.print("[ " + matrizT[i][j] + " ]");
            }
            System.out.println("");
        }
    }
    // EJERCICIO 5-------------------------------------------------------
    /*
     * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
     * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
     * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
     * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
     * sus filas por columnas (o viceversa).
     */

    /*
     * int[][] matriz = new int[3][3];
     * int[][] matrizT = new int[3][3];
     * 
     * Scanner leer = new Scanner(System.in);
     * 
     * System.out.println("Matriz original");
     * for (int i = 0; i < matriz.length; i++) {
     * for (int j = 0; j < matriz[i].length; j++) {
     * matriz[i][j] = leer.nextInt();
     * System.out.print("[ " + matriz[i][j] + " ]");
     * }
     * System.out.println("");
     * }
     * System.out.println("");
     * 
     * System.out.println("Matriz traspuesta");
     * for (int i = 0; i < matrizT.length; i++) {
     * for (int j = 0; j < matrizT.length; j++) {
     * matrizT[i][j] = matriz[j][i];
     * System.out.print("[ " + matrizT[i][j] + " ]");
     * }
     * System.out.println("");
     * }
     * int antisimetrica = 0;
     * int simetrica = 0;
     * for (int i = 0; i < matriz.length; i++) {
     * for (int j = 0; j < matrizT.length; j++) {
     * if (Math.abs(matriz[i][j]) == Math.abs(matrizT[i][j])) {
     * antisimetrica++;
     * } else {
     * simetrica++;
     * }
     * }
     * }
     * if (antisimetrica == 9) {
     * System.out.println("es antisimetrica");
     * } else {
     * System.out.println("no es antisimetrica");
     * }
     * }
     */

    // EJERCICIO 6 -------------------------------------------------------
    /*
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
     * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
     * Crear un programa que permita introducir un cuadrado por teclado y determine
     * si este cuadrado es mágico o no. El programa deberá comprobar que los números
     * introducidos son correctos, es decir, están entre el 1 y el 9.
     */

    /*
     * int[][] matriz = new int[3][3];
     * 
     * llenadorMatriz(matriz);
     * cuadradoMagico(matriz);
     * }
     * 
     * static void llenadorMatriz(int[][] matriz) {
     * Scanner leer = new Scanner(System.in);
     * System.out.println("ingrese numeros 9 numeros del 1 al 9 para la matriz");
     * 
     * for (int i = 0; i < 3; i++) {
     * for (int j = 0; j < 3; j++) {
     * int num;
     * num = leer.nextInt();
     * while (num > 9 || num < 1) {
     * System.out.println("Ingrese solo numeros del 1 al 9");
     * num = leer.nextInt();
     * }
     * ;
     * if (num > 0 || num < 10) {
     * matriz[i][j] = num;
     * }
     * }
     * }
     * for (int i = 0; i < 3; i++) {
     * for (int j = 0; j < 3; j++) {
     * 
     * System.out.print("[" + matriz[i][j] + "]");
     * 
     * }
     * System.out.println("");
     * }
     * }
     * 
     * static void cuadradoMagico(int[][] matriz) {
     * int[] sumasFilas = new int[3];
     * int[] sumasColu = new int[3];
     * int d1=0;
     * int d2=0;
     * 
     * for (int i = 0; i < 3; i++) {
     * for (int j = 0; j < 3; j++) {
     * sumasFilas[i] += matriz[i][j];
     * }
     * }
     * for (int i = 0; i < 3; i++) {
     * for (int j = 0; j < 3; j++) {
     * sumasColu[i] += matriz[j][i];
     * }
     * }
     * for (int i = 0; i < 3; i++) {
     * for (int j = 0; j < 3; j++) {
     * if (i == j) {
     * d1 += matriz[i][j];
     * }
     * }
     * }
     * int aux = 2;
     * for (int i = 0; i < 3; i++) {
     * d2 += matriz[i][aux];
     * aux--;
     * }
     * int contadorV=0;
     * int contadorF=0;
     * boolean auxLog;
     * for (int i=0;i<3;i++) {
     * auxLog = sumasFilas[i]==sumasColu[i];
     * if (auxLog=true) {
     * contadorV++;
     * } else {
     * contadorF++;
     * }
     * }
     * aux=2;
     * for (int i=0;i<3;i++) {
     * auxLog = sumasFilas[i]==sumasColu[aux];
     * if (auxLog=true) {
     * contadorV++;
     * } else {
     * contadorF++;
     * }
     * aux--;
     * }
     * auxLog = d1==d2;
     * if (auxLog=true) {
     * contadorV++;
     * } else {
     * contadorF++;
     * }
     * 
     * if (contadorF==0) {
     * System.out.println("El cuadrado es magico");
     * } else {
     * System.out.println("El cuadrado no es magico");
     * }
     * }
     */

}