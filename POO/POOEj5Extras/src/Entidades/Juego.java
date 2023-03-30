

package Entidades;

import java.util.Scanner;

public class Juego {
 private int numeroX;
    private int intentosMax = 0;
    private int cont = 0;


    public Juego(int numeroX, int intentosMax) {
        this.numeroX = numeroX;
        this.intentosMax = intentosMax;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;

    }

    public int getNumeroX() {
        return numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void iniciar_juego(Juego juego) {
        Scanner leer = new Scanner(System.in);
       
        do {
             System.out.println("Jugador 2 adivina el numero secreto! "+(cont+1));
            int num = leer.nextInt();
            if (num != juego.getNumeroX()) {
                juego.setCont(cont +1);
            } else {
                System.out.println("Adivinaste");
                
                break;
            }
        } while (juego.getCont() < juego.getIntentosMax());
        if (juego.getCont()>2) {
            System.out.println("Mejor suerte para la proxima!");
            
        } else {
            System.out.println("Felicidades! se acabo el juego.");
        }
        
    }
}
