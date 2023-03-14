package ejercicio_9.v2;

import java.util.Scanner;

/**
 * Division por resta
 */
public class Ejercicio_9V2 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        // inicialización de Scanner
        int divisor = 0, dividendo = 0, resto = 0, cociente = 0;
        System.out.print("Ingresar división: (n1/n2) ");
        String division[] = leer.nextLine().split("/");
        dividendo = Integer.parseInt(division[0].trim());
        divisor = Integer.parseInt(division[1].trim());
        System.out.println("----------------------");
        System.out.println("Calculo: " + dividendo + "/"+divisor);
        System.out.println("Calculando: ");
        resto = dividendo;
        do {
            System.out.println(resto + " - " + divisor + " = " + (resto - divisor));
            resto -= divisor;
            cociente++;
        } while (resto >= divisor);
        System.out.println("--------------");
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
}
