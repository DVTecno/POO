package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 * M�todo esMayorDeEdad(): indica si la persona es mayor de edad. La funci�n
 * devuelve un booleano. Metodo crearPersona(): el m�todo crear persona, le pide
 * los valores de los atributos al usuario y despu�s se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Adem�s, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deber� mostrar un mensaje M�todo calcularIMC(): calculara si la persona est�
 * en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta f�rmula da por
 * resultado un valor menor que 20, significa que la persona est� por debajo de
 * su peso ideal y la funci�n devuelve un -1. Si la f�rmula da por resultado un
 * n�mero entre 20 y 25 (incluidos), significa que la persona est� en su peso
 * ideal y la funci�n devuelve un 0. Finalmente, si el resultado de la f�rmula
 * es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 * funci�n devuelve un 1. A continuaci�n, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuaci�n,
 * llamaremos todos los m�todos para cada objeto, deber� comprobar si la persona
 * est� en su peso ideal, tiene sobrepeso o est� por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por �ltimo,
 * guardaremos los resultados de los m�todos calcularIMC y esMayorDeEdad en
 * distintas variables(arrays), para despu�s calcular un porcentaje de esas 4
 * personas cuantas est�n por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y tambi�n calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores. Para esto, podemos crear unos m�todos
 * adicionales.
 *
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(leer.nextInt());
        //leer.nextLine();

        System.out.println("Ingrese el sexo de la persona ('H' para hombre, 'M' para mujer, 'O' para otro): ");
        persona.setSexo(Character.toUpperCase(leer.next().charAt(0)));
        //leer.nextLine();
        while (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O') {
            System.out.println("Sexo incorrecto. Ingrese el sexo de la persona ('H' para hombre, 'M' para mujer, 'O' para otro): ");
            persona.setSexo(Character.toUpperCase(leer.next().charAt(0)));//se convierte el char en mayusculas
            //leer.nextLine();
        }
        System.out.println("Ingrese el peso de la persona en kg: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona en metros: ");
        persona.setAltura(leer.nextDouble());
        leer.nextLine(); // Consumir la nueva l�nea en el b�fer del scanner
        return persona;

    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1; // por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // en el peso ideal
        } else {
            return 1; // con sobrepeso
        }
    }

    public void mostrarIMC(Persona p) {
        int[] peso = new int[4];

        peso[0] = calcularIMC(p);
        p = crearPersona();
        peso[1] = calcularIMC(p);
        p = crearPersona();
        peso[2] = calcularIMC(p);
        p = crearPersona();
        peso[3] = calcularIMC(p);

        int contP1 = 0;
        int contP2 = 0;
        int contP3 = 0;

        for (int i = 0; i < peso.length; i++) {
            switch (peso[i]) {
                case -1 ->
                    contP1++;
                case 0 ->
                    contP2++;
                default ->
                    contP3++;
            }

        }
        int porcBajoPeso = (contP1 * 100) / 4;
        int porcPesoIdeal = (contP2 * 100) / 4;
        int porcSobrePeso = (contP3 * 100) / 4;

        System.out.println("Con bajo peso: " + porcBajoPeso + "%");
        System.out.println("Con peso ideal: " + porcPesoIdeal + "%");
        System.out.println("Con Sobrepeso: " + porcSobrePeso + "%");
    }

    public void mostrarPorcentajeEdad(Persona p) {
        boolean[] edad = new boolean[4];
        int contE1 = 0;
        int contE2 = 0;
        edad[0] = esMayorDeEdad(p);
        p = crearPersona();
        edad[1] = esMayorDeEdad(p);
        p = crearPersona();
        edad[2] = esMayorDeEdad(p);
        p = crearPersona();
        edad[3] = esMayorDeEdad(p);
        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                contE1++;
            } else {
                contE2++;
            }
        }
        int porcMayorEdad = (contE1 * 100) / edad.length;
        int porcMenorEdad = (contE2 * 100) / edad.length;

        System.out.println(
                "Son Mayores de edad: " + porcMayorEdad + "%");
        System.out.println(
                "Son Menores de edad: " + porcMenorEdad + "%");
    }

}
