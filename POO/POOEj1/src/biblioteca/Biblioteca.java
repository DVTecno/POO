package biblioteca;

import Entidad.Libro;

/**
 * "Ficciones" de Jorge Luis Borges. ISBN: 9789877380874. 150 p�ginas. "El
 * Aleph" de Jorge Luis Borges. ISBN: 9789500723129. 224 p�ginas. "El T�nel" de
 * Ernesto Sabato. ISBN: 9788432228313. 168 p�ginas. "Rayuela" de Julio
 * Cort�zar. ISBN: 9788466320711. 736 p�ginas.
 *
 * @author veras
 */
public class Biblioteca {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.mostrarLibro();
    }
}
