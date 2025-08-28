package actividad1;

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
