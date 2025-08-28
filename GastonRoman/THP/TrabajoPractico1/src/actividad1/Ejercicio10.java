package actividad1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String per1, per2, per3;
        int apor1, apor2, apor3, totalAportado;
        double por1, por2, por3;

        System.out.println("Ingrese el nombre del 1er socio: ");
        per1 = input.nextLine();
        System.out.println("Ingrese el monto aportado por " + per1 + ": ");
        apor1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el nombre del 2do socio: ");
        per2 = input.nextLine();
        System.out.println("Ingrese el monto aportado por " + per2 + ": ");
        apor2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el nombre del 3er socio: ");
        per3 = input.nextLine();
        System.out.println("Ingrese el monto aportado por " + per3 + ": ");
        apor3 = Integer.parseInt(input.nextLine());

        totalAportado = apor1 + apor2 + apor3;
        System.out.println("El total aportado es de: $" + totalAportado);

        por1 = (double) apor1 / totalAportado * 100;
        por2 = (double) apor2 / totalAportado * 100;
        por3 = (double) apor3 / totalAportado * 100;

        System.out.println("El porcentaje aportado por " + per1 + " es del " + por1 + "%");
        System.out.println("El porcentaje aportado por " + per2 + " es del " + por2 + "%");
        System.out.println("El porcentaje aportado por " + per3 + " es del " + por3 + "%");

        input.close();
    }
}
