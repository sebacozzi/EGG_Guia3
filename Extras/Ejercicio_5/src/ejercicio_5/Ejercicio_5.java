package ejercicio_5;

import java.util.Scanner;

/**Una obra social tiene tres clases de socios:
 * ** Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
 *  en todos los tipos de tratamientos.
 * ** Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
 *  para los mismos tratamientos que los socios del tipo A.
 * ** Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
 *  dichos tratamientos.
 * 
 * Solicite una letra (carácter) que representa la clase de un socio, y luego 
 * un valor real que represente el costo del tratamiento (previo al descuento) 
 * y determine el importe en efectivo a pagar por dicho socio.
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        // inicialización de Scanner        
        Scanner leer = new Scanner(System.in);
        String socio;
        boolean continuar;
        do{
        System.out.print("Ingrese la categoria de socio (A - B - C): ");
        socio=leer.next();
        socio= socio.toUpperCase();
        continuar=   socio.equalsIgnoreCase("A") 
                  || socio.equalsIgnoreCase("B")
                  || socio.equalsIgnoreCase("C");
        if (!continuar) System.out.println("ingrese A, B o C.");
        } while (!continuar);
        System.out.println("");
        System.out.println("Socio categoria "+ socio);
        System.out.print("Ingrese el importe del tratamiento: ");
        float monto = leer.nextFloat();
        switch (socio) {
            case "A":
                monto -= (monto*0.5); 
                break;
            case "B":
                monto -=monto*0.35;
                break;
        }
        System.out.println("");
        System.out.println("El importe a pagar es: $ "+ monto);
    }
    
}
