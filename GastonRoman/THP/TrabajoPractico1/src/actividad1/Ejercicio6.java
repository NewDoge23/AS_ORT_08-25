package actividad1;

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
