package actividad1;


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        double valorHora, horasDiarias, horasFinde,horasDiaHabil, salarioTotalSemanal,horasTotalesSemanales;

        System.out.println("Bienvenidos, porfavor ingresar el valor de la hora de trabajo = ");
        valorHora = Integer.parseInt(input.nextLine());
        System.out.println("Porfavor ingresar la cantidad de horas trabajadas por dia = ");
        horasDiarias = Integer.parseInt(input.nextLine());

        horasFinde = (double)horasDiarias / 2 ;
        horasDiaHabil = horasDiarias * 5;
        horasTotalesSemanales = horasFinde + horasDiaHabil;
        salarioTotalSemanal = valorHora * horasTotalesSemanales;

        System.out.println("Tu salario semanal es de = " + salarioTotalSemanal);

        input.close();

    }

}
