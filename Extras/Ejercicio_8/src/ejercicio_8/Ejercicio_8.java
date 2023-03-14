package ejercicio_8;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        int n, contPares = 0, contImpares = 0, cont = 0;
        do {
            System.out.print("Ingrese un número mayor que cero: ");
            n = leer.nextInt();
            if (n > 0) {
                if (n % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
                cont++;
                if (n % 5 == 0) {
                    break;
                }
            }
        } while (true);
        System.out.println("La cantidad de números leidos: " + cont);
        System.out.println("Números pares totales: " + contPares);
        System.out.println("Números impares totales: " + contImpares);
    }

}
