package pooguia.extrasej1;

import java.util.Scanner;

public class POOGuiaExtrasEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9];

        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String respuesta = leer.nextLine();

        while (!respuesta.equals(mesSecreto)) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            respuesta = leer.nextLine();
        }

        System.out.println("¡Ha acertado!");
    }
}
