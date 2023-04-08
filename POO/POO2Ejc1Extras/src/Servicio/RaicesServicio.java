package Servicio;

import Entidades.Raices;

/**
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente fórmula: (b^2)-4*a*c Método tieneRaices():
 * devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
 * el discriminante debe ser mayor o igual que 0. Método tieneRaiz(): devuelve
 * un booleano indicando si tiene una única solución, para que esto ocurra, el
 * discriminante debe ser igual que 0. Método obtenerRaices(): llama a
 * tieneRai?ces() y si devolvió? true, imprime las 2 posibles soluciones. Método
 * obtenerRaiz(): llama a tieneRaiz() y si devolvió? true imprime una única
 * raíz. Es en el caso en que se tenga una única solución posible. Método
 * calcular(): este? método llamara? tieneRaices() y a tieneRai?z(), y mostrara?
 * por pantalla las posibles soluciones que tiene nuestra ecuación con los
 * métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrara? un mensaje. Nota:
 * Fórmula ecuación 2o grado: (-b±?((b^2)-(4*a*c)))/(2*a) Solo varía el signo
 * delante de -b
 *
 * @author veras
 */
public class RaicesServicio {

    

    public void calcular(double a, double b, double c) {
        Raices ecuacion = new Raices(a, b, c);
        if (ecuacion.tieneRaices()) {
            ecuacion.obtenerRaices();
        } else if (ecuacion.tieneRaiz()) {
            ecuacion.obtenerRaiz();
        } else {
            System.out.println("No hay una solucion");
        }

    }
}
