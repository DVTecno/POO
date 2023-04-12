package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        
        System.out.print("Ingrse el nombre: ");
        String Nombre =leer.next();
        System.out.print("Ingrse el apellido: ");
        String Apellido=leer.next();
        System.out.print("Ingrse el dni: ");
        String Dni=leer.next();
        System.out.println("");
        return new Persona(Nombre,Apellido,Dni);
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("-----------------");
        System.out.println("  Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("     DNI: " + persona.getDni());
        System.out.println("-----------------");

    }

}
