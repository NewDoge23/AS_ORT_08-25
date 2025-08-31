package actividad2;

import java.util.Scanner;

/*
 * Realizá un programa que permita al usuario ingresar dos números enteros. La computadora
	debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un
	número entero b cuando el resto de la división entre a y b es 0.
 */

public class Ejercicio18 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Por favor, ingrese un número entero");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese otro número entero");
        num2 = Integer.parseInt(input.nextLine());

        if (num1 > num2 && num1 != num2) {
            if (num1 % num2 == 0) {
                System.out.println("El número mayor (" + num1 + ") es divisible por el menor (" + num2 + ")");
            } else {
                System.out.println("El número mayor (" + num1 + ") no es divisible por el menor (" + num2 + ")");
            }
        } else {
            if (num2 % num1 == 0) {
                System.out.println("El número mayor (" + num2 + ") es divisible por el menor (" + num1 + ")");
            } else {
                System.out.println("caca");
                System.out.println("El número mayor (" + num2 + ") no es divisible por el menor (" + num1 + ")");
            }
        }

        input.close();
    }

}
