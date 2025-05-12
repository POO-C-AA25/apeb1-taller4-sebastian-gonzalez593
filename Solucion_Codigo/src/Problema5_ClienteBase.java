public class Problema5_ClienteBase {
    private String nombre;
    private String tipoEjercicio;
    private int duracion;
    private boolean cumplio;

    public Problema5_ClienteBase(String nombre, String tipoEjercicio, int duracion, boolean cumplio) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.cumplio = cumplio;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean getCumplio() {
        return cumplio;
    }

    public String toString() {
        String estado = cumplio ? "Rutina completada" : "Rutina incompleta";
        return "Nombre: " + nombre +
               "\nTipo de ejercicio: " + tipoEjercicio +
               "\nDuración: " + duracion + " minutos" +
               "\nEstado: " + estado;
    }
}
