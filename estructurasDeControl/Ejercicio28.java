package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*28. Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
rectángulo en que la base sea el número mayor y la altura el número menor, con un
carácter también introducido por teclado.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número:");
        int a = sc.nextInt();
        System.out.println("Segundo número:");
        int b = sc.nextInt();
        System.out.println("Caracter que quieres usar:");
        char caracter = sc.next().charAt(0);

        int mayor;
        int menor;

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }


        for (int i = 0; i < menor; i++) {
            for (int j = 0; j < mayor; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println(caracter + " ");
        }
    }
}
