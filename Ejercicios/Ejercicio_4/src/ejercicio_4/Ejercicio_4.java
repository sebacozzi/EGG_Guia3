package ejercicio_4;
    import java.util.Scanner;
public class Ejercicio_4 {

    /**Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
     * contrario, se deberá imprimir “INCORRECTO”.
     * Nota: investigar la función Substring y equals() de Java.
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
        if (letra.equals("A")) {
            System.out.println("La letra es A");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
    