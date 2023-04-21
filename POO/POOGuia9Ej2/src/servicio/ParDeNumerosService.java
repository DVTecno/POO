

package servicio;

import entidades.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros obj1) {
        System.out.println("Valor 1: " + obj1.getNumero1());
        System.out.println("Valor 1: " + obj1.getNumero2());

    }

    public double devolverMayor(ParDeNumeros obj1) {
        return Math.max(obj1.getNumero1(), obj1.getNumero2());
    }

    public double calcularPotencia(ParDeNumeros obj1) {

        int potenciaMay;
        int potenciaMen;

        potenciaMay = (int) Math.max(Math.round(obj1.getNumero1()), Math.round(obj1.getNumero2()));
        potenciaMen = (int) Math.min(Math.round(obj1.getNumero1()), Math.round(obj1.getNumero2()));
        return (int) Math.pow(potenciaMay, potenciaMen);
    }

    public double calculaRaiz(ParDeNumeros obj1) {
        return Math.abs(Math.sqrt(Math.min(obj1.getNumero1(), obj1.getNumero2())));
    }
}
