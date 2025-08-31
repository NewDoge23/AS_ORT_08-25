package actividad1;

/*
 * Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
	diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
	aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
	de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
	previamente.
 */

import java.util.Scanner;

public class Ejercicio10 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String nom1, nom2, nom3;
        double ap1, ap2, ap3, apTotal, por1, por2, por3;

        System.out.println("Por favor, ingrese su nombre: ");
        nom1 = input.nextLine();

        System.out.println("Indique su capital aportado");
        ap1 = Double.parseDouble(input.nextLine());

        System.out.println("Por favor, ingrese su nombre: ");
        nom2 = input.nextLine();

        System.out.println("Indique su capital aportado");
        ap2 = Double.parseDouble(input.nextLine());

        System.out.println("Por favor, ingrese su nombre: ");
        nom3 = input.nextLine();

        System.out.println("Indique su capital aportado");
        ap3 = Double.parseDouble(input.nextLine());

        apTotal = ap1 + ap2 + ap3;

        por1 = ap1 / apTotal * 100;
        por2 = ap2 / apTotal * 100;
        por3 = ap3 / apTotal * 100;

        System.out.println("El valor total aportado es de: $" + apTotal);
        System.out.println("El capital aportado por " + nom1 + " es de " + por1 + "%");
        System.out.println("El capital aportado por " + nom2 + " es de " + por2 + "%");
        System.out.println("El capital aportado por " + nom3 + " es de " + por3 + "%");

        input.close();
    }

}
