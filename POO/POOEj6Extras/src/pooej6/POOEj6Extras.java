package pooej6;

import Entidades.Empleado;

public class POOEj6Extras {

    /**
     * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a
     * dos jugadores jugar un juego de adivinanza de números. El primer jugador
     * elige un número y el segundo jugador intenta adivinarlo. El segundo
     * jugador tiene un número limitado de intentos y recibe una pista de "más
     * alto" o "más bajo" después de cada intento. El juego termina cuando el
     * segundo jugador adivina el número o se queda sin intentos. Registra el
     * número de intentos necesarios para adivinar el número y el número de
     * veces que cada jugador ha ganado.
     *
     * @param args
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pablo", 45, 10000.0);
        empleado1.calcularAumento(empleado1);
        System.out.println(empleado1.toString());
        Empleado empleado2 = new Empleado("Elio", 25, 5000.0);
        empleado2.calcularAumento(empleado2);
        System.out.println(empleado2.toString());
    }

}
