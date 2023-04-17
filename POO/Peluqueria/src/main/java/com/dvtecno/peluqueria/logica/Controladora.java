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
        Mascota mascota = new Mascota();
        mascota.setNombre(text);
        mascota.setRaza(text0);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio); //se setea la relacion de uno a uno de la mascota con el duenio

        controlpersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        // retoena los valores solicitados en lista tal cual se pidio
        return controlpersis.traerMascota();
    }

    public void borrarMascota(int num_cliente) {
        controlpersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlpersis.traerMascota(num_cliente);

    }

    public void modificarMascota(Mascota mascota, String text, String text0, String color, String alergico, String atencionEspecial, String observaciones, String nombreDuenio, String text1) {
        //setear los nuevos valores obtenidos
        mascota.setNombre(text);
        mascota.setRaza(text0);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        //modificar mascota
        controlpersis.modificarMascota(mascota);
        //Datos del duenio y se setean
        Duenio duenio = this.buscarDuenio(mascota.getUnDuenio().getIdDuenio());
        duenio.setCellDuenio(text1);//el text1 hace referencia a llamar a cell si variable y se asignan columnas text, text0, text1 ya asi...
        duenio.setNombre(nombreDuenio);
        //llamar modificar duenio
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controlpersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlpersis.modificarDuenio(duenio);

    }

}
