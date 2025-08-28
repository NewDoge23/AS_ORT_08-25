package actividad1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, aux1;

        System.out.println("Ingrese el 1er número: ");
        a = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el 2do número: ");
        b = Integer.parseInt(input.nextLine());

        System.out.println("El 1er número ingresado es: " + a + " y el 2do es: " + b);

        aux1 = a;
        a = b;
        b = aux1;

        System.out.println("El 1er número ahora es: " + a + " y el 2do es: " + b);

        input.close();
    }

}
