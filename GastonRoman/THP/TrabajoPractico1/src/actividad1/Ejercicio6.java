package actividad1;

/*
    Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
    vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
    por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
    cobrar por el vendedor.
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int FIJO = 44000;
        final double porcentajeBono = 0.16;
        int ventasMes;
        double bonoEmpleado, sueldoEmpleado;

        System.out.println("Ingrese el monto de las ventas mensuales: ");
        ventasMes = Integer.parseInt(input.nextLine());

        bonoEmpleado = (double)ventasMes * porcentajeBono;
        sueldoEmpleado = FIJO + bonoEmpleado;

        System.out.println("El importe a cobrar por el vendedor será de: $" + sueldoEmpleado);

        input.close();
    }
}
