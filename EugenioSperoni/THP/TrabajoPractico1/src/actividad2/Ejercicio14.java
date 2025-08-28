package actividad2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int edad;
        double altura;
        boolean puedeEntrar;

        System.out.print("Ingrese la edad del niño: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la altura del niño en metros: ");
        altura = Double.parseDouble(input.nextLine());

        puedeEntrar = edad >= 7 && altura > 1.50;

        if(puedeEntrar) {
            System.out.println("Puede entrar a la montaña rusa.");
        } else {
            System.out.println("No cumple los requisitos para entrar.");
        }
        input.close();
    }
}