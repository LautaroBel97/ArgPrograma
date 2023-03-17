package ejerciciosguiaJAVA.guia1;

import java.io.InputStream;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ejerciciosguia1 { 

    public static void main(String[] agrs) {

        //EJERCICIO 1
        /* try (Scanner leer = new Scanner(System.in)) {
            int num1;
            int num2;
            System.out.println("ingrese dos numeros enteros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
              	
            int suma = num1 + num2;
            System.out.println("La suma es " + suma);
        }  */
        
        //EJERCICIO 2
        /* try (Scanner leer = new Scanner(System.in)) {
            String nombre;
            System.out.println("Ingresa tu nombre");
            nombre = leer.nextLine();
            System.out.println("Tu nombre es " + nombre );
        } */

        //EJERCICIO 3
         /* try (Scanner leer = new Scanner(System.in)) {
            String frase;
            System.out.println("Ingresa una frase");
            frase = leer.nextLine();
            System.out.println(toLowerCase(frase));
            System.out.println(toUpperCase(frase));
        } */
       
        //EJERCICIO 4
       /*  try (Scanner leer = new Scanner(System.in)) {
            int gradosC;
            System.out.println("ingrese temperatura en grados centigrados");
            gradosC = leer.nextInt();
            int gradosF = 32 + (9 * gradosC / 5);
            System.out.println("la temperatura en farenheit es " + gradosF);
        } */

        //EJERCICIO 5 
       /*  try (Scanner leer = new Scanner(System.in)) {
            int num1;
            System.out.println("ingrese un numero entero");
            num1 = leer.nextInt();
            System.out.println("el doble del numero es " + (num1*2));
            System.out.println("el triple del numero es " + (num1*3));
            System.out.println("la raiz cuadrada del numero es " + (Math.sqrt(num1)));
        }
        */



       


         
    }
}


    


