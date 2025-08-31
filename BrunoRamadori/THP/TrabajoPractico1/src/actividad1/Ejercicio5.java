package actividad1;

/*
 Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
	num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
	lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.
 */

import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int num1, num2, numAux = 0;

        System.out.println("Por favor, ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Los numeros elegidos son: " + num1 + " y " + num2);
        numAux = num1;
        num1 = num2;
        num2 = numAux;

        System.out.println("Donde estaba el primer número, esta el " + num1 + " y donde estaba el segundo número, esta " + num2);

        input.close();
    }

}
