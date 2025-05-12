import java.util.Scanner;

public class Problema1_ProductoVentaEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Problema1_ProductoVentaBase producto = new Problema1_ProductoVentaBase();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        producto.setPrecio(precio);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        producto.setCantidad(cantidad);

        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println(producto.toString());

        sc.close();
    }
}
