package actividad1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int TOTAL_ANGULOS = 180;
        int ang1, ang2, angRestante, sumaAngulos;

        System.out.println("Ingrese el primer ángulo: ");
        ang1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo ángulo: ");
        ang2 = Integer.parseInt(input.nextLine());

        sumaAngulos = ang1 + ang2;
        angRestante = TOTAL_ANGULOS - sumaAngulos;

        System.out.println("El valor del tercer ángulo es: " + angRestante + "°");

        input.close();
    }
}
