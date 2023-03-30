package pooej6;

import Entidades.Empleado;

public class POOEj6Extras {

    /**
     * Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a
     * dos jugadores jugar un juego de adivinanza de n�meros. El primer jugador
     * elige un n�mero y el segundo jugador intenta adivinarlo. El segundo
     * jugador tiene un n�mero limitado de intentos y recibe una pista de "m�s
     * alto" o "m�s bajo" despu�s de cada intento. El juego termina cuando el
     * segundo jugador adivina el n�mero o se queda sin intentos. Registra el
     * n�mero de intentos necesarios para adivinar el n�mero y el n�mero de
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
