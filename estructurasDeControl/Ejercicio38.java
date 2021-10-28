package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        /* 38. Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número:");
        int n = sc.nextInt();
        int suma = 0;
        int contador = 1;

        while (n != 0) {
            System.out.println("Introduce número:");
            n = sc.nextInt();
            contador = contador + 1;
            suma = suma + n;
        }
        System.out.println("Suma: " + suma);
        double media = suma / contador;

        System.out.println("Media: " + media);
    }
}
