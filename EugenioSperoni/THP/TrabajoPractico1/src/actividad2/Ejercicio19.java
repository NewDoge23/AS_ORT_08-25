package actividad2;

import java.util.Scanner;

    public class Ejercicio19 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int numero;

            System.out.print("Ingrese un número entero: ");
            numero = Integer.parseInt(input.nextLine());

            boolean esDeUnSoloDigito = (numero >= -9 && numero <= 9);
            boolean esImpar = (numero % 2 != 0);
            boolean estaEnAmbosGrupos = (esDeUnSoloDigito && esImpar);
            boolean noEstaEnNingunGrupo = !esDeUnSoloDigito && !esImpar;

            System.out.println("Número ingresado: " + numero);
            System.out.println("¿Es de un solo dígito?: " + esDeUnSoloDigito);
            System.out.println("¿Es impar?: " + esImpar);
            System.out.println("¿Está en ambos grupos?: " + estaEnAmbosGrupos);
            System.out.println("¿No está en ningún grupo?: " + noEstaEnNingunGrupo);

            input.close();
        }
    }