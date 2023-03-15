package javatest;

import java.util.Scanner;

public class javaintro01 {
/**
 * @param args
 */
public static void main(String[] args) {
    
    int num1 = 5;
	int num2 = 10;
    
	int suma = num1 + num2;
    System.out.println(suma);
	double division = num2 / num1;
    System.out.println(division);
	boolean logico = num2 > num1;
    System.out.println(logico);
    
	num1++;
    System.out.println(num1);
    System.out.println("hello world");

    String nombre = "Lautaro Beltramone";
    int edad = 25;
    System.out.println("Mi nombre es " + nombre + " y mi edad es " + edad + " años");

    int numEntero = 4;	
    String numCadena = String.valueOf(numEntero);
    System.out.println(numCadena + 4);
    

    try (Scanner leer = new Scanner(System.in)) {
        String nombre1;
        System.out.println("Ingrese un nombre");
        nombre1 = leer.next();
        System.out.println("hola soy " + nombre1);
    }
}
}
