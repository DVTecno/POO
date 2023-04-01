package pooej6;

import Entidades.Empleado;

public class POOEj6Extras {

    /**
     * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
     * "salario". Luego, crea un m�todo "calcular_aumento" que calcule el
     * aumento salarial de un empleado en funci�n de su edad y salario actual.
     * El aumento salarial debe ser del 10% si el empleado tiene m�s de 30 a�os
     * o del 5% si tiene menos de 30 a�os.
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
