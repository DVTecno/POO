package com.dvtecno.automovil.persistencia;

import com.dvtecno.automovil.logica.Automovil;
import com.dvtecno.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    //devolver autos
    public List<Automovil> traerAutos =   autoJPA.findAutomovilEntities();;
   //agrega autos
    public void agregarAuto(Automovil auto) {
        autoJPA.create(auto);
    }
    //elimina autos
    //modifica autos

    public void eliminarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
       return autoJPA.findAutomovil(idAuto);
        
    }

    public void modificarAuto(Automovil auto)  {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
