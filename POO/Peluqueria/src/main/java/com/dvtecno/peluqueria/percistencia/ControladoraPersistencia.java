package com.dvtecno.peluqueria.percistencia;

import com.dvtecno.peluqueria.logica.Duenio;
import com.dvtecno.peluqueria.logica.Mascota;
import com.dvtecno.peluqueria.percistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascoJPA = new MascotaJpaController();

    public void guardar(Duenio duenio,Mascota masco) {
        //creamos la tabla en la base de datos duenio
        duenioJPA.create(duenio);
        //creamos la tabla en la base de datos mascota
        mascoJPA.create(masco);

    }

    public List<Mascota> traerMascota() {
        //Trae todos los valores de mascota y los retorna a quien los llamo
        return mascoJPA.findMascotaEntities();
    }

   

    public void borrarMascota(int num_cliente) {
      
        try {
            mascoJPA.destroy(num_cliente);
            
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }

    public Mascota traerMascota(int num_cliente) {

      return mascoJPA.findMascota(num_cliente);
    }
}
