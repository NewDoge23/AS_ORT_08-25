package actividad2;

import java.util.Scanner;

public class Ejercicio19 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean estaEnAmbosGrupos, noEstaEnNingunGrupo, esImpar, esDeUnSoloDigito;
        int num;

        System.out.println("Por favor, ingrese un número entero:");
        num = Integer.parseInt(input.nextLine());

        esImpar = (num % 2) == 1;
        esDeUnSoloDigito = (num >= -9 && num <= 9);
        estaEnAmbosGrupos = esImpar && esDeUnSoloDigito;
        noEstaEnNingunGrupo = !(esImpar || esDeUnSoloDigito);

        System.out.println("El número ingresado es: " + num);
        System.out.println("Es Impar: " + esImpar);
        System.out.println("Es de un solo dígito: " + esDeUnSoloDigito);
        System.out.println("Está en ambos grupos: " + estaEnAmbosGrupos);
        System.out.println("No está en ningún grupo: " + noEstaEnNingunGrupo);

        input.close();

    }
}
