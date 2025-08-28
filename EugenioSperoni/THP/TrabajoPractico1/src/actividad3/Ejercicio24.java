package actividad3;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número (menor o igual): ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número (mayor o igual): ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número debe ser menor o igual al segundo.");
        } else {
            System.out.print("Secuencia incluyéndolos: ");
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }

            if (num2 - num1 <= 1) {
                System.out.println("Secuencia excluyéndolos: (vacía, no hay números en el medio)");
            } else {
                System.out.print("Secuencia excluyéndolos: ");
                for (int i = num1 + 1; i < num2; i++) {
                    System.out.print(i + " ");
                }
            }
        }
        input.close();
    }
}
