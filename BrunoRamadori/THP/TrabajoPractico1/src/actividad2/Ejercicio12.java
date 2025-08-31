package actividad2;

import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el
	mayor.
 */
public class Ejercicio12 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Por favor ingrese un numero entero");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor ingrese otro numero entero");
        num2 = Integer.parseInt(input.nextLine());


        if (num1 > num2 && num1 != num2) {
            System.out.println(num1 + " es el mayor");
        } else {
            System.out.println(num2 + " es el mayor");
        }

        input.close();

    }

}
