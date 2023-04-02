
package com.dvtecno.login.logica;

import com.dvtecno.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

   

    public String validarUsuario(String usuario, String contrasena) {
       String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasena().equals(contrasena)) {
                    mensaje= "Usuario y contrasena correctos. Bienvenido/a!";
                }else  {
                    mensaje= "Contrasena incorrectos";
                    
                }
            }else{
                    mensaje= "Usuario no encontrado";
                
            }
        }
        
        return mensaje;
    }
    
    
}
