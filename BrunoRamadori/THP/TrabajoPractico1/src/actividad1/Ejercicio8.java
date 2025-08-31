package actividad1;

/*
 * Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
	resultados para las 4 operaciones matemáticas básicas con los números ingresados.
 */

import java.util.Scanner;

public class Ejercicio8 {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int num1, num2, suma, resta, div, mult;

        System.out.println("Por favor, ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        suma = num1 + num2;
        resta = num1 - num2;
        div = num1 / num2;
        mult = num1 * num2;

        System.out.println("Los número ingresados y realizadas las 4 operaciones basicas dan:");
        System.out.println("Suma: " + suma + "  Resta: " + resta + "  Division: " + div + "  Multiplicacion: " + mult);

        input.close();

    }

}
