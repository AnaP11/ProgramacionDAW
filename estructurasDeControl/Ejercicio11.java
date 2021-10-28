package estructurasDeControl;


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de días que tiene tu año y te digo si es bisiesto");
        int año = sc.nextInt();

        if ((año % 4 == 0) && año % 100 != 0 || año % 400 == 0 ){
            System.out.println("Tu año es bisiesto.");
        } else
            System.out.println("No es bisiesto");
    }
}
