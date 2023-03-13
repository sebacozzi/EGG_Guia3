package ejercicio_5;
import java.util.Scanner;
public class Ejercicio_5 {
/*
  Escriba un programa en el cual se ingrese un valor límite positivo, y a 
  continuación solicite números al usuario hasta que la suma de los números 
  introducidos supere el límite inicial.
*/
    public static void main(String[] args) {
        // Inicialización del Scanner
        Scanner leer = new Scanner(System.in);
        // Obteniendo el número maximo a superar con la suma
        System.out.print("Escriba el limite de la suma: ");
        int maximo = leer.nextInt();
        // inizialización y creación de variales num(almacena el número ingrado)
        // y suma ( acumulador de la suma inicializado en 0)
        int num, suma = 0;
        // opción 1 del proceso
        // procedimiendo realizado utilizando un acumulador (suma)
        do {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            suma += num;

            System.out.println("Suma: " + suma);
        } while (maximo >= suma);
        suma=0;
        System.out.println("fin do 1");
        // opción 2 del proceso
        // procedimiento realizado con while y un acumulador (suma)
        while (maximo >= suma) {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            suma += num;
            System.out.println("Suma: " + suma);
        }
        System.out.println("fin While 1");
        // opción 3 del proceso
        // procedimiento realizado con do y restando el número ingresado al limite
        do {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            maximo -= num;
            System.out.println("Saldo Maximo: " + maximo);
        } while (maximo >= 0);
        
        System.out.println("fin do 2");
    }
    
}
