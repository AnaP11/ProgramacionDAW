package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de alumnos de tu viaje:");
        int alumnos = sc.nextInt();
        int costo;

        if (alumnos >= 100){
            costo = alumnos * 65 ;
            System.out.println("Cada alumno deberá pagar 65€, y el costo por el autobús será de " + costo + "€");
        } else if (alumnos >= 50 && alumnos <=99) {
            costo = alumnos * 70;
            System.out.println("Cada alumno deberá pagar 70€, y el costo por el autobús será de " + costo + "€");
        } else if (alumnos >= 30 && alumnos <=49) {
            costo = alumnos * 95;
            System.out.println("Cada alumno deberá pagar 95€, y el costo por el autobús será de " + costo + "€");
        } else {
            costo = 4000;
            System.out.println("Al ser 30 ó menos alumnos, el costo del alquiler del autobús es de " + costo + "€");
        }
            double precioPorAlumno;
            precioPorAlumno = (double) costo / (double) alumnos;

    }
}
