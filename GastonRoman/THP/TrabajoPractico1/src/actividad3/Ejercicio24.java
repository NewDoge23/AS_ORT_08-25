package actividad3;

/*
    Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
    donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
    mostrar la secuencia de números existentes entre ambos:
        a. Incluyéndolos;
        b. Excluyéndolos.
 */

import java.util.Scanner;

public class Ejercicio24 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, i;

        System.out.println("Ingrese el 1er numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el 1er numero: ");
        num2 = Integer.parseInt(input.nextLine());

        while (num1<=num2) {
            System.out.println("ERROR - El 1er número debe ser mayor.");
            System.out.println("Ingrese el 1er numero: ");
            num1 = Integer.parseInt(input.nextLine());
        }

        //a
        System.out.println("=========== A ==========");
        for (i = num1; i >= num2; i--) {
            System.out.println(i);
        }

        //b
        System.out.println("=========== B ==========");
        for (i = num1-1; i >= num2+1; i--) {
            System.out.println(i);
        }
        input.close();
    }

}
