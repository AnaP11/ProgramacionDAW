package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        /*Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número:");
        int n = sc.nextInt();

        for (int i = 5; i <= n; i+=5)
                System.out.print(i + " ");
    }
}