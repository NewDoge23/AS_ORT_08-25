package actividad1;

/*
    Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
    num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambia sus valores (que
    lo cargado en num1 quede en num2, y viceversa) y vuelve a mostrarlas actualizadas.
 */

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
