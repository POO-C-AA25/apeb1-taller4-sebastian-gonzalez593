public class Problema1_ProductoVentaBase {
   private double precio;
    private int cantidad;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularDescuento() {
        if (getPrecio() >= 1000 && getCantidad() >= 10) {
            return 0.10;
        } else if (getPrecio() < 1000) {
            return 0.05;
        }
        return 0.0;
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        return getPrecio() * getCantidad() * (1 - descuento);
    }

    public String toString() {
        double descuento = calcularDescuento() * 100;
        double totalFinal = calcularPrecioFinal();
        return "Precio unitario: $" + getPrecio() +
               "\nCantidad: " + getCantidad() +
               "\nDescuento aplicado: " + descuento + "%" +
               "\nPrecio final: $" + totalFinal;
    }
}
