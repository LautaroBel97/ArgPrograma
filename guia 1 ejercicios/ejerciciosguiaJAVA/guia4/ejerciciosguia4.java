package ejerciciosguiaJAVA.guia4;

import java.io.InputStream;
import java.util.Scanner;

public class ejerciciosguia4 {

    public static void main(String[] agrs) {

        // EJERCICIO 11 ---------------------------------------
        /*
         * Scanner leer = new Scanner(System.in);
         * String frase;
         * System.out.println("ingrese una frase");
         * frase = leer.nextLine();
         * 
         * String retorno = remplazo(frase);
         * System.out.println(retorno);
         * 
         * }
         * 
         * public static String remplazo(String frase) {
         * int i;
         * String fraseNueva="";
         * for (i=0; i<frase.length(); i++) {
         * String letra = (frase.substring(i,i+1));
         * switch (letra) {
         * case "a": fraseNueva = fraseNueva.concat("@");
         * break;
         * case "e": fraseNueva = fraseNueva.concat("#");
         * break;
         * case "i": fraseNueva = fraseNueva.concat("$");
         * break;
         * case "o": fraseNueva = fraseNueva.concat("%");
         * break;
         * case "u": fraseNueva = fraseNueva.concat("*");
         * break;
         * default: fraseNueva = fraseNueva.concat(letra);
         * }
         * }
         * return fraseNueva;
         * 
         * }
         */

        // EJERCICIO 12 ----------------------------------------
        /*
         * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
         * usuario, validando que el primer número sea múltiplo del segundo e imprima si el
         * primer número es múltiplo del segundo, sino informe que no lo son.
         */
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        EsMultiplo(num1,num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es multiplo de " + num2);
        } else {
            System.out.println("Los numeros no son multiplos");
        }
    }
}