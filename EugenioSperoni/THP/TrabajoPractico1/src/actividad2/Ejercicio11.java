package actividad2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numeroEntero;
        int calculoResto;
        boolean esPar;

        System.out.print("Ingrese el primer numero natural = ");
        numeroEntero = Integer.parseInt(input.nextLine());

        calculoResto = numeroEntero % 2;
        esPar = calculoResto == 0;

        if (esPar) {
            System.out.print("Es par ");
            }else {
            System.out.print("Es impar ");
        }
        input.close();
    }
}