package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Tu primer número " + num1 + " es mayor que tu segundo número " + num2 );
        } else {
            System.out.println("Lo siento, tu primer número" + num1 + " es menor que tu segundo número" + num2 + " :(");
        }
    }
}
