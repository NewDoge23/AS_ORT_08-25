package actividad1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el ancho del terreno en metros: ");
        double ancho = input.nextDouble();

        System.out.print("Ingrese el largo del terreno en metros: ");
        double largo = input.nextDouble();

        System.out.print("Ingrese el valor del metro cuadrado de tierra: ");
        double valorMetroCuadrado = input.nextDouble();

        double superficie = ancho * largo;

        double valorTerreno = superficie * valorMetroCuadrado;

        double perimetro = 2 * (ancho + largo);

        double alambre = perimetro * 3;

        System.out.println("El valor total del terreno es: $" + valorTerreno);
        System.out.println("La cantidad de metros de alambre necesarios es: " + alambre + " metros");

        input.close();
    }
}
