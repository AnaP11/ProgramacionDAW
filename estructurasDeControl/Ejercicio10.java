package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        if (a > b && b > c){
            System.out.println(a + " " + b +" " + c);
        } else if(a > c && c > b){
            System.out.println(a + " " + c + " " + b);
        } else if (b > a && a > c){
        System.out.println(b + " " + a + " " + c);
        }
        else if (b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " " + a + " " + b);
        } else  {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
