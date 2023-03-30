package pooej1extras;

import java.util.Scanner;
import pooej1extras.entidad.Cancion;

public class POOEj1Extras {

    public static void main(String[] args) {
     
  Scanner leer = new Scanner(System.in);
        Cancion cancion01 = new Cancion("Tu Piel", "Pure Negga");
        System.out.println(cancion01.getTitulo() + " - " + cancion01.getAutor());

        Cancion cancion02 = new Cancion();
        cancion02.setTitulo(leer.nextLine());
        cancion02.setAutor(leer.nextLine());

        System.out.println(cancion02.getTitulo() + " - " + cancion02.getAutor());

        System.out.println(cancion01.toString());
        System.out.println(cancion02.toString());
    }
}