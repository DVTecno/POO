package Entidades;

public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{"
                + "lado1=" + lado1
                + ", lado2=" + lado2
                + '}';
    }

    public Rectangulo crearRectangulo(double lado1, double lado2) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLado1(lado1);
        rectangulo.setLado2(lado2);
        return rectangulo;
    }

    public double calcular_area(Rectangulo rectangulo) {
        double area;
        area = rectangulo.getLado1() * rectangulo.getLado2();
        return area;
    }

}
