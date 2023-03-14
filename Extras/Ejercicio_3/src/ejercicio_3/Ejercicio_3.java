
package ejercicio_3;
import java.util.Scanner;        
/**laborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
 * de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
 * equals() de la clase String.
 */
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una letra:");
        String vocal=leer.next();
        vocal=vocal.toUpperCase();
        if (vocal.equals("A") 
            || vocal.equals("E")
            || vocal.equals("I")
            || vocal.equals("O")
            || vocal.equals("U")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
        
    }
    
}
