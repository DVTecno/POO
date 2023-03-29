package Entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * T�tulo, Autor, N�mero de p�ginas, y un constructor con todos los atributos
 * pasados por par�metro y un constructor vac�o. Crear un m�todo para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro m�todo el
 * n�mero de ISBN, el t�tulo, el autor del libro y el n�mero de p�ginas.
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
        System.out.println("Ingrese el n�mero de p�ginas");
        this.numeroDePagina = leer.nextInt();

    }

    public void mostrarLibro() {
        System.out.println("-----------------------------------------");
        System.out.println("El t�tulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("La cantidad de p�ginas del libro son: " + numeroDePagina);
        System.out.println("-----------------------------------------");

    }

}
