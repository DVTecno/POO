package integrador.pkgfinal;

import entidades.Estudiante;
import service.EscuelaService;

public class IntegradorFinal {

    public static void main(String[] args) {
        EscuelaService eS = new EscuelaService();
        Estudiante [] alumno = eS.cargarAlumno();
        eS.notaMayorPromedio(alumno);
        eS.mostrarEstudianteNotaMayor(alumno);
        

    }

}
