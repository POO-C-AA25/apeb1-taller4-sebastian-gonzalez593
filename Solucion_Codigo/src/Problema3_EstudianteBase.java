public class Problema3_EstudianteBase {
    private String nombre;
    private int grado;
    private boolean permisoVigente;

    public Problema3_EstudianteBase(String nombre, int grado, boolean permisoVigente) {
        this.nombre = nombre;
        this.grado = grado;
        this.permisoVigente = permisoVigente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrado() {
        return grado;
    }

    public boolean tienePermiso() {
        return permisoVigente;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Grado: " + grado + ", Permiso vigente: " + (permisoVigente ? "Sí" : "No");
    }
}
