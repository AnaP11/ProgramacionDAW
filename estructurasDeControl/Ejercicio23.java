package estructurasDeControl;

public class Ejercicio23 {
    public static void main(String[] args) {
        /* Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
usando el bucle for.*/
        // IMPORTANTE : utilizaremos un SUMADOR

        int suma = 0;
        for (int i = 1; i < 11; i++) {

            suma = suma + i;
            System.out.println("Resultado: " + suma);
        }

    }
}
