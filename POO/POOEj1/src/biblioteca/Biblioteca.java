package biblioteca;

import Entidad.Libro;
import java.util.Scanner;

/**
 * "Ficciones" de Jorge Luis Borges. ISBN: 9789877380874. 150 páginas. "El
 * Aleph" de Jorge Luis Borges. ISBN: 9789500723129. 224 páginas. "El Túnel" de
 * Ernesto Sabato. ISBN: 9788432228313. 168 páginas. "Rayuela" de Julio
 * Cortázar. ISBN: 9788466320711. 736 páginas.
 *
 * @author veras
 */
public class Biblioteca {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();

        libro1.cargarLibro();
        libro1.mostrarLibro();

    }
}
