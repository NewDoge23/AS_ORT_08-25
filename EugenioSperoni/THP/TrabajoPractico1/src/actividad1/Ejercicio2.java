package actividad1;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primeraNota, segundaNota, terceraNota;
        double promedioNotas;

        System.out.println("Ingrese la nota del Primer trimestre =");
        primeraNota = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la nota del Primer trimestre =");
        segundaNota = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la nota del Primer trimestre =");
        terceraNota = Integer.parseInt(input.nextLine());

        promedioNotas = primeraNota + segundaNota + terceraNota;
        System.out.println("El promedio de las notas es de " + promedioNotas);

        input.close();

    }

}
