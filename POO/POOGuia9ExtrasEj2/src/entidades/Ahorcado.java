package entidades;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
 * un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas
 * máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
 *
 * @author veras
 */
public class Ahorcado {

    private String[] palabra;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;
    private String[] palabraAux;

    public Ahorcado() {
        this.cantidadLetrasEncontradas = 0;
        this.cantidadJugadasMaximas=0;
        
    }

    public Ahorcado(String[] palabra, int cantidadLetrasEncontradas, int cantidadJugadasMaximas, String[] palabraAux) {
        this.palabra = new String [palabra.length];
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
        this.palabraAux = new String [palabra.length];
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    

}
