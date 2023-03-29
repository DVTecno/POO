package Entidad;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuaci�n, se deben crear los siguientes m�todos:
 * M�todo constructor que inicialice el radio pasado como par�metro. M�todos get
 * y set para el atributo radio de la clase Circunferencia. M�todo para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. M�todo area(): para calcular el �rea de la circunferencia
 * (Area=??*radio?^2). M�todo perimetro(): para calcular el per�metro
 * (Perimetro=2*?*radio).
 *
 * @author veras
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
