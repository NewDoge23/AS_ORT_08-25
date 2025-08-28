package actividad3;

import java.util.Scanner;

public class Ejercicio27 {

    static Scanner input = new Scanner(System.in);

    static final int CANT_EDADES = 5;
    static final int EDAD_BASE = 18;

    public static void main(String[] args) {

        int edad, cont1 = 0, totalSumEdades = 0;
        double promedio;

        for (int i = 1; i <= CANT_EDADES; i++) {

            System.out.println("Ingrese la " + i + "° edad: ");
            edad = Integer.parseInt(input.nextLine());
            totalSumEdades = totalSumEdades + edad;
            if (edad > EDAD_BASE && (edad % 2) != 0){
                cont1++;
            }
        }

        promedio = (double) totalSumEdades / CANT_EDADES;

        System.out.println("El promedio de las " + CANT_EDADES + " edades sumadas, es de: " + promedio);
        System.out.println("La cantidad de edades impares, mayores a 18, fueron: " + cont1);


        input.close();
    }
}


