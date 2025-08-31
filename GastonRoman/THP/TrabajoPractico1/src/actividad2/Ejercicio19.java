package actividad2;

import java.util.Scanner;

public class Ejercicio19 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;

        System.out.println("Ingrese un número: ");
        num = Integer.parseInt(input.nextLine());

        esImpar = (num % 2) == 1;
        esDeUnSoloDigito = (num < 10 && num > 0);
        estaEnAmbosGrupos = esImpar && esDeUnSoloDigito;
        noEstaEnNingunGrupo = !esImpar && !esDeUnSoloDigito;

        System.out.println("El número ingresado es: " + num);
        System.out.println("Es Impar: " + esImpar);
        System.out.println("Es de un solo dígito: " + esDeUnSoloDigito);
        System.out.println("Está en ambos grupos: " + estaEnAmbosGrupos);
        System.out.println("No está en ningún grupo: " + noEstaEnNingunGrupo);

        input.close();
    }
}
