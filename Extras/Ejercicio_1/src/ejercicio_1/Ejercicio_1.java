package ejercicio_1;
import java.util.Scanner;
/**Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora: dado la cantidad de minutos ingresados calcula la su equivalencia en días y horas");
        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = leer.nextInt();
        int horas=0,dias=0,mi=0;
        dias =Math.round(minutos / (60*24));
        horas = (minutos - (60*24*dias))/60;  
        mi= minutos - ((60*24*dias)+(60*horas));
        System.out.println(minutos + " minutos son: "+dias+" días, " + horas + " Horas y " +mi + " minutos.");
        //System.out.println("dias: "+dias);
        
    }
    
}
