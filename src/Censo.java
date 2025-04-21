//7. Se realizó un censo provincial y se desea procesar la información obtenida en dicho
//censo. De cada una de las personas censadas se tiene la siguiente información: número de
//documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
//censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
//informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
//porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
//mostrar datos de la persona que registra la mayor edad.

import java.util.Scanner;

public class Censo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesEntre16y65 = 0;

        int edadMaxima = -1;
        int dniMayorEdad = -1;
        char sexoMayorEdad = ' ';
        int edadMayorEdad = -1;

        System.out.println("=== Ingreso de datos del censo ===");

        while (true) {
            System.out.print("\nIngrese el número de documento (0 para finalizar): ");
            int dni = sc.nextInt();

            if (dni == 0) break;

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese el sexo ('M' para masculino, 'F' para femenino): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            // Contador total
            totalPersonas++;

            // Clasificación por sexo
            if (sexo == 'M') {
                totalVarones++;

                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            // Mayor edad
            if (edad > edadMaxima) {
                edadMaxima = edad;
                dniMayorEdad = dni;
                sexoMayorEdad = sexo;
                edadMayorEdad = edad;
            }
        }

        // Calcular porcentaje
        double porcentajeVarones16a65 = 0;
        if (totalVarones > 0) {
            porcentajeVarones16a65 = (varonesEntre16y65 * 100.0) / totalVarones;
        }

        // Resultados
        System.out.println("\n=== Resultados del censo ===");
        System.out.println("Cantidad total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);
        System.out.printf("Porcentaje de varones entre 16 y 65 años: %.2f%%\n", porcentajeVarones16a65);

        if (dniMayorEdad != -1) {
            System.out.println("\nPersona con mayor edad:");
            System.out.println("DNI: " + dniMayorEdad);
            System.out.println("Sexo: " + sexoMayorEdad);
            System.out.println("Edad: " + edadMayorEdad);
        } else {
            System.out.println("No se ingresaron personas.");
        }
    }
}