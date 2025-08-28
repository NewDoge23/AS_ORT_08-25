package actividad2;

import java.util.Scanner;

public class Ejercicio13v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int mayor = Integer.MIN_VALUE;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        if(num1 > mayor) {
            mayor = num1;
        }

        System.out.print("Ingrese el segundo número: ");
        num1 = input.nextInt();

        if(num1 > mayor) {
            mayor = num1;
        }

        System.out.print("Ingrese el tercer número: ");
        num1 = input.nextInt();

        if(num1 > mayor) {
            mayor = num1;
        }

        System.out.println("El número mayor es: " + mayor);

        input.close();
    }
}
