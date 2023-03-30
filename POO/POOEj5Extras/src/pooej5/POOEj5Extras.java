package pooej5;

import Entidades.Cuenta;
import java.util.Scanner;

public class POOEj5Extras {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Crearemos una nueva cuenta:");
        Cuenta cuenta = new Cuenta().crearCuenta();
        System.out.println("Desea retirar dinero?  si/no");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("si")) {
            cuenta.retirarDinero(cuenta);
            System.out.println(cuenta.toString());
        } else {
            System.out.println("Gracias por utizar el servicio!");
        }

    }

}
