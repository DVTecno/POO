package biblioteca;

import Entidad.Libro;

public class Biblioteca {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.mostrarLibro();
    }
}
