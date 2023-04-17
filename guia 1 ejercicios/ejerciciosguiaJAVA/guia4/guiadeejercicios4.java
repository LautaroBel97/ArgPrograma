package guia4;

import java.io.InputStream;
import java.util.Scanner;

public class guiadeejercicios4 {

    public static void main(String[] args) {

        /*
         * EJERCICIO 1 ----------------------------------------
         * Crea una aplicación que le pida dos números al usuario y este pueda elegir
         * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
         * función para cada operación matemática y deben devolver sus resultados para
         * imprimirlos en el main.
         *
         * int num1;
         * int num2;
         * int opcion;
         * int resultado;
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese 2 numeros");
         * num1 = leer.nextInt();
         * num2 = leer.nextInt();
         * System.out.println("----------------");
         * System.out.println("Elija una opcion:");
         * System.out.println("1.SUMAR");
         * System.out.println("2.RESTAR");
         * System.out.println("3.MULTIPLICAR");
         * System.out.println("4.DIVIDIR");
         * System.out.println("-----------------");
         * opcion = leer.nextInt();
         * switch (opcion) {
         * case 1: Suma(num1,num2);
         * resultado=Suma(num1,num2);
         * System.out.println("El resultado es " +resultado);
         * break;
         * case 2: Resta(num1,num2);
         * resultado=Resta(num1,num2);
         * System.out.println("El resultado es " +resultado);
         * break;
         * case 3: Multiplicacion(num1,num2);
         * resultado=Multiplicacion(num1,num2);
         * System.out.println("El resultado es " +resultado);
         * break;
         * case 4: Division(num1,num2);
         * resultado=Division(num1,num2);
         * System.out.println("El resultado es " +resultado);
         * break;
         * }
         * }
         * 
         * public static int Suma(int num1, int num2) {
         * int retorno = num1 + num2;
         * return retorno;
         * }
         * 
         * public static int Resta(int num1, int num2) {
         * int retorno = num1 - num2;
         * return retorno;
         * }
         * public static int Multiplicacion(int num1, int num2) {
         * int retorno = num1 * num2;
         * return retorno;
         * }
         * public static int Division(int num1, int num2) {
         * double retorno = num1 / num2;
         * return retorno;
         * }
         */

        // EJERCICIO 2 ---------------------------------------------

        /*
         * * Diseñe una función que pida el nombre y la edad de N personas e imprima los
         * datos de las personas ingresadas por teclado e indique si son mayores o
         * menores de edad. Después de cada persona, el programa debe preguntarle al
         * usuario si quiere seguir mostrando personas y frenar cuando el usuario
         * ingrese la palabra “No”.
         */

        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do {
            System.out.println("Ingrese nombre y edad de la persona");
            nombre = leer.next();
            edad = leer.nextInt();
            mayoriaDeEdad(nombre, edad);
            System.out.println("Desea ingresar otra persona? si/no");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Fin del programa--------");
                break;
            } else {
                continue;
            }
        } while (respuesta.equalsIgnoreCase("si"));
        leer.close();
    }

    public static void mayoriaDeEdad(String nombre, int edad) {
        System.out.print(nombre + ". ");
        System.out.print(edad + " años.");
        if (edad == 18 | edad > 18) {
            System.out.println(" Mayor de edad");
        } else {
            System.out.println(" Menor de edad");
        }
    }

    // EJERCICIO 3 ------------------------------------------------
    /*
     * Crea una aplicación que a través de una función nos convierta una cantidad de
     * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
     * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
     * moneda a convertir que será una cadena, este no devolverá ningún valor y
     * mostrará un mensaje indicando el cambio (void).
     * 
     * El cambio de divisas es:
     * 0.86 libras es un 1 €
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €
     */
    /*
     * Scanner leer = new Scanner(System.in);
     * int euros;
     * String moneda;
     * System.out.println("ingrese la cantida de euros a convertir");
     * euros= leer.nextInt();
     * System.out.println("Ingrese la moneda a convertir. Libras, Dolares o Yenes."
     * );
     * moneda= leer.next();
     * conversor(euros,moneda);
     * }
     * static void conversor(int euros,String moneda) {
     * if (moneda.equalsIgnoreCase("libras")){
     * System.out.println("Equivale a " +(euros*0.86)+ " libras");
     * } else if (moneda.equalsIgnoreCase("dolares")){
     * System.out.println("Equivale a " +(euros*1.28611)+ " dolares");
     * } else if(moneda.equalsIgnoreCase("yenes")){
     * System.out.println("Equivale a " +(euros*129.852)+ " yenes");
     * } else {
     * System.out.println("Eligió una moneda no valida");
     * }
     * }
     */

    // EJERCICIO 4 ----------------------------------------------
    /*
     * Crea una aplicación que nos pida un número por teclado y con una función se
     * lo pasamos por parámetro para que nos indique si es o no un número primo,
     * debe devolver true si es primo, sino false.
     * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por
     * ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si
     * es primo.
     */
    /*
     * Scanner leer = new Scanner(System.in);
     * System.out.print("Ingrese un número: ");
     * int num = leer.nextInt();
     * 
     * if (esPrimo(num)) {
     * System.out.println(num + " es primo.");
     * } else {
     * System.out.println(num + " no es primo.");
     * }
     * }
     * 
     * public static boolean esPrimo(int num) {
     * if (num < 2) {
     * return false;
     * }
     * for (int i = 2; i <= Math.sqrt(num); i++) {
     * if (num % i == 0 && i != num) {
     * return false;
     * }
     * }
     * return true;
     * }
     */
}