package poo2ejc2;
import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;
public class POO2Ejc2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs1 = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        int opc;

        do {
            System.out.println("""
               Seleccione una opcion
            1. Llenar cafetera
            2. Servir taza
            3. Vaciar cafetera
            4. Agregar cafe
            5. Salir
                     """);
            cs1.limpiarPantalla();

            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {

                    cs1.llenarCafetera(c1);

                }
                case 2 -> {

                    System.out.println("Tamanio taza: ");
                    int taza = leer.nextInt();
                    cs1.servirTaza(c1, taza);

                }
                case 3 -> {

                    cs1.vaciarCafetera(c1);

                }
                case 4 -> {

                    System.out.println("Cantidad cafe ");
                    int cafe = leer.nextInt();
                    cs1.agregarCafe(c1, cafe);

                }

                case 5 -> {
                    cs1.limpiarPantalla();
                    System.out.println("Gracias por elegirnos");
                    cs1.limpiarPantalla();
                    cs1.limpiarPantalla();
                    
                }

            }
        } while (opc != 5);

    }

}
