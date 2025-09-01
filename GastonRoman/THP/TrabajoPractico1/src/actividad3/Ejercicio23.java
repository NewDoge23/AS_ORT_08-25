package actividad3;

/*
    Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros
    10 múltiplos de n (desde 1 x n).
 */

import java.util.Scanner;

public class Ejercicio23 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num, producto;

        System.out.println("Ingrese un número entero: ");
        num = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i++) {
            producto = num * i;
            System.out.println(num + " * " + i + " = " + producto);
        }
        input.close();
    }
}
