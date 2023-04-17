package LibroAPP.entidad;

import java.util.Scanner;

public class Libro { 
    static Scanner read = new Scanner(System.in);
    
    private String isbn;
    private String titulo;
    private String autor;
    private int numPags;

    public Libro() {
    }

    public static Scanner getRead() {
        return read;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public Libro(String isbn, String titulo, String autor, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public void ingresarLibro() {
        System.out.println("Ingrese los datos del libro");
        System.out.print("ISBN: ");
        isbn  = read.nextLine();
        System.out.print("Título: ");
        titulo  = read.nextLine();
        System.out.print("Autor: ");
        autor  = read.nextLine();
        System.out.print("paginas: ");
        numPags  = Integer.parseInt(read.nextLine());
    } 

    public void mostrarLibro() {
        System.out.println("El libro se llama "+titulo+ ", su autor es " +autor+ ", tiene "+numPags+" paginas y su ISBN es "+isbn+".");
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPags=" + numPags + '}';
    }

    

    
}

