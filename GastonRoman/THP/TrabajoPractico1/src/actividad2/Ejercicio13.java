package actividad2;

/*
    Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
    su valor.
 */

import java.util.Scanner;

public class Ejercicio13 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, num3;

        System.out.println("Ingrese el 1er número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el 2do número: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el 3er número: ");
        num3 = Integer.parseInt(input.nextLine());

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El primer número es el mayor");
            }
        }   else if (num2 > num3) {
            System.out.println("El segundo número es el mayor");
        }else {
            System.out.println("El tercer número es el mayor");
        }
        input.close();
    }
}
