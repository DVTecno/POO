package servicios;
import entidades.Cadena;
import java.util.Scanner;
public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    public Cadena mostrarVocales() {
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        cadena.setFrase(leer.nextLine());
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (cadena.getFrase().substring(i, i + 1).equals(vocales.substring(j, j + 1))) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return cadena;
    }

   

    public void invertirFrase(Cadena cadena) {
        

    }
    
    
    

}
