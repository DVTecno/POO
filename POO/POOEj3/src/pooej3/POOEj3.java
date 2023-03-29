package pooej3;

import Entidad.Operacion;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 * @author veras
 */
public class POOEj3 {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        Operacion op1 = new Operacion(50, 2);

        op.crearOperacion();

        System.out.println("Número ingresado por usuario");
        System.out.println("el resultado de la suma de los números ingresados es: " + op.suma());
        System.out.println("el resultado de la resta de los números ingresados es: " + op.resta());
        System.out.println("el resultado de la multiplicación de los números ingresados es: " + op.multipilcacion());
        System.out.println("el resultado de la división de los números ingresados es: " + op.division());
        System.out.println("");
        System.out.println("Números por default");
        System.out.println("el resultado de la suma de los números ingresados es: " + op1.suma());
        System.out.println("el resultado de la resta de los números ingresados es: " + op1.resta());
        System.out.println("el resultado de la multiplicación de los números ingresados es: " + op1.multipilcacion());
        System.out.println("el resultado de la división de los números ingresados es: " + op1.division());

    }

}
