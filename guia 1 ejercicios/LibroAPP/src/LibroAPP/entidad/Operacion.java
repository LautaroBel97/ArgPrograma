package LibroAPP.entidad;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;
    static Scanner sc = new Scanner(System.in);
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese dos numeros");
        setNum1(sc.nextInt());
        setNum2(sc.nextInt());
    }

    public int suma(){
        return num1+num2;
        
    }

    public int resta(){
        int resultado = num1-num2;
        return resultado;
    }

    public int multiplicacion() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR");
            return 0;
            
        } else {
            int resultado = num1 * num2;
            return resultado;
        }
    }

    public double division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR");
            return 0;
            
        } else {
            double resultado = num1 / num2;
            return resultado;
        }
    }



    
    
}
