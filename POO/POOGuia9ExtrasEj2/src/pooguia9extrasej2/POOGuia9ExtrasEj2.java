package pooguia9extrasej2;

import Servicio.AhorcadoService;

public class POOGuia9ExtrasEj2 {

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos previamente
     * mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos.
     * Este método se llamará en el main.
     *
     * @param args
     */
    public static void main(String[] args) {
        AhorcadoService aS = new AhorcadoService();
        aS.juego();
    }
}
