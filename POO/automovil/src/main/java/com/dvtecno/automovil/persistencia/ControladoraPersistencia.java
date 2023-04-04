package com.dvtecno.automovil.persistencia;

import com.dvtecno.automovil.logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();

    public void agregarAuto(Automovil auto) {
        autoJPA.create(auto);
    }

}
