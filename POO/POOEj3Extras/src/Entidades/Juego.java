package Entidades;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author veras
 */
public class Juego {

    private int numeroSecreto;
    private final int numeroIntentos;// al declarar la variable como final indico que sera una constante y que no cambiara su valor durante la ejecucion del programa
    private int jugador1Ganadas;
    private int jugador2Ganadas;

    public Juego() {
        numeroSecreto = 0;
        numeroIntentos = 5;
        jugador1Ganadas = 0;
        jugador2Ganadas = 0;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el numero Adivinar: ");
            numeroSecreto = leer.nextInt();
            int intentos = 0;
            boolean encontrado = false;
            while (intentos < numeroIntentos && !encontrado) {
                System.out.print("Jugador 2, intenta encontrar el numero: ");
                int encontrar = leer.nextInt();

                if (encontrar == numeroSecreto) {
                    System.out.println("Encontraste el numero en  " + (intentos + 1) + " Intentos!!!");
                    jugador2Ganadas++;
                    encontrado = true;
                } else if (encontrar < numeroSecreto) {
                    System.out.println("El número que buscas esta mas alto :) ");
                } else {
                    System.out.println("El número que buscas esta mas bajo:) ");

                }

                intentos++;
            }
            if (!encontrado) {
                System.out.println("No encontraste el numero en " + numeroIntentos + " intentos");
                jugador1Ganadas++;
            }

        }

    }

}
