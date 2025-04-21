//5. Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
//permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
//clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
//cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
//cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
//servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
//calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
//informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
//con el que cuenta.

import java.util.Scanner;

class Cliente {
    String dni;
    int tipoServicio;
    double monto;

    public Cliente(String dni, int tipoServicio, double monto) {
        this.dni = dni;
        this.tipoServicio = tipoServicio;
        this.monto = monto;
    }

    public void mostrarFactura() {
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Monto a pagar: $" + String.format("%.2f", monto));
        System.out.println("------------------------------");
    }
}

public class FacturaInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_CLIENTES = 5;
        Cliente[] clientes = new Cliente[TOTAL_CLIENTES];

        System.out.println("=== Facturación de clientes de internet ===");

        for (int i = 0; i < TOTAL_CLIENTES; i++) {
            System.out.println("\nCliente " + (i + 1));

            System.out.print("Ingrese el DNI del cliente: ");
            String dni = sc.nextLine();

            int tipoServicio;
            while (true) {
                System.out.print("Ingrese el tipo de servicio (1 = 30 megas, 2 = 50 megas, 3 = 100 megas): ");
                tipoServicio = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                if (tipoServicio >= 1 && tipoServicio <= 3) break;
                else System.out.println("Tipo de servicio inválido. Intente nuevamente.");
            }

            double monto = 0;
            switch (tipoServicio) {
                case 1:
                    monto = 750;
                    break;
                case 2:
                    monto = 1100;
                    break;
                case 3:
                    monto = 1500 * 0.95; // 5% de descuento
                    break;
            }

            clientes[i] = new Cliente(dni, tipoServicio, monto);
        }

        System.out.println("\n=== Facturas generadas ===");
        for (Cliente c : clientes) {
            c.mostrarFactura();
        }
    }
}
