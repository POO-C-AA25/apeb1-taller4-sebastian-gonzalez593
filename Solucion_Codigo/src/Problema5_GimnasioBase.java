public class Problema5_GimnasioBase {
    private int totalClientes;
    private int clientesQueCumplieron;
    private int sumaDuraciones;

    public void registrarCliente(Problema5_ClienteBase cliente) {
        totalClientes++;
        sumaDuraciones += cliente.getDuracion();
        if (cliente.getCumplio()) {
            clientesQueCumplieron++;
        }
        System.out.println("\n--- Información del cliente ---");
        System.out.println(cliente.toString());
    }

    public String mostrarResumen() {
        double promedio = totalClientes > 0 ? (double) sumaDuraciones / totalClientes : 0;
        return "\n--- RESUMEN DEL GIMNASIO ---\n" +
               "Total de clientes: " + totalClientes +
               "\nClientes que completaron su rutina: " + clientesQueCumplieron +
               "\nTiempo promedio invertido: " + String.format("%.2f", promedio) + " minutos";
    }
}
