package Servicio;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
 * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vac�o, con par�metros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * M�todo para crear cuenta pidi�ndole los datos al usuario. M�todo
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumar� al
 * saldo actual. M�todo retirar(double): recibe una cantidad de dinero a retirar
 * y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
 * a retirar se retirar� el m�ximo posible hasta dejar la cuenta en 0. M�todo
 * extraccionRapida: le permitir� sacar solo un 20% de su saldo. Validar que el
 * usuario no saque m�s del 20%. M�todo consultarSaldo: permitir� consultar el
 * saldo disponible en la cuenta. M�todo consultarDatos: permitir� mostrar todos
 * los datos de la cuenta.
 *
 */
import Entidades.CuentaBancaria;

public class CuentaBancariaServicio {

    CuentaBancaria c1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {

    }

}
