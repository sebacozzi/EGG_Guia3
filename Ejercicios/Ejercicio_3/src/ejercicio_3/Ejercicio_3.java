package ejercicio_3;
    import java.util.Scanner;
public class Ejercicio_3 {

/*
 Realizar un programa que solo permita introducir solo frases o palabras 
 de 8 de largo.Si el usuario ingresa una frase o palabra de 8 de largo 
 se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en 
 caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la 
 función Lenght() en Java.
*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba una frase o palabra:");
        String frase = leer.nextLine();
        
        if (frase.length()==8) {
            System.out.println("El largo es el correcto"); 
        } else if (frase.length()<8){
            System.out.println("Es menor de 8 caracteres");
        } else{
            System.out.println("Es mayor de 8 caracteres");
        }
    }
    
}
