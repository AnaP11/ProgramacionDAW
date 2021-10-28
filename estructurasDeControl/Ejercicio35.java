package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*35. Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,
para n = 5:
                *****
                ****
                ***
                **
                *

    */

        // BUCLES DEPENDIENTES:

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce número:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i;j++) {
                System.out.print("* ");

            }
            System.out.println();
        }




    }
}
