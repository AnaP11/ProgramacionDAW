package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te digo el día de la semana correspondiente:\n(1 para el día lunes, 2 para el martes, 3 para el miércoles...)");
        int numSemana = sc.nextInt();

        switch (numSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("¡Error!");
        }
    }
}
