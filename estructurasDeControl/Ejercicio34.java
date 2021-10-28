package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        /*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
números a introducir). El programa debe informar de cuantos números introducidos
son mayores que 0, menores que 0 e iguales a 0.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números?: ");
        int n = sc.nextInt();
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorIgualCero = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Número:");
            int num = sc.nextInt();

            if (num > 0) {
                contadorPositivo++;
            } else if (num < 0){
                contadorNegativo++;
            } else {
                contadorIgualCero++;
            }

            System.out.println("Números positivos: " + contadorPositivo);
            System.out.println("Ceros: " + contadorIgualCero);
            System.out.println("Números negativos: " + contadorNegativo);
        }
    }
}
