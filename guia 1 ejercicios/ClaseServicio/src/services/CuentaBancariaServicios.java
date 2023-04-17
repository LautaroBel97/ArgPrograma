package services;

import java.util.Scanner;
import entidades.CuentaBancaria;
import java.util.Random;

public class CuentaBancariaServicios {
    Scanner sc = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta () {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese el dni del titular: ");
        c1.setDniCliente(sc.nextLong());
        Random random = new Random();
        c1.setNumeroCuenta(random.nextInt(999999999));
        System.out.println("Se le asigno el numero de cuenta: ");
        System.out.println(c1.getNumeroCuenta());
        return c1;
    }

    


    public void ingresarSaldo(CuentaBancaria cuenta) {
        System.out.println("Introduzca el monto que desea ingresar en la cuenta: ");
        double ingreso = (sc.nextDouble());
        cuenta.setSaldoActual(cuenta.getSaldoActual()+ingreso);
    }

    public void retirarSaldo(CuentaBancaria cuenta) {
        System.out.println("Introduzca el monto a retirar: ");
        double retiro = sc.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {       
            System.out.println("Saldo insuficiente, se retirara lo maximo posible");
            retiro = cuenta.getSaldoActual();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
    }
    
    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Introduzca el monto a retirar: ");
        double retiro = sc.nextDouble();
        while (retiro > cuenta.getSaldoActual()*0.2) {       
            System.out.println("Solo se le permite retirar 20% del saldo actual, ingrese un monto menor");
            retiro = sc.nextDouble();
            
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo es de " +cuenta.getSaldoActual()+ " pesos");
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("DNI Titular:");
        System.out.println(cuenta.getDniCliente());
        System.out.println("N de Cuenta:");
        System.out.println(cuenta.getNumeroCuenta());
        System.out.println("Saldo:");
        System.out.println(cuenta.getSaldoActual());
    }

}