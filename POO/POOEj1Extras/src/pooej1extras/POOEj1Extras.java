package pooej1extras;

import java.util.Scanner;
import pooej1extras.entidad.Cancion;

public class POOEj1Extras {

    /**
     * Desarrollar una clase Cancion con los siguientes atributos: título y
     * autor. Se deberá definir además dos constructores: uno vacío que
     * inicializa el título y el autor a cadenas vacías y otro que reciba como
     * parámetros el título y el autor de la canción. Se deberán además definir
     * los métodos getters y setters correspondientes.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cancion cancion01 = new Cancion("Veneno", "Emanero");
        System.out.println(cancion01.getTitulo() + " - " + cancion01.getAutor());

        Cancion cancion02 = new Cancion();
        System.out.print("Ingrese el Titulo de la cancion: ");
        cancion02.setTitulo(leer.nextLine());
        System.out.print("Ingrese el Autor de la cancion: ");
        cancion02.setAutor(leer.nextLine());

        System.out.println(cancion02.getTitulo() + " - " + cancion02.getAutor());

        System.out.println(cancion01.toString());
        System.out.println(cancion02.toString());
    }
}
