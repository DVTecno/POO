package Entidades;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, en RaicesServicio las
 * operaciones que se podrán realizar son las siguientes:
 *
 * @author veras
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
         if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else {
            System.out.println("La ecuacion no tiene soluciones reales");
        }

    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La única solucion es x = " + x);
        } else {
            System.out.println("La ecuacion no tiene una única solucion real");
        }
    }

}
