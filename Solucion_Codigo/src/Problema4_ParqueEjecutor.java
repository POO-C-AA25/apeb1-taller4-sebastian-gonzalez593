import java.util.Scanner;

public class Problema4_ParqueEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema4_ParqueBase parque = new Problema4_ParqueBase();

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nIngrese nombre del visitante: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese estatura (en metros): ");
            double estatura = sc.nextDouble();
            sc.nextLine(); 

            Problema4_VisitanteBase visitante = new Problema4_VisitanteBase(nombre, edad, estatura);
            parque.registrarVisitante(visitante);

            System.out.print("\n¿Desea registrar otro visitante? (s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println(parque.mostrarResumen());
        sc.close();
    }
}
