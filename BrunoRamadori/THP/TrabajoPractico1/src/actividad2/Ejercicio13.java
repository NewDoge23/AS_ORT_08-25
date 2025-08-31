package actividad2;

import java.util.Scanner;

/*
 * Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
	su valor.
 */

public class Ejercicio13 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, num3;

        System.out.println("Por favor, ingrese un número");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese un segundo número");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese un tercer número");
        num3 = Integer.parseInt(input.nextLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else {
            System.out.println(num3 + " es el mayor");
        }

        input.close();

    }

}
