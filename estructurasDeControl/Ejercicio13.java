package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precio inicial");
        int precioInicial = teclado.nextInt();
        System.out.println("Tipo de uva ( A o B)");
        String tipoDeUva = teclado.next();
        System.out.println("Tamaño de uva (1 o 2)");
        int tamañoUva = teclado.nextInt();
        System.out.println("kilos de uva");
        int kilos = teclado.nextInt();

        int precioFinal = 0;
        if (tipoDeUva.equals("A")){
            if (tamañoUva == 1) {
                precioFinal = precioFinal + 20;
            }else {
                precioFinal = precioFinal + 30;
            }
        } else {
            if (tamañoUva == 1) {
                precioFinal = precioInicial - 30;
            } else {
                precioFinal = precioInicial -50;
            }
        }
        System.out.println(precioFinal * kilos);
    }
}
