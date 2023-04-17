package mascotapp;


import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Mascota m1 = new Mascota("Firulay","Firu","Perro");
        
        

        m1.setNombre("Firulay2");

        m1.pasear(50, 10);

        Mascota m2 = new Mascota();

        m2.setNombre(leer.next());
        m2.setEdad(leer.nextInt());
        
        System.out.println(m2);
        leer.close();
    }
}
