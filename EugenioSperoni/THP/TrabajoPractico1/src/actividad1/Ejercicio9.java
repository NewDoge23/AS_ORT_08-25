package actividad1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double medidaGrado1, medidaGrado2, gradosTotales, gradosRestantes;

        System.out.println("Bienvenidos, ingrese una medida de grados de un angulo interno de cierto triangulo = ");
        medidaGrado1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese una segunda medida de grado de un angulo interno del mismo triangulo = ");
        medidaGrado2 = Integer.parseInt(input.nextLine());

        gradosTotales = 180;
        gradosRestantes = gradosTotales - medidaGrado1 - medidaGrado2;

        System.out.println("El angulo restante del triangulo es de = " + gradosRestantes + "°");

        input.close();

    }
}
