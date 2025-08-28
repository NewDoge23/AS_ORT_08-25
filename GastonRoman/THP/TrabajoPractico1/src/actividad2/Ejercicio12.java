package actividad2;

import java.util.Scanner;

public class Ejercicio12 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Ingrese un número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro número: ");
        num2 = Integer.parseInt(input.nextLine());

        if (num1 > num2) {
            System.out.println("El primer número es el mayor");
        }   else {
            System.out.println("El segundo número es el mayor");
        }
        input.close();
    }
}
