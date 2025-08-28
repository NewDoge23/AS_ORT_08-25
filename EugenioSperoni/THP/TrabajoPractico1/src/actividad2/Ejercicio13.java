package actividad2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = input.nextInt();

        mayor = num1;

        if(num2 > mayor) {
            mayor = num2;
        }

        if(num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        input.close();
    }
}