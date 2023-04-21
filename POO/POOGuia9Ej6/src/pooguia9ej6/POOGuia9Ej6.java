package pooguia9ej6;

import Curso.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class POOGuia9Ej6 {

    public static void main(String[] args) {
        Curso curso = new Curso();

        // Crear un nuevo curso
        System.out.println("Creando un nuevo curso...");
        curso.crearCurso();

        // Imprimir la información del curso
        System.out.println("Información del curso:");
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: " + curso.getPrecioPorHora());
        System.out.println("Alumnos: " + Arrays.toString(curso.getAlumnos()));

        // Calcular la ganancia semanal del curso
        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("Ganancia semanal del curso: " + gananciaSemanal);
    }
}
