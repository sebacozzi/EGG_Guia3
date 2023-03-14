package ejercicio_14;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        int N, M, sumEdad;
        System.out.print("Ingresar la cantidad de Familias: ");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("¿Cuantos hijos tiene la familia " + i + "? ");
            M = leer.nextInt();
            sumEdad = 0;
            for (int j = 1; j <= M; j++) {
                System.out.print("Ingresar la edad del hijo " + j + ": ");
                sumEdad += leer.nextInt();
            }
            if (M == 0) {
                System.out.println("La Familia " + i + " no tiene hijos.");
            } else {
                System.out.println("La Familia " + i + " tiene " + M
                        + " hijos, la media de edades es " + ((float) sumEdad / M) + " años.");
            }
        }
    }
}
