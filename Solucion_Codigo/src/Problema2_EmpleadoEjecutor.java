import java.util.Scanner;

public class Problema2_EmpleadoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double sumaSalarios = 0;
        boolean continuar = true;

        System.out.print("Ingrese el porcentaje de aumento salarial: ");
        double porcentaje = sc.nextDouble();
        sc.nextLine(); 

        while (continuar) {
            System.out.println("\nRegistro de empleado #" + (contador + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            Problema2_EmpleadoBase empleado = new Problema2_EmpleadoBase(nombre, salario, edad);

            sumaSalarios += salario;
            contador++;

            double promedio = sumaSalarios / contador;

            System.out.println("\n--- ANÁLISIS ---");
            System.out.println("Salario promedio actual: $" + promedio);
            if (empleado.getSalario() < promedio) {
                empleado.aumento(porcentaje);
                System.out.println("Se aplicó un aumento del " + porcentaje + "%");
            } else {
                System.out.println("No se aplicó aumento.");
            }

            System.out.println("\n--- INFORMACIÓN FINAL ---");
            empleado.mostrarInformacion(); 

            System.out.print("\n¿Desea ingresar otro empleado? (s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        sc.close();
    }
}
