package actividad2;

/*
    Existen dos reglas que identifican dos conjuntos de valores:
        a. El número es de un solo dígito.
        b. El número es impar.
    A partir de estas reglas, realiza un programa que permita ingresar un número entero. Debe
    asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
    estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda,
    para indicar si el valor número ingresado pertenece o no a cada conjunto. Al terminar el
    programa debe informar el número cargado y las cuatros variables lógicas. Definí un lote de
    prueba de varios números y proba el algoritmo, escribiendo los resultados tal como se hizo
    en los ejercicios anteriores.
 */

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
