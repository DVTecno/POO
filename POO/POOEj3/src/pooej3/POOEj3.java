package pooej3;

import Entidad.Operacion;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuaci�n, se deben crear los siguientes m�todos: M�todo
 * constructor con todos los atributos pasados por par�metro. M�todo constructor
 * sin los atributos pasados por par�metro. M�todos get y set. M�todo para
 * crearOperacion(): que le pide al usuario los dos n�meros y los guarda en los
 * atributos del objeto. M�todo sumar(): calcular la suma de los n�meros y
 * devolver el resultado al main. M�todo restar(): calcular la resta de los
 * n�meros y devolver el resultado al main M�todo multiplicar(): primero valida
 * que no se haga una multiplicaci�n por cero, si fuera a multiplicar por cero,
 * el m�todo devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicaci�n y se devuelve el resultado al main M�todo dividir(): primero
 * valida que no se haga una divisi�n por cero, si fuera a pasar una divisi�n
 * por cero, el m�todo devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al
 * main.
 *
 * @author veras
 */
public class POOEj3 {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        Operacion op1 = new Operacion(50, 2);

        op.crearOperacion();

        System.out.println("N�mero ingresado por usuario");
        System.out.println("el resultado de la suma de los n�meros ingresados es: " + op.suma());
        System.out.println("el resultado de la resta de los n�meros ingresados es: " + op.resta());
        System.out.println("el resultado de la multiplicaci�n de los n�meros ingresados es: " + op.multipilcacion());
        System.out.println("el resultado de la divisi�n de los n�meros ingresados es: " + op.division());
        System.out.println("");
        System.out.println("N�meros por default");
        System.out.println("el resultado de la suma de los n�meros ingresados es: " + op1.suma());
        System.out.println("el resultado de la resta de los n�meros ingresados es: " + op1.resta());
        System.out.println("el resultado de la multiplicaci�n de los n�meros ingresados es: " + op1.multipilcacion());
        System.out.println("el resultado de la divisi�n de los n�meros ingresados es: " + op1.division());

    }

}
