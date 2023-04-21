package Curso;

import java.util.Scanner;

public class Curso {

    private Scanner leer = new Scanner(System.in);
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    // Constructor por defecto
    public Curso() {
    }

    // Constructor con todos los atributos como parámetro
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // Getters y setters de cada atributo
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    // Método cargarAlumnos()
    public void cargarAlumnos() {
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = leer.nextLine();
        }
    }

    // Método crearCurso()
    public void crearCurso() {

        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = leer.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = leer.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = leer.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = leer.nextDouble();
        cargarAlumnos();
    }

    // Método calcularGananciaSemanal()
    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * 5 * cantidadDiasPorSemana * alumnos.length;
    }
}
