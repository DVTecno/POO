package entidades;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }


}
