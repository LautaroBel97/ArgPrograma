package ejerciciosguiaJAVA.guia3;

import java.io.InputStream;
import java.util.Scanner;

public class guiadeejercicios3 {

    public static void main(String[] agrs){
        //EJERCICIO 1 ----------------------
        /* int limite;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para comprobar si es par o impar");
        limite = leer.nextInt();
        if (limite % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero no es par");
        } */

        //EJERCICIO 2 -----------------------
        /* String frase;
        String fraseCorrecta = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        if ((frase).equals(fraseCorrecta)) {
            System.out.println("la frase es igual");
        } else {
            System.out.println("la frase no es igual");
        } */

        //EJERCICIO 3 -----------------------
        /* String frase;       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra de 8 caracteres de largo");
        frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("correcto");           
        } else {
            System.out.println("incorrecto");
        } */

        //EJERCICIO 4 -----------------------
        /* String frase;  
        String letra = "A";     
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        frase = leer.nextLine();
        if ((frase.substring(0, 1)).equalsIgnoreCase(letra)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        } */

        //EJERCICIO 5 -----------------------
        /* int limite;
        int num;
        int suma=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor limite positivo");
        limite = leer.nextInt();
                         
        while (limite > 0) { 
            do {System.out.println("ingrese valores para superar el limite");
                num = leer.nextInt();
                suma+=num;
            } while (suma <= limite);
            break;
                         
        } 
        System.out.println("se supero el limite con " +suma);  */  

        //EJERCICIO 6 ------------------------
        int num1;
        int num2;
        int opcion;
        String respuesta;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean log = true;
        while (log = true) {
        System.out.println("--MENU--");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        System.out.println("Elija una opcion:");
        opcion = leer.nextInt();       
            switch (opcion) {
                case 1: System.out.println(num1+num2);
                break;
                case 2: System.out.println(num1-num2);
                break;
                case 3: System.out.println(num1*num2);
                break;
                case 4: System.out.println(num1/num2);
                break;
                case 5: System.out.println("Esta seguro que desea salir? s/n");
                Scanner teclado = new Scanner(System.in);
                respuesta = teclado.nextLine();
                   if (respuesta.equalsIgnoreCase("s")) {
                    log = false;
                    break;
                   } else log = true;
                
            }
            
        }   
        

    }
}
