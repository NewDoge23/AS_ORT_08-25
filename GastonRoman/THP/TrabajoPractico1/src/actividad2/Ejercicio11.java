package actividad2;

/*
    Realizá un programa que permita ingresar un número entero e indique si se trata de un
    número par o impar.
 */

import java.util.Scanner;

public class Ejercicio11 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num;

        System.out.println("Ingrese un número: ");
        num = Integer.parseInt(input.nextLine());

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
        input.close();
    }
}
