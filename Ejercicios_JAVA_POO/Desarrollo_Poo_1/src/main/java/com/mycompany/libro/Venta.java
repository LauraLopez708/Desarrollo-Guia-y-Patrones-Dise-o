
package com.mycompany.libro;

public class Venta {
    
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();
    }

    private double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal(); 
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Venta [Producto: " + producto + ", Cantidad: " + cantidad + ", Precio Unitario: " + precioUnitario +
                ", Precio Total: " + precioTotal + "]";
    }

    public static void main(String[] args) {
        Venta venta1 = new Venta("Computador portatil", 2, 750.00);
        Venta venta2 = new Venta("Teléfono", 5, 300.00);
        Venta venta3 = new Venta("Tablet", 3, 150.00);

        System.out.println(venta1);
        System.out.println(venta2);
        System.out.println(venta3);
    }
}
