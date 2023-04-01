package pooej7;

import Entidades.Rectangulo;

public class POOEj7 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        System.out.println("El área del rectángulo es: " + rectangulo1.calcularArea());
        System.out.println("");
        rectangulo1.mostrar();
    }

}
