package pooguia9ej2;

import entidades.ParDeNumeros;
import servicio.ParDeNumerosService;

public class POOGuia9Ej2 {

    public static void main(String[] args) {

        ParDeNumerosService par1 = new ParDeNumerosService();
        ParDeNumeros p2 = new ParDeNumeros();

        par1.mostrarValores(p2);
        System.out.println("El Mayor es: " + par1.devolverMayor(p2));
        System.out.println("La potencia del mayor elevado al menor es = " + par1.calcularPotencia(p2));
        System.out.println("La raiz del menor numero es: " + par1.calculaRaiz(p2));

    }

}
