package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué estamos estudiando? Responde con el número correspondiente a tu opción:\n1. Java\n2. Kotlin\n3. Scala\n4. Python");
        int opcion = sc.nextInt();

        if (opcion == 1){
            System.out.println("¡Sí!");
        }else if (opcion == 2){
            System.out.println("¡No!");
        }else if (opcion == 3){
            System.out.println("¡No!");
        }else if (opcion == 4){
            System.out.println("¡No!");
        }else {
            System.out.println("Opción desconocida, inténtelo de nuevo.");
        }
    }
}
