public class Problema2_EmpleadoBase {
    private String nombre;
    private double salario;
    private int edad;

    public Problema2_EmpleadoBase(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void aumento(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }
}
