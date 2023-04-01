

package Entidades;

import java.util.Scanner;

public class Persona {
private String nombre, sexo;
    private int edad;
    private double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
//    private String nombre, sexo;
//    private int edad;
//    private double peso, altura;
        System.out.println("Ingresa tu nombre");
        this.nombre = leer.nextLine();
        System.out.println("Ingresa tu sexo (h/m/o)");
        this.sexo = leer.nextLine();

        while (!sexo.toLowerCase().equals("h") && !sexo.toLowerCase().equals("m") && !sexo.toLowerCase().equals("o")) {
            System.out.println("La letra ingresa es incorrecta, ingrese (h/m/o)");
            this.sexo = leer.nextLine();
        }

        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();
        System.out.println("Ingresa tu peso en kg");
        peso = leer.nextDouble();
        System.out.println("Ingresa tu altura en metros");
        altura = leer.nextDouble();
    }

    public double calcularIMC(double peso, double altura) {
        double imc;
        imc = (int) (peso / (Math.pow(altura, 2)));

        if (imc < 20) {
            imc = -1;
            System.out.println("Por debajo del peso");

        } else if (imc > 25) {
            imc = 1;
            System.out.println("Por encima del peso");
        } else {
            imc = 0;
            System.out.println("Peso ideal");
        }
        return imc;
    }

    public boolean esMayorDeEdad(int edad) {
        boolean mayor = true;
        if (edad < 18) {
            mayor = false;
        }
        return mayor;

    }
}
