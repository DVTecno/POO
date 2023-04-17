package com.dvtecno.peluqueria.logica;

import com.dvtecno.peluqueria.percistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void guardar(String text, String text0, String color, String alergico, String atencionEspecial, String observaciones, String nombreDuenio, String text1) {
 //reamos el objeto y se asignan los valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCellDuenio(text1);
        // se crea el objeto de mascota y seteamos lo valores
        Mascota masco = new Mascota();
        masco.setNombre(text);
        masco.setRaza(text0);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio); //se setea la relacion de uno a uno de la mascota con el duenio
        
        controlpersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        // retoena los valores solicitados en lista tal cual se pidio
        return controlpersis.traerMascota() ;
    }

    public void borrarMascota(int num_cliente) {
        controlpersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlpersis.traerMascota(num_cliente);

    }

    
}
