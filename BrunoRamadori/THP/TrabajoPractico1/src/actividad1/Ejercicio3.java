package actividad1;

/*
 	Realizá un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
	a. Multiplicado por 5.
	b. Dividido por 2.
 */

import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int num, mult;
        double div;

        System.out.println("Por favor, ingrese un número entero: ");
        num = Integer.parseInt(input.nextLine());

        mult = num * 5;
        div = (double)num / 2;

        System.out.println("El número ingresado multiplicado por 5 es " + mult + " y dividido por 2 es " + div);

        input.close();
    }

}
