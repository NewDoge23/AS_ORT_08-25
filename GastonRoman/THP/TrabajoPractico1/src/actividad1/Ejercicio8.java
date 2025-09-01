package actividad1;

/*
    Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
    resultados para las 4 operaciones matemáticas básicas con los números ingresados.
 */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, suma, resta, multi, divi;

        System.out.println("Ingrese el 1er número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el 2do número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Los números ingresados son: " + num1 + num2);

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;

        System.out.println("Las 4 operaciones báscias son: ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + divi);

        input.close();
    }

}
