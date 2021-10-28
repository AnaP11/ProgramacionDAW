package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime número: ");
        int numero = sc.nextInt();
        int resto = numero % 2;

        if (resto == 0)
            System.out.println("Tu número es par, ya que el resto es " + resto);
        else
            System.out.println("Tu número es impar, y tu resto es " + resto);
    }
}
