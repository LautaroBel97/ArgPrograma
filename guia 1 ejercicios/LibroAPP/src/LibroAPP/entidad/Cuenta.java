package LibroAPP.entidad;

import java.util.Scanner;

public class Cuenta {
    
    Scanner read = new Scanner(System.in);
    int saldo;
    String titular;
    boolean log = false;
    public Cuenta(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void cajero() {
        System.out.println("Bienvenido a su cuenta "+titular);
        System.out.println("------------------------------------------");
        do {
        log = true; 
        System.out.println("Eliga una opcion: ");
        System.out.println("1-LEER SALDO.");
        System.out.println("2-INGRESAR DINERO.");
        System.out.println("3-RETIRAR DINERO.");
        System.out.println("4-SALIR.");
        int opcion = Integer.parseInt(read.nextLine());
        switch (opcion) {
            case 1: leerSaldo();
                    break;
            case 2: ingresarSaldo();
                    break;
            case 3: retirarSaldo();
                    break;
            case 4: System.out.println("Gracias por usar nuestros servicios. Adios.");
                    log=false;
                    break;
        }
       } while (log==true);
    }

    public void leerSaldo() {
        System.out.println("Su saldo es de " +getSaldo()+ " pesos");
    }

    public void ingresarSaldo() {
        System.out.println("Introduzca el monto que desea ingresar en la cuenta: ");
        int ingreso = Integer.parseInt(read.nextLine());
        setSaldo(saldo + ingreso);

    }

    public void retirarSaldo() {
        System.out.println("Introduzca el monto a retirar: ");
        int retiro = Integer.parseInt(read.nextLine());
        while (retiro > saldo) {       
            System.out.println("Saldo insuficiente");
            System.out.println("Introduzca el monto a retirar:");
            retiro = Integer.parseInt(read.nextLine());
        }
        setSaldo(saldo - retiro);
    }

    
    

}
