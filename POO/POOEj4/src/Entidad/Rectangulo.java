package Entidad;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void creaRectangulo() {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        
        do {
            if (leer.hasNextInt()) {
                this.base = leer.nextInt();
                if (this.base > 0) {
                    break;
                } else {
                    System.out.print("El numero debe ser mayor que cero. Intente nuevamente: ");
                }
            } else {
                System.out.print("Tipo de dato incorrecto. Intente nuevamente: ");
                leer.next();// descarta el valor no entero
            }
        } while (true);

    
        System.out.print("Ingrese la altura del rectangulo ");

      
        do {
            if (leer.hasNextInt()) {
                this.altura = leer.nextInt();
                if (this.altura > 0) {
                    break;
                } else {
                    System.out.print("El numero debe ser mayor que cero. Intente nuevamente: ");
                }
            } else {
                System.out.print("Tipo de dato incorrecto. Intente nuevamente: ");
                leer.next();// descarta el valor no entero
            }
        } while (true);

        System.out.println("------------------------------------");

    }

    public int calcularSuperficie() {
        int superficie;
        return superficie = base * altura;

    }

    public int calcularPerimetro() {
        int perimetro;
        return perimetro = (base + altura) * 2;

    }

    public void dibujarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" *  ");
            }
            System.out.println("");
        }
    }

}
