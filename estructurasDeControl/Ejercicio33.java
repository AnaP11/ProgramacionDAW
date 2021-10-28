package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método Math.pow().*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculamos el resultado de una potencia.\nDime el número de la BASE (puede contener decimales si quieres) :");
        double base = sc.nextDouble();
        System.out.println("Ahora dime el número del exponente");
        int exponente = sc.nextInt();

        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
        }

        System.out.println("La potencia de " + base + "^" + exponente + ", da como resultado " + potencia);


    }
}
