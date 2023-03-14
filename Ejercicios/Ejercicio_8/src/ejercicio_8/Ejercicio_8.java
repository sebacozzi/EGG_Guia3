
package ejercicio_8;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
 * dibujar lo siguiente:
 *           * * *
 *           *   *
 *           * * *
*/
public class Ejercicio_8 {

    public static void main(String[] args) {
        // Creacion del Scanner para obtener los datos del usuario
        Scanner leer = new Scanner(System.in);
        // en cara se va almacenar el largo y alto de cuadrado
        System.out.print("Ingrese los elementos de la cara del cuadrado: ");
        int cara=leer.nextInt();
       // int j,i;
       // utilización de FOR para generar el cuadrado 
       // con j manejamos las columnas y con i las filas
        for (int i = 0; i < cara; i++) {
            for (int j = 0; j < cara; j++) {
                if (i==0 || i==cara-1 || j==0 ||j==cara-1) {
                    // imprime " *" cuando esta en la primera y ultima fila y
                    // cuando está en la primera y ultima columna
                    // sino imprime "  ".
                    System.out.print("* "); 
                } else {
                    System.out.print("  ");
                }
                
            }
            // impresión de salto de linea
            System.out.println("");
        }
    }
    
}
