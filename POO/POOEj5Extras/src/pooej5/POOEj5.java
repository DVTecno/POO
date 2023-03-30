package pooej5;

import Entidades.Juego;

public class POOEj5 {

    public static void main(String[] args) {

        Juego juego = new Juego(5, 3);
        juego.iniciar_juego(juego);
    }

}
