package pooguia8ej3;

import servicio.ArregloService;


public class POOGuia8Ej3 {

    public static void main(String[] args) {
        double a[] = new double[50];
        double b[] = new double[20];
        ArregloService arreglo = new ArregloService();
        arreglo.inicializarA(a);
        arreglo.mostrar(a);
        System.out.println("ORDEN");
        arreglo.ordenar(a);
        arreglo.inicializarB(b, a);
        System.out.println("A");
        arreglo.mostrar(a);
        System.out.println("B");
        arreglo.mostrar(b);
     
       
    }

}
