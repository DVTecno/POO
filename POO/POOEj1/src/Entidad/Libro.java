package Entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author veras
 */
public class Libro {
//  Atributos

    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroDePagina;
//  Contrutor

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }
//  Metodos

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.nextLine();
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese el número de páginas");
        this.numeroDePagina = leer.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("-----------------------------------------");
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("La cantidad de páginas del libro son: " + numeroDePagina);
        System.out.println("-----------------------------------------");

    }

}
