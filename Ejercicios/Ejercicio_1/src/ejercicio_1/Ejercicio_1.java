package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

//Crear un programa que dado un número determine si es par o impar.
    
    public static void main(String[] args) {
        // Inicilización de Scanner
        Scanner leer = new Scanner(System.in);
        // Obtener datos de usuario
        System.out.print("Ingrese un número entero: ");
        int num= leer.nextInt();
        // verificación si el número es par o no utilizando el operador modulo
        if ((num % 2)==0) {
            System.out.println("El número " + num + " es par.");
        } else{
            System.out.println("El número " + num + " es impar.");
        }
    }
    
}
