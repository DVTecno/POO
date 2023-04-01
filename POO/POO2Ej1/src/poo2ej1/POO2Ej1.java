package poo2ej1;

import Entidades.Persona;

public class POO2Ej1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Miguel", "O", 51, 80, 1.65);
        Persona p2 = new Persona("Juan", "H", 30, 90, 1.75);
        Persona p3 = new Persona();
        Persona p4 = new Persona("Sofi", "M", 17, 55, 1.55);
        p3.crearPersona();

        System.out.println(p1.getNombre());
        p1.calcularIMC(p1.getPeso(), p1.getAltura());
        System.out.println(p1.getNombre() + " es mayor de edad? " + p1.esMayorDeEdad(p1.getEdad()));

        System.out.println(p2.getNombre());
        p2.calcularIMC(p2.getPeso(), p2.getAltura());
        System.out.println(p2.getNombre() + " es mayor de edad? " + p2.esMayorDeEdad(p2.getEdad()));

        System.out.println(p3.getNombre());
        p3.calcularIMC(p3.getPeso(), p3.getAltura());
        System.out.println(p3.getNombre() + " es mayor de edad? " + p3.esMayorDeEdad(p3.getEdad()));

        System.out.println(p4.getNombre());
        p4.calcularIMC(p4.getPeso(), p4.getAltura());
        System.out.println(p4.getNombre() + " es mayor de edad? " + p4.esMayorDeEdad(p4.getEdad()));

    }

}
