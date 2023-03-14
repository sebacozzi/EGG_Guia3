
package ejercicio_9;

import java.util.Scanner;

/**Simular la división usando solamente restas. Dados dos números enteros 
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo 
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un 
 * resultado menor que el divisor, este resultado es el residuo, y el número de 
 * restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37     una resta realizada
    37 – 13 = 24     dos restas realizadas
    24 – 13 = 11     tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        int divisor=0,dividendo=0,resto=0,cociente=0;
        System.out.print("Ingresar dividendo: ");
        dividendo = leer.nextInt();
        System.out.print("Ingresar dividendo: ");
        divisor =leer.nextInt();
        System.out.println("----------------------");
        System.out.println("Calculando: ");
        resto=dividendo;
        do {
            System.out.println(resto+" - "+divisor + " = " + (resto-divisor));
            resto -= divisor;
            cociente++;
        } while (resto>=divisor);
        System.out.println("--------------");
        System.out.println("Cociente: "+ cociente);
        System.out.println("Resto: " + resto);
    }
    
}
