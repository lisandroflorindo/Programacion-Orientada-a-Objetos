//6. En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
//cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
//el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
//participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
//pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.

import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_COMPETIDORES = 12;
        int mejorVehiculo = -1;
        double mejorTiempo = Double.MAX_VALUE;

        System.out.println("=== Registro de tiempos de carrera ===");

        for (int i = 0; i < TOTAL_COMPETIDORES; i++) {
            System.out.println("\nCompetidor " + (i + 1));

            System.out.print("Ingrese el número del vehículo: ");
            int numeroVehiculo = sc.nextInt();

            System.out.print("Ingrese el tiempo en segundos: ");
            double tiempo = sc.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = numeroVehiculo;
            }
        }

        System.out.println("\n=== Resultados ===");
        System.out.println("Vehículo con el mejor tiempo: " + mejorVehiculo);
        System.out.println("Tiempo realizado: " + mejorTiempo + " segundos");
    }
}

