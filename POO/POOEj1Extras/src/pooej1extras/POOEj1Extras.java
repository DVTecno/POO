package pooej1extras;

import java.util.Scanner;
import pooej1extras.entidad.Cancion;

public class POOEj1Extras {

    /**
     * Desarrollar una clase Cancion con los siguientes atributos: t�tulo y
     * autor. Se deber� definir adem�s dos constructores: uno vac�o que
     * inicializa el t�tulo y el autor a cadenas vac�as y otro que reciba como
     * par�metros el t�tulo y el autor de la canci�n. Se deber�n adem�s definir
     * los m�todos getters y setters correspondientes.
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
