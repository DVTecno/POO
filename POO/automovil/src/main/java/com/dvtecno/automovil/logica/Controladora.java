

package com.dvtecno.automovil.logica;

import com.dvtecno.automovil.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAuto(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAuto(auto);
        
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos;   
        
    }

    public void eliminarAuto(int idAuto) {
        controlPersis.eliminarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca,
            String motor, String color, String patente, int cantPuertas) {
       auto.setModelo(modelo);
       auto.setMarca(marca);
       auto.setMotor(motor);
       auto.setColor(color);
       auto.setPatente(patente);
       auto.setCantPuertas(cantPuertas);
       //persistencia modifica
       controlPersis.modificarAuto(auto);
    }
    
}
