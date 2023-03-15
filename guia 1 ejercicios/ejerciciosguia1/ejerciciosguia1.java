package ejerciciosguia1;

import java.util.Scanner;

public class ejerciciosguia1 {

    public static void main(String[] agrs) {
        try (Scanner leer = new Scanner(System.in)) {
            String num1;
            String num2;
            System.out.println("ingrese dos numeros enteros");
            num1 = leer.next();
            num2 = leer.next();
              	
            int numEntero1 = Integer.parseInt(num1);
            int numEntero2 = Integer.parseInt(num2);
            int suma = numEntero1 + numEntero2;
            System.out.println("La suma es " + suma);
        }
        

    }
}



