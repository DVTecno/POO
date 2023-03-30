package Entidades;

/**
 * Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de n�meros. El primer jugador elige un
 * n�mero y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * n�mero limitado de intentos y recibe una pista de "m�s alto" o "m�s bajo"
 * despu�s de cada intento. El juego termina cuando el segundo jugador adivina
 * el n�mero o se queda sin intentos. Registra el n�mero de intentos necesarios
 * para adivinar el n�mero y el n�mero de veces que cada jugador ha ganado.
 *
 * @author veras
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }

    public Empleado calcularAumento(Empleado empleado) {
        
        if (empleado.getEdad() > 30) {
            empleado.setSalario(salario * 1.10);
        } else {
            empleado.setSalario(salario * 1.05);
        }
        return empleado;
    }
}
