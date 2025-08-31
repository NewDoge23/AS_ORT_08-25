package actividad1;

/*
 * Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
	valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
	metros de alambre para cercarlo completamente a tres alturas distintas.
 */

import java.util.Scanner;

public class Ejercicio7 {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        int ancho, largo, valorM2, valorTotal, metrosAlambre;

        System.out.println("Ingrese el ancho del terreno: ");
        ancho = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el largo del terreno: ");
        largo = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el valor del metro cuadrado del terreno: ");
        valorM2 = Integer.parseInt(input.nextLine());

        valorTotal = (ancho * largo) * valorM2;
        metrosAlambre = (ancho * largo) * 3;

        System.out.println("El valor total del terreno es de $" + valorTotal + " y la cantidad de alambre necesarios es de " + metrosAlambre);

        input.close();
    }

}
