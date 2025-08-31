package actividad1;

import java.util.Scanner;

/*4. Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
sábados. (Todas las horas valen lo mismo.)*/

public class Ejercicio4 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double horasTrabajadas, valorHoraTrabajo, horasTotales, salarioSemanal;

        System.out.println("Ingrese valor monetario de una hora de trabajo:");
        valorHoraTrabajo = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la cantidad  de  horas  trabajadas en un dia:");
        horasTrabajadas = Double.parseDouble(input.nextLine());

        horasTotales = horasTrabajadas * 5 + horasTrabajadas / 2;

        salarioSemanal = horasTotales * valorHoraTrabajo;

        System.out.println("Su sueldo semanal es de: " + salarioSemanal);

        input.close();
    }

}
