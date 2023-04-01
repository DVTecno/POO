package Entidades;

/**
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
 * área del rectángulo.
 *
 * @author veras
 */
public class Rectangulo {

    private final int lado1;
    private final int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcularArea() {
        return lado1 * lado2;
    }

    public void mostrar() {
        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
