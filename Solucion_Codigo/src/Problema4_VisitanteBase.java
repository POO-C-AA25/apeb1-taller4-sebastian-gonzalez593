public class Problema4_VisitanteBase {
    private String nombre;
    private int edad;
    private double estatura;

    public Problema4_VisitanteBase(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public boolean cumpleRequisitos() {
        return edad >= 12 && estatura >= 1.5;
    }

    public String toString() {
        String acceso = cumpleRequisitos() ? "Accede a todos los juegos" : "No cumple los requisitos";
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nEstatura: " + estatura + " m" +
               "\nResultado: " + acceso;
    }

    public boolean getCumple() {
        return cumpleRequisitos();
    }
}
