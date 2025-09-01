package actividad1;

/*
    Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
    ingresado:
        a. Multiplicado por 5.
        b. Dividido por 2.
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, mult;
        double divi;

        System.out.println("Ingrese un número:");
        num1 = Integer.parseInt(input.nextLine());

        mult = num1 * 5;
        divi = num1 / 2.0;

        System.out.println("Multiplicado por 5 = " + mult);
        System.out.println("Dividido entre 2 = " + divi);

        input.close();
    }

}
