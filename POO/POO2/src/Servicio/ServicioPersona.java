package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.print("Ingrse el nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrse el apellido: ");
        p1.setApellido(leer.next());
        System.out.print("Ingrse el dni: ");
        p1.setDni(leer.next());
        System.out.println("");
        return p1;
    }

    public void mostrarPersona(Persona persona1) {
        System.out.println("-----------------");
        System.out.println("  Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("     DNI: " + persona1.getDni());
        System.out.println("-----------------");

    }

}
