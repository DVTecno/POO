

package servicio;

import java.util.Arrays;

public class ArregloService {
public void inicializarA(double arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random() * 11;
        }
    }

    public void mostrar(double arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println(" ");
    }

    public void ordenar(double arr1[]) {
        Arrays.sort(arr1);

        for (int i = arr1.length; i > 0; i--) {
            System.out.println(arr1[i - 1] + " ");
        }
        System.out.println();

    }

    public void inicializarB(double arr2[], double arr1[]) {
        Arrays.fill(arr2, 9, arr2.length, 0.5);
        System.arraycopy(arr1, 0, arr2, 0, 10);
    }
}
