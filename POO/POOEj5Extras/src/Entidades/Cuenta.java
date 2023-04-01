package Entidades;

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta nuevaCuenta = new Cuenta();
        System.out.println("Titular:");
        nuevaCuenta.setTitular(leer.nextLine());
        System.out.println("Saldo:");
        nuevaCuenta.setSaldo(leer.nextDouble());
        return nuevaCuenta;
    }

    public void retirarDinero(Cuenta cuenta) {
        boolean salida = true;
        do {

            Scanner leer = new Scanner(System.in);
            System.out.println("Cuanto desea retirar?");
            double retiro = leer.nextDouble();
            if (cuenta.getSaldo() < retiro) {
                System.out.println("No es posible retirar esa cantidad!");
                salida = true;
            } else {
                cuenta.setSaldo(saldo - retiro);
                salida=false;
            }
        } while (salida);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular  " + titular + ", saldo = " + saldo + '}';
    }

}
