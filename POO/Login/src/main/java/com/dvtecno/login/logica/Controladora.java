package com.dvtecno.login.logica;

import com.dvtecno.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasena) {
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        boolean usuarioEncontrado = false;
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                usuarioEncontrado = true;
                if (usu.getContrasena().equals(contrasena)) {
                    mensaje = "Usuario y contrasena correctos. Bienvenido/a!";
                    return mensaje;
                } else {
                    mensaje = "Contrasena incorrecta";
                    return mensaje;
                }
            }
        }
        if (!usuarioEncontrado) {
            mensaje = "Usuario no encontrado";
        }
        return mensaje;
    }

}
