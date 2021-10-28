package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("De entre los siguientes toppings, escribe el nombre del que quieres y te digo cuánto te costaría tu helado:\na. Oreo\nb. KitKat\nc. Brownie\nd. Lacasitos\ne. Ninguno");
        String topping = sc.next();

        double heladoBase = 1.90;
        double precio;
        switch (topping){
            case "Oreo":
                precio = heladoBase + 1;
                System.out.println("Con este topping, el helado te costará " + precio);
                break;

            case "KitKat":
                precio = heladoBase + 1.50;
                System.out.println("Con este topping, el helado te costará " + precio);
                break;

            case "Brownie":
                precio = heladoBase + 0.75;
                System.out.println("Con este topping, el helado te costará " + precio);
                break;

            case "Lacasitos":
                precio = heladoBase + 0.95;
                System.out.println("Con este topping, el helado te costará " + precio);
                break;
            case "Ninguno":
                precio = heladoBase;
                System.out.println("Sin topping, el helado te costará" + precio);
                break;
            default:
                precio = heladoBase;
                System.out.println("No tenemos ese topping, lo sentimos. El helado sin topping cuesta 1,90€");


        }

    }
}
