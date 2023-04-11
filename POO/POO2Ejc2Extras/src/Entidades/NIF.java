

package Entidades;

public class NIF {
private long DNI;
private char letra;

    public NIF() {
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF{");
        sb.append("DNI=").append(DNI);
        sb.append(", letra=").append(letra);
        sb.append('}');
        return sb.toString();
    }

}
