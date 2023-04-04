package poo2;

import Entidades.Persona;
import Servicio.ServicioPersona;

public class POO2 {

    public static void main(String[] args) {
        ServicioPersona sp1 =new ServicioPersona();
        Persona persona1 = sp1.crearPersona();
        sp1.mostrarPersona(persona1);
     

    }

   

}
