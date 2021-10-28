package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*27. Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número:");
        int n = sc.nextInt();
        System.out.println("introudce caracter:");
        char caracter = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println(caracter + " ");
        }


    }
}
