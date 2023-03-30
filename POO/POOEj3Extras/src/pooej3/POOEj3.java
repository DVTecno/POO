package pooej3;

import Entidades.Empleado;

public class POOEj3 {

    public static void main(String[] args) {
      Empleado empleado1 = new Empleado("Pablo", 45, 10000.0);
        empleado1.calcularAumento(empleado1);
        System.out.println(empleado1.toString());
        Empleado empleado2 = new Empleado("Elio", 25, 5000.0);
        empleado2.calcularAumento(empleado2);
        System.out.println(empleado2.toString());
    }

}
