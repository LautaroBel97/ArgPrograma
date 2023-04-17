package guia3;

import java.io.InputStream;
import java.util.Scanner;

public class ejerciciosguia3 { 

    public static void main(String[] agrs) {
        
        /*  int num1;
        int num2;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("ingrese dos numeros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            if (num1 > 25 || num2 > 25) {
                System.out.println("uno o ambos numeros es mayor a 25");
            }else {
                System.out.println("ninguno es mayor a 25");
            }
        }
         */
        
         //------------------------------------------
         /* int opcionMotor;
        try (Scanner leer = new Scanner(System.in)) { 
            System.out.println("Ingrese un tipo de motor de 1 a 4");

    	opcionMotor = leer.nextInt();

    	switch (opcionMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;

            case 3:
            System.out.println("La bomba es una bomba de hormigon");
            break;
            case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
            }
        }   */  

        //----------------------------------------------

        /* int nota;
        try (Scanner leer = new Scanner(System.in)) {
                System.out.println("Ingrese una nota de 0 a 10");
               
                nota = leer.nextInt();
            
            while (nota > 10) {
                System.out.println("ingrese una nota valida");
                nota = leer.nextInt();
            } 
            System.out.println("La nota es " + nota);
        } */

        //-------------------------------------------

        /* int num;
        int contador = 0 ;
        int suma = 0;
        try (Scanner leer = new Scanner(System.in)) {
            
            do {
                System.out.println("ingrese 20 numeros");
                num = leer.nextInt();
                if (num==0) {System.out.println("se ingreso un 0");
                 break;
                }
                if (num>0) {
                    suma=suma + num;
                }
                contador++;
            } while (contador<=20);
            System.out.println("la suma es" + suma);       
         } */

         //--------------------------------------------------

         int numero;
         try (Scanner leer = new Scanner(System.in)) {
            for (int i=0;i < 4;i++){
                System.out.println("ingrese un numero entre 1 y 20");
                numero = leer.nextInt();
                for (int j=0; j<numero;j++) {
                    System.out.print("*");
                }
             System.out.println(" ");   
            }
         } 
    }


}