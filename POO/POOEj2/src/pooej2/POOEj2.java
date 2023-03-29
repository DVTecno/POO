package pooej2;

import Entidad.Circunferencia;

public class POOEj2 {

    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(2.0);
        System.out.println("El radio de la circunferencia es: " + circunferencia.getRadio());
        System.out.println("El area de la circunferencia es: "+circunferencia.calcularArea());
        System.out.println("El perimetro de la circunferencia es: "+circunferencia.calcularPerimetro());
        System.out.println("-------------------------------------------------------------------");
        circunferencia.setRadio(9.0);
        System.out.println("Nuevo radio: "+circunferencia.getRadio());
        System.out.println("El area de la circunferencia actulizada es: "+circunferencia.calcularArea());
        System.out.println("El perimetro de la circunferencia actulizada es: "+circunferencia.calcularPerimetro());
        
        

    }

}
