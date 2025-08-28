package actividad1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cantHoras, precioHora, sueldoDia, sueldoSemana, lunVie, sabado;

        System.out.println("Ingrese el valor de la hora laboral: ");
        precioHora = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad de horas trabajadas diariamente: ");
        cantHoras = Integer.parseInt(input.nextLine());

        sueldoDia = (double)precioHora * cantHoras;
        lunVie = (double)sueldoDia * 5;
        sabado = (double)sueldoDia / 2;

        sueldoSemana = lunVie + sabado;

        System.out.println("El sueldo de la semana será de: $" + sueldoSemana);


        input.close();
    }

}
