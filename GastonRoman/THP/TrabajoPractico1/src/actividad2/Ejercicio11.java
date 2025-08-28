package actividad2;

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
