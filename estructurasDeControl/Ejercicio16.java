package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una casa (Pon su número correspondiente):\n1. Gryffindor\n2. Hufflepuff\n3. Slytherin\n4. Ravenclaw");
        int casa = sc.nextInt();
        if (casa == 1){
            System.out.println("Eres de Gryffindor: posees valentía");
        } else if (casa == 2) {
            System.out.println("Eres de Hufflepuff: posees lealtad");
        } else if (casa == 3) {
            System.out.println("Eres de Slytherin: posees astucia");
        } else if (casa == 4) {
            System.out.println("Eres de Ravenclaw: posees intelecto");
        } else {
            System.out.println("Eso no es una casa válida, vuelve a intentarlo...");
        }
    }
}
