package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        /*Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y te calculo su factorial:");
        int num = sc.nextInt();

        int producto = 1;

        for (int i = 1; i <= num ; i++) {
            producto = producto * i;

        }
        System.out.println(num + "! es igual a " + producto);

    }
}
