package services;

import java.util.Scanner;
import entidades.Cafetera;

public class CafeteraServicio {
    Scanner input = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera c = new Cafetera(480,0);
        return c;
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("Llenando cafetera...");
        System.out.println("Se llenó la cafetera al maximo de su capacidad: "+c.getCapacidadMaxima()+ " ml.");
    }

    public void servirTaza(Cafetera c) {
        System.out.println("Ingrese en mililitros el tamaño de la taza a llenar:");
        int tazaml = input.nextInt();
        if (tazaml>c.getCantidadActual()) {
            tazaml = c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("Llenando taza...");
            System.out.println("No se pudo llenar la taza. Cantidad servida: "+tazaml+ " ml.");
        } else { 
            System.out.println("Llenando taza...");
            System.out.println("Taza llena.");
            c.setCantidadActual(c.getCantidadActual()-tazaml);
        }
    }

    public void vaciarCafetera(Cafetera c) {
        System.out.println("Vaciando cafetera...");
        c.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c) {
        System.out.println("Ingrese la cantidad en ml de café a realizar:");
        int cafeHecho = input.nextInt();
        System.out.println("Haciendo café...");
        c.setCantidadActual(+cafeHecho);
        System.out.println(c.getCantidadActual()+ " ml de cafe listos para consumir");

    }
}
