package actividad1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sueldoBase = 44000;

        System.out.print("Ingrese el monto total de ventas del mes: ");
        double ventas = input.nextDouble();

        double comision = ventas * 0.16;

        double sueldoTotal = sueldoBase + comision;

        System.out.println("El sueldo total a cobrar es: $" + sueldoTotal);

        input.close();
    }
}

