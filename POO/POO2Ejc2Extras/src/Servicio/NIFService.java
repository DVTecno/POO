package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        char[] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        NIF nf = new NIF();//crear una instancia de la clase NIF

        System.out.println("Ingrese el dni: ");

        nf.setDNI(leer.nextLong());

        int resto = (int) (nf.getDNI() % 23);
        nf.setLetra(vector[resto]);

        return nf;
    }

    public void mostrar(NIF nf) {
        System.out.println("------------------");
        System.out.println("NIF: " + nf.getDNI() + "-" + nf.getLetra());
        System.out.println("------------------");
    }

}
