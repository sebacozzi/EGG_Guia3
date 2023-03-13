package ejercicio_6;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Ejercicio_6 {

  /*
  * Realizar un programa que pida dos números enteros positivos por teclado y 
  * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
  * y el programa deberá mostrar el resultado por pantalla y luego volver al 
  * menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener 
  * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
  * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
  * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
  * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
  */
    public static void main(String[] args) {
        // Inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        // Formulación de Variables de uso e ingreso de información
        int nums[] = new int[2];
        int indMensaje;
        int opmenu;
        boolean espera=false;
        String salir;
        String pedidoNum[] = {"Ingrese un número entero: ", "Ingrese otro número entero: "};
        indMensaje = 0;
        do {
            // Repetición DO para obtener los 2 números enteros positivos para
            // realizar los calculos del menu
            System.out.print(pedidoNum[indMensaje]);
            nums[indMensaje] = leer.nextInt();
            if (nums[indMensaje] > 0) {
                indMensaje++;
            } else {
                System.out.println("Debe ingresar un numero mayor que 0");
            }

        } while (indMensaje < 2);
        
        // Obtenido los 2 números se inicia el menu de opcciones
        do {
            // Definición de menu
            salir="N";
            // Limpieza de pantalla
            limpiarAnt(espera);
            // Opciones del menu
            System.out.println(" Números ingresados: " + nums[0] + " y " + nums[1] + ".");
            System.out.println("       MENU");
            System.out.println("       1. Sumar");
            System.out.println("       2. Restar");
            System.out.println("       3. Multiplicar");
            System.out.println("       4. Dividir");
            System.out.println("       5. Salir");
            System.out.print("       Elija Opción: ");
            opmenu = leer.nextInt();
            System.out.println("");
            espera = true;
            switch (opmenu) {
                case 1 :
                    System.out.println("La suma de los números da: " + (nums[0] + nums[1]));
                    break;
                case 2 :
                    System.out.println("La resta de los números da: " + (nums[0] - nums[1]));
                    break;
                case 3 :
                    System.out.println("La multiplicación de los números da: " + (nums[0] * nums[1]));
                    break;
                case 4 :
                    System.out.println("La división de los números da: " + ((float) nums[0] / nums[1]));
                    break;
                case 5 :
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = leer.next();
                    espera= false;
                    break;
                default: 
                    System.out.println("Opción incorrecta");
                }
        } while (!salir.equalsIgnoreCase("S"));

    }
    
    // Procedimiento limpiar pantalla como parametro se pasa si queres que espere 
    // antes de limpiar la consola
    private static void limpiarAnt(){
        try{
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            
        }  catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
    private static void limpiarAnt(boolean esperar){
            if (esperar){
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();
            }
            limpiarAnt();
    }
}
