package actividad1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombrePrimera, nombreSegunda, nombreTercera;
        double aportePrimera, aporteSegunda, aporteTercera, totalAportado, primerPorcentaje, segundoPorcentaje, tercerPocentaje;

        System.out.println("Bienvenidos Socios");
        System.out.println("Ingrese nombre de socio = ");
        nombrePrimera = input.nextLine();
        System.out.println("Ingrese aportes realizados = ");
        aportePrimera = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese nombre de socio = ");
        nombreSegunda = input.nextLine();
        System.out.println("Ingrese aportes realizados = ");
        aporteSegunda = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese nombre de socio = ");
        nombreTercera = input.nextLine();
        System.out.println("Ingrese aportes realizados = ");
        aporteTercera = Integer.parseInt(input.nextLine());

        totalAportado = aportePrimera + aporteSegunda + aporteTercera;
        primerPorcentaje = (totalAportado * aportePrimera) / 100 ;
        segundoPorcentaje = (totalAportado * aporteSegunda) / 100 ;
        tercerPocentaje = (totalAportado * aporteTercera) / 100 ;

        System.out.println("El socio " + nombrePrimera + " tiene un porcentaje del = " + primerPorcentaje + "%");
        System.out.println("El socio " + nombreSegunda + " tiene un porcentaje del = " + segundoPorcentaje + "%");
        System.out.println("El socio " + nombreTercera + " tiene un porcentaje del = " + tercerPocentaje + "%");

        input.close();

    }
}
