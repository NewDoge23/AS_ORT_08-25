package actividad2;

import java.util.Scanner;

/*
 * 11.Realizá un programa que permita ingresar un número entero e indique si se trata de unnúmero par o impar.
 */

public class Ejercicio11 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Por favor ingrese un numero entero");
        int num = Integer.parseInt(input.nextLine());

        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }

        input.close();

    }

}
