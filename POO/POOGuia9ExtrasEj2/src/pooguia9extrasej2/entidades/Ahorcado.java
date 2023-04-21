package pooguia9extrasej2.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private char[] palabra;
    private boolean[] encontradas;
    private int jugadasMaximas;
    private int jugadasRestantes;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, boolean[] encontradas, int jugadasMaximas, int jugadasRestantes) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.jugadasRestantes = jugadasRestantes;
    }

    public void crearJuego() {
        
        System.out.println("Ingrese la palabra a buscar:");
        String palabraStr = scanner.next().toLowerCase();
        this.palabra = palabraStr.toCharArray();
        this.encontradas = new boolean[palabra.length];
        Arrays.fill(this.encontradas, false);

        System.out.println("Ingrese la cantidad máxima de jugadas:");
        this.jugadasMaximas = scanner.nextInt();
        this.jugadasRestantes = jugadasMaximas;

        System.out.println("Juego creado! La palabra tiene " + palabra.length + " letras.");
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas[i] = true;
                encontrada = true;
            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra!");
        } else {
            System.out.println("La letra no pertenece a la palabra...");
            jugadasRestantes--;
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        int encontradasCount = 0;
        for (int i = 0; i < encontradas.length; i++) {
            if (encontradas[i]) {
                encontradasCount++;
            }
        }
        int faltantesCount = palabra.length - encontradasCount;

        System.out.println("Número de letras (encontradas, faltantes): (" + encontradasCount + "," + faltantesCount + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + jugadasRestantes);
    }

    public void juego() {
       

        while (jugadasRestantes > 0 && !Arrays.equals(encontradas, new boolean[palabra.length])) {
            System.out.println("Ingrese una letra:");
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean encontrada = buscar(letra);
            encontradas(letra);
            intentos();

            if (Arrays.equals(encontradas, new boolean[palabra.length])) {
                System.out.println("¡Felicitaciones! ¡Has adivinado la palabra!");
            }
        }

        if (jugadasRestantes == 0) {
            System.out.println("Se acabaron tus oportunidades... La palabra era: " + String.valueOf(palabra));
        }
    }
}
