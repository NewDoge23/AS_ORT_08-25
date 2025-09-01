package actividad3;

/*
    Realizá un programa que a partir de un número entero cant ingresado por el usuario permita
    cargar por teclado cant números enteros. La computadora debe mostrar cuál fue el mayor
    número y en qué posición apareció.
 */

import java.util.Scanner;

public class Ejercicio28 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int cant, num, mayor = Integer.MIN_VALUE, aux1 = 0;

        System.out.println("Ingrese la cantidad de números enteros a ingresar: ");
        cant = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= cant; i++) {
            System.out.println("Ingrese el " + i + "° número: ");
            num = Integer.parseInt(input.nextLine());
            if (num > mayor) {
                mayor = num;
                aux1 = i;
            }
        }
        System.out.println("El mayor número cargado fue: '" + mayor + "' y fue cargado en la posición: " + aux1 + "°");
    }
}
