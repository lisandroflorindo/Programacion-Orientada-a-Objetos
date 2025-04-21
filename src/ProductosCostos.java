//3. Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
//costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.

import java.util.Scanner;

public class ProductosCostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();

        int[] cantidades = new int[n];
        double[] costos = new double[n];

        double precioTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1));
            System.out.print("Ingrese la cantidad: ");
            cantidades[i] = sc.nextInt();

            System.out.print("Ingrese el costo unitario: ");
            costos[i] = sc.nextDouble();

            precioTotal += cantidades[i] * costos[i];
        }

        System.out.println("\nPrecio total de todos los productos: $" + precioTotal);

        System.out.println("Productos con precio total mayor a $1000:");
        for (int i = 0; i < n; i++) {
            double precioProducto = cantidades[i] * costos[i];
            if (precioProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + precioProducto);
            }
        }
    }
}