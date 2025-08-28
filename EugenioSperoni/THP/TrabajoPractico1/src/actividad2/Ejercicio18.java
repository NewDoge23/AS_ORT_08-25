package actividad2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int mayor;
        int menor;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        if(num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        if(menor == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if(mayor % menor == 0) {
            System.out.println("El número " + mayor + " es divisible por " + menor);
        } else {
            System.out.println("El número " + mayor + " NO es divisible por " + menor);
        }

        input.close();
    }
}
