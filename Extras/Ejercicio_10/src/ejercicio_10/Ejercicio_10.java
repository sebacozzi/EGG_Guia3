
package ejercicio_10;

import java.util.Scanner;

/**Realice un programa para que el usuario adivine el resultado de una 
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta. 
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
 * su respuesta nuevamente. Para realizar este ejercicio investigue como 
 * utilizar la función Math.random() de Java.
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        int n1= (int) (Math.random()*10);
        int n2=(int) (Math.random()*10);
        int multi;
        do{
            System.out.print("Adivina la multiplicación de n1*n2: ");
            multi= leer.nextInt();
            if ((n1*n2)== multi){
              System.out.println("Felicitaciones!!! Adivinaste");
              break;
            } else {
                System.out.println("Respueta incorrecta. (" + n1 +"-"+ n2+")");
                System.out.println("");
            }
        } while (true);
        
    }
    
}
