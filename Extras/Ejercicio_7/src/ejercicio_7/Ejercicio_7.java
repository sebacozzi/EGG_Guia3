package ejercicio_7;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a analizar: ");
        int n = leer.nextInt();
        if (n <= 0) {
            System.out.println("el número debe ser mayor que 0");
            return;
        }
        int cont = 1, num, suma, maxi, mini;
      
        maxi = Integer.MIN_VALUE;
        mini = Integer.MAX_VALUE;
        suma = 0;
        while (cont <= (n)) {
            System.out.print("Ingrese un número entero: ");
            num = leer.nextInt();
            if (num > 0) {
                if (num > maxi) {
                    maxi = num;
                } else if (num < mini) {
                    mini = num;
                }
                suma += num;
                cont++;
            }
        }
        System.out.println("Resultados utilizando bucle ''WHILE'' ");
        System.out.println("El número mayor introducido fue: " + maxi);
        System.out.println("El número menor introducido fue: " + mini);
        System.out.println("El promedio de los números fue: " + (float) (suma / n));
        System.out.println("-------------------------");
        cont = 1;
        mini = Integer.MAX_VALUE;
        maxi = Integer.MIN_VALUE;
        suma = 0;
        do {
            System.out.print("Ingrese un número entero: ");
            num = leer.nextInt();
            if (num > 0) {
                if (num > maxi) {
                    maxi = num;
                } else if (num < mini) {
                    mini = num;
                }
                suma += num;
                cont++;
            }
        } while (cont <= n);
        System.out.println("Resultados utilizando bucle ''DO - WHILE'' ");
        System.out.println("El número mayor introducido fue: " + maxi);
        System.out.println("El número menor introducido fue: " + mini);
        System.out.println("El promedio de los números fue: " + (float) (suma / n));
    }
}
