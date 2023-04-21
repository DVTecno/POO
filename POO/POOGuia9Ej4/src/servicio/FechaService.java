package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento (DIA, MES, AÑO )");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {

        return new Date();
    }

    public int diferencia(Date fecha1, Date fecha2) {
        fecha2.setYear(fecha2.getYear() + 1900);
        int dif = fecha1.compareTo(fecha2);

        if (dif > 0) {
            dif = fecha1.getYear() - (fecha2.getYear());
        } else if (dif == 0) {
            dif = fecha1.getYear();
        } else {
            dif = (fecha2.getYear()) - fecha1.getYear();
        }
        return dif;
    
    
    }   
}
