package actividad2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        boolean numeroMayor;

        System.out.println("Ingrese un numero porfavor = ");
        primerNumero = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero porfavor = ");
        segundoNumero = Integer.parseInt(input.nextLine());

        numeroMayor = primerNumero > segundoNumero;

        if (numeroMayor) {
            System.out.println("El numero mayor es " + primerNumero);
            }else {
            System.out.println("El numero mayor es " + segundoNumero);
        }
        input.close();
    }
}