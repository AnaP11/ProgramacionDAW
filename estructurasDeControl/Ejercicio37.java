package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        /* 37. Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final). */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (0 para terminar):");
        int n = sc.nextInt();
        int contador = 1;

        while (n != 0) {
            System.out.println("Introduce un número (0 para terminar):");
            n = sc.nextInt();
            contador = contador + 1;
        }
        System.out.println("Has terminado. Has introducido " + contador + " números.");
    }
}
