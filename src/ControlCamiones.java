//4. Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
//camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
//camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
//que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
//cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
//usuario.

import java.util.Scanner;

class Camion {
    String patente;
    String chofer;
    String tipoCarga;
    String horaEgreso;

    public Camion(String patente, String chofer, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.chofer = chofer;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + chofer);
        System.out.println("Tipo de carga: " + tipoCarga);
        System.out.println("Hora de egreso: " + horaEgreso);
        System.out.println("-----------------------------");
    }
}

public class ControlCamiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_CAMIONES = 3;
        Camion[] camiones = new Camion[TOTAL_CAMIONES];
        int contadorTe = 0;

        System.out.println("=== Control de egreso de camiones ===");

        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.println("\nCamión " + (i + 1));

            System.out.print("Ingrese la patente: ");
            String patente = sc.nextLine();

            System.out.print("Ingrese el nombre y apellido del chofer: ");
            String chofer = sc.nextLine();

            String tipoCarga;
            while (true) {
                System.out.print("Ingrese el tipo de carga (madera, yerba, té): ");
                tipoCarga = sc.nextLine().toLowerCase();

                if (tipoCarga.equals("madera") || tipoCarga.equals("yerba") || tipoCarga.equals("té")) {
                    break;
                } else {
                    System.out.println("Tipo de carga inválido. Intente nuevamente.");
                }
            }

            System.out.print("Ingrese la hora de egreso (hh:mm): ");
            String horaEgreso = sc.nextLine();

            camiones[i] = new Camion(patente, chofer, tipoCarga, horaEgreso);

            if (tipoCarga.equals("té")) {
                contadorTe++;
            }
        }

        System.out.println("\n=== Datos de los camiones ===");
        for (Camion c : camiones) {
            c.mostrarDatos();
        }

        System.out.println("Cantidad de camiones que cargaron té: " + contadorTe);
    }
}
