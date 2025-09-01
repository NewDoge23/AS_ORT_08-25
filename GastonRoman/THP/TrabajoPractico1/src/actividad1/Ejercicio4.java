package actividad1;

/*
    Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
    cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
    semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
    sábados. (Todas las horas valen lo mismo.)
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cantHoras, precioHora, sueldoDia, sueldoSemana, lunVie, sabado;

        System.out.println("Ingrese el valor de la hora laboral: ");
        precioHora = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la cantidad de horas trabajadas diariamente: ");
        cantHoras = Integer.parseInt(input.nextLine());

        sueldoDia = precioHora * cantHoras;
        lunVie = sueldoDia * 5;
        sabado = sueldoDia / 2;

        sueldoSemana = lunVie + sabado;

        System.out.println("El sueldo de la semana será de: $" + sueldoSemana);


        input.close();
    }

}
