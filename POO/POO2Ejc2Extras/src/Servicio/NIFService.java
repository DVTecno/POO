package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        //inicializar el vector con las letras requeridas
        char[] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        NIF nfPadre = new NIF();//crear una instancia de la clase NIF
       //solicitar el dni
        System.out.print("Ingrese el dni: ");
        nfPadre.setDNI(leer.nextLong());
        //calcular mod del dni % 23 
        int resto = (int) (nfPadre.getDNI() % 23);
        //asignar al vector el resto del mod y setearlo
        nfPadre.setLetra(vector[resto]);
        //Retornar el nif
        return nfPadre;
    }

    public void mostrar(NIF nfPadre) {
        //Mostrar nif
        System.out.println("------------------");
        System.out.println("NIF: " + nfPadre.getDNI() + "-" + nfPadre.getLetra());
        System.out.println("------------------");
    }

}
