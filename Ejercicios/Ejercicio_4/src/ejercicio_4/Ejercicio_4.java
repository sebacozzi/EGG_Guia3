package ejercicio_4;
    import java.util.Scanner;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        System.out.print("Escriba una frase o palabra: ");
        String frase = leer.nextLine();
        String letra = frase.substring(0, 1);
        System.out.println(letra);
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("La letra es A");
            
        } else {
            System.out.println("Incorrecto");
        }
    }
    }
    