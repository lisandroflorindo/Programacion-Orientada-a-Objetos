//1. Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
//cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
//ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
//notas se debe mostrar la nota más alta y el promedio de notas.

import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        double suma = 0;
        double notaMaxima = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];

            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }

        double promedio = suma / n;

        System.out.println("\nLa nota más alta es: " + notaMaxima);
        System.out.println("El promedio de notas es: " + promedio);
    }
}