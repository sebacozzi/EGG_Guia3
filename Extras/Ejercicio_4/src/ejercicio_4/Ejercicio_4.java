package ejercicio_4;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un número del 1 al 10 para convertirlo en Romano: ");
        int n = leer.nextInt();
        String resultado = "Fuera del rango";
        boolean enRango = (n > 0) && (n < 11);
        if (enRango) {
            resultado = "";
            // converción del número
            // entre 1 y 3 repite I n veces
            // 4 almacena IV
            // entre 5 y 8 almacena V y repite I n-5 veces
            // 9 almacena IX
            // 10 almacena X
            switch (n) {
                case 1, 2, 3:
                    resultado += "I".repeat(n);
                    break;
                case 4:
                    resultado = "IV";
                    break;
                case 5, 6, 7, 8:
                    resultado = "V" + "I".repeat(n - 5);
                    break;
                case 9:
                    resultado = "IX";
                    break;
                case 10:
                    resultado = "X";
                    break;
            }
        }
        System.out.println(n + " en números romanos: " + resultado);
    }
    
}
