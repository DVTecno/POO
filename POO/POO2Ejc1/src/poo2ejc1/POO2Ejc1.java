package poo2ejc1;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class POO2Ejc1 {

    public static void main(String[] args) {
        CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();

        CuentaBancaria cuentaGold = cuenta1.crearCuenta();
        Scanner leer = new Scanner(System.in);
        int opc;

        do {

            System.out.println("""
            --Seleccione una opcion--
            1. Deposito
            2. Extraccion
            3. Extraccion Rapida
            4. Consultar Saldo
            5. Consultar Datos
            6. Salir
                    """);
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {cuenta1.ingresarDinero(cuentaGold);}
                case 2 -> cuenta1.retirarDinero(cuentaGold);
                case 3 -> cuenta1.extraccionRapida(cuentaGold);
                case 4 -> cuenta1.consultarSaldo(cuentaGold);
                case 5 -> cuenta1.consultarDatos(cuentaGold);
                case 6 -> System.out.println("Buenas Tardes");

            }
        } while (opc != 6);

    }
}
