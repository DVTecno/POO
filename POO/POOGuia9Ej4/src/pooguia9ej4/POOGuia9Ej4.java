package pooguia9ej4;

import java.util.Date;

import servicio.FechaService;

public class POOGuia9Ej4 {

    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        Date fecha1 = fecha.fechaNacimiento();
        Date fechaActual = fecha.fechaActual();
        System.out.println(fechaActual);
        System.out.println("Edad " + fecha.diferencia(fecha1, fechaActual));
    }

}
