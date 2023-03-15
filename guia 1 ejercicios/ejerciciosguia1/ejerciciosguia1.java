package ejerciciosguia1;

import java.util.Scanner;

public class ejerciciosguia1 {

    public static void main(String[] agrs) {

        //EJERCICIO 1
        /* try (Scanner leer = new Scanner(System.in)) {
            String num1;
            String num2;
            System.out.println("ingrese dos numeros enteros");
            num1 = leer.next();
            num2 = leer.next();
              	
            int numEntero1 = Integer.parseInt(num1);
            int numEntero2 = Integer.parseInt(num2);
            int suma = numEntero1 + numEntero2;
            System.out.println("La suma es " + suma);
        } */
        
        //EJERCICIO 2
        try (Scanner leer = new Scanner(System.in)) {
            String nombre;
            System.out.println("Ingresa tu nombre");
            nombre = leer.next();
            System.out.println("Tu nombre es " + nombre );
        }

    }
}



