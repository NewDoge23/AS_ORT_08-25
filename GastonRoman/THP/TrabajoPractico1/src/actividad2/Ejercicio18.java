package actividad2;

import java.util.Scanner;

public class Ejercicio18 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, mayor, menor;

        System.out.println("Ingrese el 1er número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el 2do número: ");
        num2 = Integer.parseInt(input.nextLine());

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        System.out.println("El número mayor es: " + mayor);

        if ((mayor % menor) == 0) {
            System.out.println(mayor + " es divisible por " + menor);
        } else {
            System.out.println(mayor + " NO es divisible por " + menor);
        }
        input.close();
    }
}
