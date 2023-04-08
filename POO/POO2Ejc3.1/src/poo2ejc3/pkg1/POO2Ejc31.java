package poo2ejc3.pkg1;

import Entidades.Persona;
import Servicio.PersonaServicio;


public class POO2Ejc31 {

    /**
     * Realizar una clase llamada Persona en el paquete de entidades que tengan
     * los siguientes atributos: nombre, edad, sexo (?H? para hombre, ?M? para
     * mujer, ?O? para otro), peso y altura.Si desea añadir algún otro
 atributo, puede hacerlo. Agregar constructores, getters y setters. En el
 paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 devuelve un booleano. Metodo crearPersona(): el método crear persona, le
 pide los valores de los atributos al usuario y después se le asignan a
 sus respectivos atributos para llenar el objeto Persona. Además,
 comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no
 es correcto se deberá mostrar un mensaje


 Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
 que 20, significa que la persona está por debajo de su peso ideal y la
 función devuelve un -1. Si la fórmula da por resultado un número entre 20
 y 25 (incluidos), significa que la persona está en su peso ideal y la
 función devuelve un 0. Finalmente, si el resultado de la fórmula es un
 valor mayor que 25 significa que la persona tiene sobrepeso, y la función
 devuelve un 1. A continuación, en la clase main hacer lo siguiente: Crear
 4 objetos de tipo Persona con distintos valores, a continuación,
 llamaremos todos los métodos para cada objeto, deberá comprobar si la
 persona está en su peso ideal, tiene sobrepeso o está por debajo de su
 peso ideal e indicar para cada objeto si la persona es mayor de edad. Por
 último, guardaremos los resultados de los métodos calcularIMC y
 esMayorDeEdad en distintas variables(arrays), para después calcular un
 porcentaje de esas 4 personas cuantas están por debajo de su peso,
 cuantas en su peso ideal y cuantos, por encima, y también calcularemos un
 porcentaje de cuantos son mayores de edad y cuantos menores. Para esto,
 podemos crear unos métodos adicionales.
     * @param args
     */
    public static void main(String[] args) {
        
        PersonaServicio ps1 = new PersonaServicio();

        System.out.println("Bienvenido!");
        System.out.println("###############################");
        System.out.println("Ingrese los datos de la 1° Persona");
        Persona p1 = ps1.crearPersona();
        switch (ps1.calcularIMC(p1)) {
            case -1 ->
                System.out.println("Esta por debajo de su peso");
            case 0 ->
                System.out.println("Esta en su peso ideal");
            default ->
                System.out.println("Esta por encima de su peso");
        }
        if (ps1.esMayorDeEdad(p1)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("##################################");
        System.out.println("Ingrese los datos de la 2° Persona");
        Persona p2 = ps1.crearPersona();
        switch (ps1.calcularIMC(p2)) {
            case -1 ->
                System.out.println("Esta por debajo de su peso");
            case 0 ->
                System.out.println("Esta en su peso ideal");
            default ->
                System.out.println("Esta por encima de su peso");
        }
        if (ps1.esMayorDeEdad(p2)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");
        System.out.println("Ingrese los datos de la 3° Persona");
        Persona p3 = ps1.crearPersona();
        switch (ps1.calcularIMC(p3)) {
            case -1 ->
                System.out.println("Esta por debajo de su peso");
            case 0 ->
                System.out.println("Esta en su peso ideal");
            default ->
                System.out.println("Esta por encima de su peso");
        }
        if (ps1.esMayorDeEdad(p3)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");
        System.out.println("Ingrese los datos de la 4° Persona");
        Persona p4 = ps1.crearPersona();
        switch (ps1.calcularIMC(p4)) {
            case -1 ->
                System.out.println("Esta por debajo de su peso");
            case 0 ->
                System.out.println("Esta en su peso ideal");
            default ->
                System.out.println("Esta por encima de su peso");
        }
        if (ps1.esMayorDeEdad(p4)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("");

        int[] peso = new int[4];
        boolean[] edad = new boolean[4];

        peso[0] = ps1.calcularIMC(p1);
        peso[1] = ps1.calcularIMC(p2);
        peso[2] = ps1.calcularIMC(p3);
        peso[3] = ps1.calcularIMC(p4);
        edad[0] = ps1.esMayorDeEdad(p1);
        edad[1] = ps1.esMayorDeEdad(p2);
        edad[2] = ps1.esMayorDeEdad(p3);
        edad[3] = ps1.esMayorDeEdad(p4);
        int contP1 = 0;
        int contP2 = 0;
        int contP3 = 0;
        int contE1 = 0;
        int contE2 = 0;

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
        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                contE1++;
            } else {
                contE2++;
            }
        }
        int porcMayorEdad = (contE1 * 100) / 4;
        int porcMenorEdad = (contE2 * 100) / 4;
        System.out.println("Son Mayores de edad: " + porcMayorEdad + "%");
        System.out.println("Son Menores de edad: " + porcMenorEdad + "%");
    }

}
