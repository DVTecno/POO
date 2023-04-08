package Servicio;

import Entidades.Raices;

/**
 * M�todo getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente f�rmula: (b^2)-4*a*c M�todo tieneRaices():
 * devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
 * el discriminante debe ser mayor o igual que 0. M�todo tieneRaiz(): devuelve
 * un booleano indicando si tiene una �nica soluci�n, para que esto ocurra, el
 * discriminante debe ser igual que 0. M�todo obtenerRaices(): llama a
 * tieneRai?ces() y si devolvi�? true, imprime las 2 posibles soluciones. M�todo
 * obtenerRaiz(): llama a tieneRaiz() y si devolvi�? true imprime una �nica
 * ra�z. Es en el caso en que se tenga una �nica soluci�n posible. M�todo
 * calcular(): este? m�todo llamara? tieneRaices() y a tieneRai?z(), y mostrara?
 * por pantalla las posibles soluciones que tiene nuestra ecuaci�n con los
 * m�todos obtenerRaices() o obtenerRaiz(), seg�n lo que devuelvan nuestros
 * m�todos y en caso de no existir soluci�n, se mostrara? un mensaje. Nota:
 * F�rmula ecuaci�n 2o grado: (-b�?((b^2)-(4*a*c)))/(2*a) Solo var�a el signo
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
