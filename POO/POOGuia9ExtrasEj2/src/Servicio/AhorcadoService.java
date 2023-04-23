package Servicio;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de 
//la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas 
//y el valor que ingresó el usuario.

    public void crearJuego(Ahorcado ahorcado) {

        System.out.print("Definas las oportunidades: ");
        ahorcado.setCantidadJugadasMaximas(leer.nextInt());
        System.out.print("Ingrese la palabra: ");
        String palabra = leer.next();

        String[] vectorPalabra = new String[palabra.length()];
        String[] vectorPalabraAux = new String[palabra.length()];
        for (int i = 0; i < vectorPalabra.length; i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);
            vectorPalabraAux[i] = "_";
        }

        ahorcado.setPalabra(vectorPalabra);
        ahorcado.setPalabraAux(vectorPalabraAux);

    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar 
//como se usa el vector.length.   

    public void longitud(Ahorcado ahorcado) {
        System.out.println("El numero de letras a buscar es: " + ahorcado.getPalabra().length);
        System.out.print("Palabra ");
        for (String letra : ahorcado.getPalabraAux()) {
            System.out.print(letra + " ");
        }
        System.out.println("");
    }
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra 
//ingresada es parte de la palabra o no. También informará si la letra estaba o no.  

    public void buscar(Ahorcado ahorcado, String letra) {
        boolean bandera = false;
        int count = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra().equals(letra)) {

                count++;
                bandera = true;
            }
        }
        ahorcado.setCantidadLetrasEncontradas(count);
        if (count == 0) {
            System.out.println("La letra no esta en la palabra: ");
        } else {
            System.out.println("La letra esta en la palbra: " + ahorcado.getCantidadLetrasEncontradas());
        }

    }
//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas 
//letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true 
//si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra 
//que no esté, se le restará uno a sus oportunidades.

    public String encontradas(Ahorcado ahorcado, String letra) {
        boolean bandera = false;
        int count = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i].equalsIgnoreCase(letra)) {
                if (ahorcado.getPalabraAux()[i].equals("_")) {
                    ahorcado.getPalabraAux()[i] = letra;

                    count++;
                    ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() + count);
                }
                bandera = true;
            }
        }
        if (!bandera) {
            ahorcado.setCantidadJugadasMaximas(ahorcado.getCantidadJugadasMaximas() - 1);
        }
        return letra;
    }
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.    

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Te quedan: " + ahorcado.getCantidadJugadasMaximas() + " intentos");
    }
    //Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra 
//o se quede sin intentos. Este método se llamará en el main. 

    public void juego() {
        Ahorcado ahorcado = new Ahorcado();
        crearJuego(ahorcado);
        String letra;
        boolean ganaste = false;
        do {

            longitud(ahorcado);
            intentos(ahorcado);
            System.out.print("Ingresa la letra: ");
            letra = leer.next();
            encontradas(ahorcado, letra);

            ganaste = ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabra().length;
        } while (ahorcado.getCantidadJugadasMaximas() != 0 && ahorcado.getCantidadLetrasEncontradas() != ahorcado.getPalabra().length);
        if (ganaste) {
            System.out.println("Ganaste!");

        } else {
            System.out.println("No encontraste la palabra ):");
        }

    }

}
