package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Hacer un programa que pida diez números por teclado y calcule su media.

        Scanner sc = new Scanner(System.in);

        double num;
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce número: ");
            num = sc.nextDouble();

            suma = suma + num;

        }
        double media = suma / 10;
        System.out.println("Media: " + media);
    }
}
