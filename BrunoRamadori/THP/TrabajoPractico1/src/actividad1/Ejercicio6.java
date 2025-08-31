package actividad1;

import java.util.Scanner;

/*
 * 6. Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
	vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
	por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
	cobrar por el vendedor.
 */

public class Ejercicio6 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        final double SUELDO_FIJO = 44000;
        final double PORCENTAJE = 0.16;

        double totalVentas, sueldoTotal;

        System.out.println("Ingrese el monto total de las ventas realizadas:");
        totalVentas = Double.parseDouble(input.nextLine());

        sueldoTotal = SUELDO_FIJO + totalVentas * PORCENTAJE;

        System.out.println("El importe a cobrar por el vendedor es de: $" + sueldoTotal);

        input.close();
    }

}
