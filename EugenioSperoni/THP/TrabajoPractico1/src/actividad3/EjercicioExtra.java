package actividad3;

import java.util.Scanner;

public class EjercicioExtra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();

        long factorial = 1;

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        input.close();
    }
}
