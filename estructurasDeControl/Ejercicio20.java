package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números positivos:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Ahora introduce un símbolo para realizar su correspondiente operación aritmética ( + , - , * , /):");

        char simbolo = sc.next().charAt(0);


        switch (simbolo) {
            case '+':
                int suma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            case '-':
                int resta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            case '*':
                int mult = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + mult);
                break;
            case '/':
                int division = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + division);
                break;

            default:
                System.out.println("¡Error!");
        }
    }
}
