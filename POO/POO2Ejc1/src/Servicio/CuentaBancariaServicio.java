package Servicio;

/**
 * Método para crear cuenta pidiéndole los datos al usuario. Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. Método retirar(double): recibe una cantidad de dinero a retirar
 * y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
 * a retirar se retirará el máximo posible hasta dejar la cuenta en 0. Método
 * extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%. Método consultarSaldo: permitirá consultar el
 * saldo disponible en la cuenta. Método consultarDatos: permitirá mostrar todos
 * los datos de la cuenta.
 *
 *
 */
import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.print("Ingrese el numero de Cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese el numero de Dni Cliente: ");
        cuenta.setDniCliente(leer.nextLong());

        return cuenta;
    }

    public void ingresarDinero(CuentaBancaria cuentaGold) {
        System.out.println("------------------------------------------");
        System.out.print("Ingrese el Saldo Actual: $");
        cuentaGold.setSaldoActual(leer.nextDouble() + cuentaGold.getSaldoActual());
        System.out.println("------------------------------------------");
    }

    public void retirarDinero(CuentaBancaria cuentaGold) {
        System.out.println("------------------------------------------");
        System.out.print("Ingrese el monto a retirar: $");
        double ingreso = leer.nextDouble();
        if (ingreso < cuentaGold.getSaldoActual()) {
            cuentaGold.setSaldoActual(cuentaGold.getSaldoActual() - ingreso);
        } else if (ingreso > cuentaGold.getSaldoActual() && cuentaGold.getSaldoActual() == 0) {
            System.out.println("Sin saldo, busque trabajo!!!: $" + cuentaGold.getSaldoActual());
        } else {
            System.out.println("Solo puede retirar: $" + cuentaGold.getSaldoActual());
            cuentaGold.setSaldoActual(0.0);
        }
        System.out.println("------------------------------------------");
    }

    public void extraccionRapida(CuentaBancaria cuentaGold) {
        System.out.println("------------------------------------------------");
        System.out.println("Metodo extraccion rapida del 20% del saldo actual");

        double saldoActual = cuentaGold.getSaldoActual();
        double extraccionRapida = saldoActual * 0.2;

        if (extraccionRapida <= 0.50) {
            System.out.println("Saldo insuficiente para realizar la extracción rápida.");
        } else {
            cuentaGold.setSaldoActual(saldoActual - extraccionRapida);
            System.out.println("Retiro: $" + extraccionRapida);
        }
        
        System.out.println("------------------------------------------------");
    }

    public void consultarSaldo(CuentaBancaria cuentaGold) {
        System.out.println("------------------------------------------");
        System.out.println("Saldo Actual en la cuenta: $" + cuentaGold.getSaldoActual());
        System.out.println("------------------------------------------");
    }

    public void consultarDatos(CuentaBancaria cuentaGold) {
        System.out.println("------------------------------------------");
        System.out.println("Numero de cuenta: " + cuentaGold.getNumeroCuenta());
        System.out.println("Numero de DNI del titular: " + cuentaGold.getDniCliente());
        System.out.println("------------------------------------------");
    }

}
