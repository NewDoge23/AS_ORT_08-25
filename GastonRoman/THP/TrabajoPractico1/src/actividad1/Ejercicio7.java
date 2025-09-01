package actividad1;

/*
    Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
    valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
    metros de alambre para cercarlo completamente a tres alturas distintas.
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double anchoTerreno, largoTerreno, valorMetro, valorTerreno, supTerreno, perTerreno;

        System.out.println("Ingrese el ancho del terreno: ");
        anchoTerreno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el largo del terreno: ");
        largoTerreno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el valor del metro cuadrado: ");
        valorMetro = Integer.parseInt(input.nextLine());

        supTerreno = anchoTerreno * largoTerreno;
        valorTerreno = supTerreno * valorMetro;
        perTerreno = (anchoTerreno * 2) + (largoTerreno * 2);

        System.out.println("El valor del terreno es de: $" + valorTerreno);
        System.out.println("Se necesitarán " + perTerreno + "mts de alambre para cercarlo.");

        input.close();
    }
}
