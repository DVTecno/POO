

package com.dvtecno.login.persistencia;

import com.dvtecno.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        
        return usuJpa.findUsuarioEntities();
        //SELET * FROM USUARIOS
    }
    
    

}
