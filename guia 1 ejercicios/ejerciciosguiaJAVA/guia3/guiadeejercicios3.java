package guia3;

import java.io.InputStream;
import java.util.Scanner;

public class guiadeejercicios3 {

    public static void main(String[] agrs) {
        // EJERCICIO 1 ----------------------
        /*
         * int limite;
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese un numero para comprobar si es par o impar");
         * limite = leer.nextInt();
         * if (limite % 2 == 0) {
         * System.out.println("el numero es par");
         * } else {
         * System.out.println("el numero no es par");
         * }
         */

        // EJERCICIO 2 -----------------------
        /*
         * String frase;
         * String fraseCorrecta = "eureka";
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese una frase");
         * frase = leer.nextLine();
         * if ((frase).equals(fraseCorrecta)) {
         * System.out.println("la frase es igual");
         * } else {
         * System.out.println("la frase no es igual");
         * }
         */

        // EJERCICIO 3 -----------------------
        /*
         * String frase;
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese una frase o palabra de 8 caracteres de largo");
         * frase = leer.nextLine();
         * if (frase.length() == 8) {
         * System.out.println("correcto");
         * } else {
         * System.out.println("incorrecto");
         * }
         */

        // EJERCICIO 4 -----------------------
        /*
         * String frase;
         * String letra = "A";
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese una frase o palabra");
         * frase = leer.nextLine();
         * if ((frase.substring(0, 1)).equalsIgnoreCase(letra)) {
         * System.out.println("correcto");
         * } else {
         * System.out.println("incorrecto");
         * }
         */

        // EJERCICIO 5 -----------------------
        /*
         * int limite;
         * int num;
         * int suma=0;
         * Scanner leer = new Scanner(System.in);
         * System.out.println("ingrese un valor limite positivo");
         * limite = leer.nextInt();
         * 
         * while (limite > 0) {
         * do {System.out.println("ingrese valores para superar el limite");
         * num = leer.nextInt();
         * suma+=num;
         * } while (suma <= limite);
         * break;
         * 
         * }
         * System.out.println("se supero el limite con " +suma);
         */

        // EJERCICIO 6 ------------------------------------

        /* int num1;
        int num2;
        int opcion;
        String respuesta;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean log = true;
        do {
            System.out.println("--MENU--");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(num1 + num2);
                    System.out.println("---------");
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    System.out.println("---------");
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    System.out.println("---------");
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    System.out.println("---------");
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? s/n");
                    Scanner teclado = new Scanner(System.in);
                    respuesta = teclado.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        log = false;
                        break;
                    } else
                        continue;
            }

        } while ((log == true)); */

        // EJERCICIO 7 -------------------------------

        /*
         * String cadena;
         * String cadena2= "&&&&&";
         * int cont1=0;
         * int cont2=0;
         * Scanner leer = new Scanner(System.in);
         * 
         * do {
         * System.out.println("ingrese la cadena");
         * cadena = leer.nextLine();
         * if (cadena.length() == 5 & cadena.endsWith("o") & cadena.startsWith("x") ) {
         * cont1++;
         * }
         * else {
         * cont2++;
         * }
         * if (cadena.equals(cadena2)) {
         * cont2--;
         * break;
         * 
         * }
         * 
         * } while (!cadena.equals(cadena2));
         * 
         * System.out.println("Cadenas correctas ingresadas " +cont1);
         * System.out.println("Cadenas incorrectas ingresadas " +cont2);
         */

        // EJERCICIO 8 -----------------------------
        
          int num;
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese el numero");
          num = leer.nextInt();
          for (int i = 0; i < num; i++) {
              for (int j = 0; j < num; j++) {
                  if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                      System.out.print("*");
                  } else {
                      System.out.print(" ");
                  }
              }
              System.out.println();
          }
        

    }

}