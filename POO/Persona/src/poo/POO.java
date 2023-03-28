package poo;

import Entidad.Persona;
import java.util.Scanner;

public class POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerNum = new Scanner(System.in);

        Persona persona1 = new Persona();
        System.out.print("Persona 1. Ingrese Nombre: ");
        persona1.setNombre(leer.nextLine());
        System.out.print("Ingrese Apellido: ");
        persona1.setApellido(leer.nextLine());
        System.out.print("Ingrese DNI: ");
        persona1.setDni(leerNum.nextInt());
        System.out.print("Ingrese Edad: ");
        persona1.setEdad(leerNum.nextInt());
        System.out.println("---------------------------------");
        Persona persona2 = new Persona();
        System.out.print("Persona 2. Ingrese Nombre: ");
        persona2.setNombre(leer.nextLine());
        System.out.print("Ingrese Apellido: ");
        persona2.setApellido(leer.nextLine());
        System.out.print("Ingrese DNI: ");
        persona2.setDni(leerNum.nextInt());
        System.out.print("Ingrese Edad: ");
        persona2.setEdad(leerNum.nextInt());

        System.out.println("Nombre " + persona1.getNombre() + " Apellido" + persona1.getApellido());
        System.out.println("Edad " + persona1.getEdad() + " Dni " + persona1.getDni());
        System.out.println("Nombre " + persona2.getNombre() + " Apellido " + persona2.getApellido());
        System.out.println("Edad " + persona2.getEdad() + " Dni " + persona2.getDni());

    }

}
