package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Hacia dónde te quieres mover? (Escribe el número correspondiente a la acción deseada):\n1 - Arriba\n2 - Abajo\n3 - Izquierda\n4 - Derecha\n0 - No mover");

        int accion = sc.nextInt();
        switch (accion) {
            case 1:
                System.out.println("Subir");
            break;
            case 2:
                System.out.println("Bajar");
            break;
            case 3:
                System.out.println("Mover a la izquierda");
                break;
            case 4:
                System.out.println("Mover a la derecha");
                break;
            case 0:
                System.out.println("No mover");
                break;

            default:
                System.out.println("¡Error!");
        }
    }
}
