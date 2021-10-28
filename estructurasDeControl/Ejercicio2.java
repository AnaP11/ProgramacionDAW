package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu sueldo anual: ");
        double sueldo = sc.nextDouble();
        if (sueldo > 9000) {
            System.out.println("Debes abonar impuestos.");
        } else {
            System.out.println("No debes abonar nada.");
        }
    }
}
