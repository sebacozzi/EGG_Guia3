package ejercicio_4;
    import java.util.Scanner;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializaci+on de Scanner
            Scanner leer = new Scanner(System.in);
            // Obteniendo palabra o frase a chequear
        System.out.print("Escriba una frase o palabra: ");
        String frase = leer.nextLine();
        // pasando la primera letra a un string
        String letra = frase.substring(0, 1);
        // Muestra la primera letra
        System.out.println(letra);
        // Verifica si la primera letra es "A"
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("La letra es A");
            
        } else {
            System.out.println("Incorrecto");
        }
    }
    }
    