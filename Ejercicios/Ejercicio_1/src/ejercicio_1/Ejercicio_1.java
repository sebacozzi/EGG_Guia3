package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

//Crear un programa que dado un número determine si es par o impar.
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int num= leer.nextInt();
        if ((num % 2)==0) {
            System.out.println("El número " + num + " es par.");
        } else{
            System.out.println("El número " + num + " es impar.");
        }
    }
    
}
