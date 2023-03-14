/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

/**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
 * diferente a cada una. A continuación, realizar las instrucciones necesarias 
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
 * D tome el valor de B. Mostrar los valores iniciales y los valores finales de 
 * cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        
        // No hay mucho que explicar
        int A,B,C,D,aux;
        A=(int) (Math.random()*10);
        B=(int) (Math.random()*10);
        C=(int) (Math.random()*10);
        D=(int) (Math.random()*10);
        System.out.println("Valor de A: "+ A);
        System.out.println("Valor de B: "+ B);
        System.out.println("Valor de C: "+ C);
        System.out.println("Valor de D: "+ D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Nuevo valor de A: "+ A);
        System.out.println("Nuevo valor de B: "+ B);
        System.out.println("Nuevo valor de C: "+ C);
        System.out.println("Nuevo valor de D: "+ D);
    }
    
}
