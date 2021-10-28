package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";


        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.next();

        if (usuario.equals(usuarioCorrecto)) {
            System.out.println("Contraseña: ");
            String pass = teclado.next();
            if (pass.equals(contraseñaCorrecta)) {
                System.out.println("Has entrado al sistema.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("Usuario incorrecto");
        }
    }
}
