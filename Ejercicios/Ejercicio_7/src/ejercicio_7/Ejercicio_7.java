
package ejercicio_7;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 *Las secuencias leídas que respeten el formato se consideran correctas, la 
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 * y toda secuencia distinta de FDE, que no respete el formato se considera 
 * incorrecta.
 *Al finalizar el proceso, se imprime un informe indicando la cantidad de 
 * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
 * investigar cómo se utilizan las siguientes funciones de Java 
 * Substring(), Length(), equals(). 
 */
public class Ejercicio_7 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cCorrectas = 0, cIncorrectas = 0;
        String FDE = "&&&&&";
        String mensaje = "";
        boolean esCorrecta;

        do {
            if (!mensaje.equals("")) {
                if (    mensaje.length() == 5
                        && mensaje.substring(4, 5).equalsIgnoreCase("O")
                        && mensaje.substring(0, 1).equalsIgnoreCase("x")) {
                    cCorrectas++;
                } else {
                    cIncorrectas++;
                }
            }
            System.out.print("Ingrese una cadena: ");
            mensaje = leer.next();
        } while (!mensaje.equals(FDE));

        System.out.println("Mensajes correctos: " + cCorrectas);
        System.out.println("Mensajes incorrectos: " + cIncorrectas);

    }

}
