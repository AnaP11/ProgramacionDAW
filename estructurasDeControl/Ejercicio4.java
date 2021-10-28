package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Dime tu nivel de estudios: ");
        int nivelDeEstudios = sc.nextInt();
        System.out.println("Dime tu nivel de ingresos: ");
        int ingresos = sc.nextInt();

        boolean jasp;
        if (edad <= 28 && nivelDeEstudios >3 || edad < 30 && ingresos > 28_000) {
            jasp = true;
        } else {
            jasp = false;
        }
        System.out.println(jasp);
    }
}
