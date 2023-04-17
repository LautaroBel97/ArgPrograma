package LibroAPP.entidad;

import java.util.Scanner;



public class Circunferencia {
    static Scanner sc = new Scanner(System.in);

    private double radio;

    
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        radio = sc.nextDouble();
    }

    public void area() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de la circunferencia es "+area);
    }
    
    public void perimetro() {
        double per = 2 * Math.PI * radio;
        System.out.println("El perimetro de la circunferencia es "+per);
    }
}
