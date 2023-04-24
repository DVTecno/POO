/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los 
doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, 
y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario 
que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar 
adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package pooguia.extrasej1;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class POOGuiaExtrasEj1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[(int) (Math.random() * 12)];
        char respuesta= ' ';
        
        do {
            System.out.println("Ingrese el mes secreto:");
            String adivine = leer.next();

            if (
                    adivine.equals(mesSecreto)) {

                System.out.println("Adivinaste!!");
                break;
            }else{
                System.out.println("No adivinaste!! intenta de nuevo");
                System.out.println("Queres volver a intentar?");
                respuesta = leer.next().charAt(0);
            }
        }while(respuesta =='s');
         System.out.println("El mes secreto: "+mesSecreto);   
    }

}
