import java.util.Scanner;

public class Problema3_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estudiantesAceptados = 0;
        int estudiantesRechazados = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("\nRegistro de Estudiante");
            System.out.print("Nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Grado: ");
            int grado = sc.nextInt();

            System.out.print("¿Tiene permiso vigente? (s/n): ");
            boolean permiso = sc.next().equalsIgnoreCase("s");
            sc.nextLine(); 

            Problema3_EstudianteBase estudiante = new Problema3_EstudianteBase(nombre, grado, permiso);

            if (estudiante.tienePermiso()) {
                estudiantesAceptados++;
                System.out.println("Estudiante aceptado para el autobús.");
            } else {
                estudiantesRechazados++;
                System.out.println("Estudiante rechazado por no tener permiso.");
            }

            System.out.println("\n--- Información del Estudiante ---");
            System.out.println(estudiante);


            System.out.print("\n¿Desea registrar otro estudiante? (s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        
        System.out.println("\n--- Resumen ---");
        System.out.println("Estudiantes aceptados: " + estudiantesAceptados);
        System.out.println("Estudiantes rechazados: " + estudiantesRechazados);

        sc.close();
    }
}
