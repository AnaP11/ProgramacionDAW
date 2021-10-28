package estructurasDeControl;

import java.util.Scanner;

public class PruebasWhile {
    public static void main(String[] args) {
        /*
        22. Hacer un programa que escriba los valores comprendidos entre 531 y 540 (inclusive).
         */


        /*
        for (int i = 531; i <= 540; i++) {

            System.out.println(i);
        }
        */

        /*
        int i = 531;

        while (i <= 540){
            System.out.println(i);
            i++;
        }

         */
        //---------------------------------------------------------------------

        /*
        23. Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
usando el bucle for.
         */
         /*
        int suma = 0;
        for (int i = 1; i <= 10; i++) { // 6
            suma = suma + i; // 15 + 6
            System.out.println("i: " + (i) + "\tsuma: " + suma);
        }
        System.out.println("Resultado: " + suma);
        */

        /*
        int i = 0;
        int suma = 0;

        while (i <= 10) {
            suma = suma + i;
            System.out.println(suma);
            i++;
        }
        */


        /*
        24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
ambos inclusive.
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número:");
        int a = sc.nextInt();
        System.out.println("Segundo número, mayor que el anterior:");
        int b = sc.nextInt();

        int suma = 0;
        for (int i = a; i <= b ; i++) { // a = 5 b = 10 i = 7 suma = 18
            suma = suma + i; // 11 + 7
        }
        System.out.println("Resultado:" + suma);
        */

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mayor;
        int menor;
        int suma = 0;

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }

        while (mayor >= menor) {
            suma = suma + menor;
            menor++;
        }
        System.out.println(suma);
        */



    }
}
