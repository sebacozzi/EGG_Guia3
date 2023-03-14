
package ejercicio_6;

import java.util.Scanner;

/**Leer la altura de N personas y determinar el promedio de estaturas que se 
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        // inicialización de Scanner
        
        Scanner leer = new Scanner(System.in);
        int contDebajo=0, N;
        float h,sumaDebajo,suma;
        sumaDebajo=(float)0;
        suma=0;
        System.out.print("Ingrese la cantidad de personas: ");
        N= leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingresar la altura de la persona "+i+": ");
            h=Float.parseFloat(leer.next().replace(",", "."));
            if (h<=1.6) {
                contDebajo++;  
                sumaDebajo +=h;
            } 
            suma +=h;
        }
        System.out.println("Personas por debajo de 1,60mts: " + contDebajo);
        System.out.println("Promedio de alturas: " + (sumaDebajo/contDebajo));
        System.out.println("Total de Personas: "+ N);
        System.out.println("Promedio general de alturas: "+ (suma/N));
    }
    
}
