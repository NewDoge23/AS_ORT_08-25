package actividad2;

import java.util.Scanner;

public class Ejercicio15 {

    static Scanner input = new Scanner(System.in);

    static final int EDAD_MIN = 6;
    static final double ALT_MIN = 1.5;

    public static void main(String[] args) {

        int edad;
        double altura;
        String nombre;

        System.out.println("Ingrese el nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese la edad de " + nombre + ": ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la altura de " + nombre + ": ");
        altura = Double.parseDouble(input.nextLine());

        if (edad > EDAD_MIN || altura > ALT_MIN) {
            System.out.println(nombre + " puede ingresar!");
        } else {
            System.out.println(nombre + " no puede ingresar debido a los requisitos mínimos.");
        }
        input.close();
    }
}
