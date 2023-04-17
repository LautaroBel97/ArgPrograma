package LibroAPP.entidad;

import java.util.Scanner;

public class Rectangulos {
    Scanner sc = new Scanner(System.in);
    private int base;
    private int altura;
    
    public Rectangulos() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base y altura del rectangulo:");
        setBase(sc.nextInt());
        setAltura(sc.nextInt());
    }

    public void supRec() {
        int sup = base*altura;
        System.out.println("Superficie: "+sup);
    }

    public void perRec() {
        int per = (base+altura)*2;
        System.out.println("Perimetro: "+per);
    }

    public void dibujarRec() {
        for (int i=0;i<base;i++) {
            for (int j=0; j<altura;j++) {
                if (i==0 || i==(base-1) || j==0 || j==(altura-1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();    
        }
    }


    

    


}
