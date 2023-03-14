package ejercicio_12;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 *
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        String sCen, sDec, sUni;
        for (int i = 0; i <= 999; i++) {
            sCen = Integer.toString(i / 100);
            sDec = Integer.toString((i / 10) % 10);
            sUni = Integer.toString(i % 10);
            if (sCen.equals("3")) {
                sCen = "E";
            }
            if (sDec.equals("3")) {
                sDec = "E";
            }
            if (sUni.equals("3")) {
                sUni = "E";
            }
            System.out.println(sCen + "-" + sDec + "-" + sUni);
        }
    }

}
