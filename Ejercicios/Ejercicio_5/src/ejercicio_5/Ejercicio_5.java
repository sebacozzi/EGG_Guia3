package ejercicio_5;
import java.util.Scanner;
public class Ejercicio_5 {
/*
  Escriba un programa en el cual se ingrese un valor límite positivo, y a 
  continuación solicite números al usuario hasta que la suma de los números 
  introducidos supere el límite inicial.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba el limite de la suma: ");
        int maximo = leer.nextInt();
        int num, suma = 0;

        do {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            suma += num;

            System.out.println("Suma: " + suma);
        } while (maximo >= suma);

        System.out.println("fin do 1");

        while (maximo <= suma) {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            suma += num;
            System.out.println("Suma: " + suma);
        }

        System.out.println("fin do 1");

        do {
            System.out.print("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            maximo -= num;
            System.out.println("Saldo Maximo: " + maximo);
        } while (maximo >= 0);


        
    }
    
}
