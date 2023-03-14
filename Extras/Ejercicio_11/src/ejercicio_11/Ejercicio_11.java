package ejercicio_11;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 * utilizando el operador de división. Nota: recordar que las variables de tipo
 * entero truncan los números o resultados.
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        int n, digitos = 0;
        System.out.print("Ingresar un número entero para calcular la cantidad de digitos: ");
        n = leer.nextInt();
        do {
            n = n / 10;
            digitos++;
        } while (n != 0);
        System.out.println("El número tiene " + digitos + " digitos.");
    }

}
