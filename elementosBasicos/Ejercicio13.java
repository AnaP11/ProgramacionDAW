package elementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = teclado.next();
        System.out.println("¿Cuál es tu edad?");
        int edad = teclado.nextInt();
        System.out.println("¿Cuántos años de experiencia tienes?");
        int exp = teclado.nextInt();
        System.out.println("¿Cuál es tu preferencia a la hora de cocinar?");
        String pref = teclado.next();

        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " + exp + " de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida " + pref + ".");
    }
}
