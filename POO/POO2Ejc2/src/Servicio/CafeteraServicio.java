package Servicio;

import Entidades.Cafetera;

public class CafeteraServicio {

    public void llenarCafetera(Cafetera c1) {
       
        System.out.println("----------------------------------------------");
        int capacidad = c1.getCapacidadMaxima();
        c1.setCantidadActual(capacidad);
        System.out.println("La cantidad actual " + c1.getCantidadActual() + " ML");
        System.out.println("----------------------------------------------");
       
    }

    public void servirTaza(Cafetera c1, int taza) {
       
        System.out.println("----------------------------------------------");
        int capacidad = c1.getCantidadActual();

        System.out.println("la capacidad " + capacidad + " ML");
        System.out.println("Sirviendo taza...");

        if (capacidad > taza) {
            System.out.println("La taza se llenó totalmente");
            c1.setCantidadActual(capacidad - taza);
            System.out.println("La cantidad actual " + c1.getCantidadActual() + " ML");
        } else {
            double llenado = ((double) (c1.getCantidadActual()) / (double) (taza)) * 100;
            System.out.println("La taza se llenó al " + llenado + "%");
            c1.setCantidadActual(0);
        }
        System.out.println("----------------------------------------------");
     
    }

    public void vaciarCafetera(Cafetera c1) {
        
        System.out.println("----------------------------------------------");
        c1.setCantidadActual(0);
        System.out.println("Vaciando cafetera...");
        System.out.println("La cantidad actual " + c1.getCantidadActual() + " ML");
        System.out.println("----------------------------------------------");
       
    }

    public void agregarCafe(Cafetera c1, int cafe) {
        
        System.out.println("-----------------------------");
        int cantidadActual = c1.getCantidadActual() + cafe;
        int cafeAgregar = Math.min(c1.getCapacidadMaxima() - c1.getCantidadActual(), cafe);
        if (cafeAgregar < cafe) {
            System.out.println("No se puede agregar mas cafe, la capacidad maxima de la cafetera es " + c1.getCapacidadMaxima() + " ML.");
        } else {
            c1.setCantidadActual(cantidadActual);
            System.out.println("Se agrego " + cafe + " ML de cafe.");
        }
        System.out.println("La cantidad actual " + c1.getCantidadActual() + " ML");
        System.out.println("-----------------------------");
       
    }

    

    public void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n\n");
    }

   
}

