package actividad3;

/*
    Realizá un programa que permita al usuario ingresar un número natural n. La computadora
    debe mostrar los primeros n múltiplos de 3 excepto aquellos que sean a la vez múltiplos de 5.
 */

import java.util.Scanner;

public class Ejercicio26 {

    static Scanner input = new Scanner(System.in);

    static final int MULTI_TRES = 3;
    static final int MULTI_CINCO = 5;
    static final int RESTO = 0;

    public static void main(String[] args) {

        int num, prod1;

        System.out.println("Ingrese un número entero: ");
        num = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= num; i++) {

            prod1 = i * MULTI_TRES;

            if ((prod1 % MULTI_CINCO) != RESTO) {
                System.out.println(MULTI_TRES + " * " + i + " = " + prod1);
            } else {
                System.out.println("---MÚLTIPLO DE 5--- ( " + prod1 + " )");
            }
        }
        input.close();
    }
}
