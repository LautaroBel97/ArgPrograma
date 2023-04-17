package LibroAPP.entidad;
import java.util.Scanner;
public class Puntos {
    Scanner sc = new Scanner(System.in);
    double x1;
    double y1;
    double x2;
    double y2;
    
    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Puntos() {
    }

    public void crearPuntos() {
        System.out.println("Ingrese las coordenadas de los 2 puntos");
        System.out.print("x1: ");
        x1= sc.nextDouble();
        System.out.print("y1: ");
        y1= sc.nextDouble();
        System.out.print("x2: ");
        x2= sc.nextDouble();
        System.out.print("y2: ");
        y2= sc.nextDouble();
    }

    public double distanciaPuntos() {
        double distancia = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1), 2)));
        return distancia;
    }
    
    

}
