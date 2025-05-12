import java.util.Scanner;

public class Problema5_GimnasioEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema5_GimnasioBase gimnasio = new Problema5_GimnasioBase();

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nIngrese nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Tipo de ejercicio (cardio/fuerza/estiramiento): ");
            String tipo = sc.nextLine();

            System.out.print("Duración en minutos: ");
            int duracion = sc.nextInt();

            System.out.print("¿Completó la rutina? (true/false): ");
            boolean cumplio = sc.nextBoolean();
            sc.nextLine(); 

            Problema5_ClienteBase cliente = new Problema5_ClienteBase(nombre, tipo, duracion, cumplio);
            gimnasio.registrarCliente(cliente);

            System.out.print("\n¿Desea registrar otro cliente? (s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println(gimnasio.mostrarResumen());
        sc.close();
    }
}
