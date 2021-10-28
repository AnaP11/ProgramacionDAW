package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Eres culpable? (Sí/No)");
        String culpable = teclado.next();

        if (culpable.equals("sí")){
            System.out.println("Eres culpable: A LA CÁRCEL!");
        } else if (culpable.equals("no")) {
            System.out.println("Entonces vete a casa");
        } else{
            System.out.println("Respóndeme con un sí o un no, por favor.");
        }
    }
}
