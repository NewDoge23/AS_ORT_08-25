package actividad3;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        float n = input.nextInt();

        System.out.println("Los primeros 10 múltiplos de " + n + " son:");
        for (float i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
        input.close();
    }
}
