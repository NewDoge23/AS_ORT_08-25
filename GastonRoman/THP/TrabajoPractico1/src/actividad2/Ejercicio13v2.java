package actividad2;

/*
    Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
    su valor.
 */

import java.util.Scanner;

public class Ejercicio13v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int mayor = Integer.MIN_VALUE;

        System.out.println("Ingrese el 1er número: ");
        num = Integer.parseInt(input.nextLine());

        if (num > mayor) {
            mayor = num;
        }

        System.out.println("Ingrese el 2do número: ");
        num = Integer.parseInt(input.nextLine());

        if (num > mayor) {
            mayor = num;
        }

        System.out.println("Ingrese el 3er número: ");
        num = Integer.parseInt(input.nextLine());

        if (num > mayor) {
            mayor = num;
        }

        System.out.println("El número mayor es: " + mayor);

        input.close();
    }
}
