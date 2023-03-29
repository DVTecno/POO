package Entidad;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

//constructor con parametros
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el número 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
    }

    public int suma() {
        return this.num1 + this.num2;
    }

    public int resta() {
        return this.num1 - this.num2;
    }

    public int multipilcacion() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Algunos de los números ingresados son 0");
            return 0;
        } else {
            return this.num1 * this.num2;
        }
    }

    public int division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Algunos de los números ingresados son 0");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }
}
