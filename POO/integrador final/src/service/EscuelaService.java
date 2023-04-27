package service;

import entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

public class EscuelaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Creo el objeto Alumno, asignando su nombre y nota
    public Estudiante crearEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = leer.next();
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = leer.nextDouble();
        // Retorno el objeto a quien lo llamne
        return new Estudiante(nombre, nota);
    }

    // Cargo a los alumno generados y retornados por el metodo crearEstudiante()
    public Estudiante[] cargarAlumno() {
        // Dimensiono mi vector del objeto Estudiante
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int dimension = leer.nextInt();
        Estudiante[] estudiantes = new Estudiante[dimension];
        //Invoco al metodo crearEstudiante() y guardo los Objetos en el vector previmente dimensionado
        for (int i = 0; i < dimension; i++) {
            estudiantes[i] = crearEstudiante();
        }
        //Retorno el vector
        return estudiantes;
    }

    //Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio(Estudiante[] estudiantes) {
        //Creo un acumulador y lo inicializo en 0
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();

        }
        //Saco el promedio de la nota de los estudiantes y lo retorno.
        double promedio = suma / estudiantes.length;
        return promedio;
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron 
    //una nota mayor al promedio del curso
    public String[] notaMayorPromedio(Estudiante[] estudiantes) {
        double promedio = calcularPromedio(estudiantes);
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {

                count++;
            }
        }
        String[] nombresNotaMayor = new String[count];
        int i = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresNotaMayor[i] = estudiante.getNombre();
                nombresNotaMayor[i] += " Nota: " + Double.toString(estudiante.getNota());
                i++;
            }
        }

        return nombresNotaMayor;
    }

    //Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    public void mostrarEstudianteNotaMayor(Estudiante[] estudiantes) {
        System.out.println("Promedio: "+calcularPromedio(estudiantes));
        System.out.println("Los estudiantes con el mayor promedio son: ");
        String[] nombres = notaMayorPromedio(estudiantes);
        for (String nombre : nombres) {
            System.out.println("Nombre: "+nombre + " ");

        }
        System.out.println(Arrays.toString( nombres));
    }

}
