package estructurasDeControl;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {

        /*
        22. Hacer un programa que escriba los valores comprendidos entre 531 y 540 (inclusive).
         */
        for (int i = 531; i <= 540; i++) {
            System.out.println(i);
        }


        /*
        23. Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
usando el bucle for.
         */
        // vamos a utilizar un sumador
        int suma = 0;
        for (int i = 1; i <= 10; i++) { // 6
            suma = suma + i; // 15 + 6
            System.out.println("i: " + (i) + "\tsuma: " + suma);
        }
        System.out.println("Resultado: " + suma);




        /*
        24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número:");
        int a = sc.nextInt();
        System.out.println("Segundo número, mayor que el anterior:");
        int b = sc.nextInt();

        int sumaa = 0;
        for (int i = a; i <= b ; i++) { // a = 5 b = 10 i = 7 suma = 18
            sumaa = sumaa + i; // 11 + 7
        }
        System.out.println("Resultado:" + sumaa);








    }
}
