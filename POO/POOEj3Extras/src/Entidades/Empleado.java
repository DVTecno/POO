

package Entidades;

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
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
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