
package com.mycompany.libro;

public class Pedido2 {
    
    private String numPedido;
    private String cliente;
    private int cantidad;
    private double precioArticulo;
    private double precioTotal;

    public Pedido2(String numPedido, String cliente, int cantidad, double precioArticulo) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precioArticulo = precioArticulo;
        this.precioTotal = calcularPrecioTotal();
    }

    private double calcularPrecioTotal() {
        return cantidad * precioArticulo;
    }

    public String getNumeroPedido() {
        return numPedido;
    }

    public void setNumeroPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadArticulos() {
        return cantidad;
    }

    public void setCantidadArticulos(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioPorArticulo() {
        return precioArticulo;
    }

    public void setPrecioPorArticulo(double cantidad) {
        this.precioArticulo = precioArticulo;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Pedido2 [Número de Pedido: " + numPedido + ", Cliente: " + cliente + 
               ", Cantidad de Artículos: " + cantidad + ", Precio por Artículo: " + precioArticulo + 
               ", Precio Total: " + precioTotal + "]";
    }

    public static void main(String[] args) {
        Pedido2 pedido1 = new Pedido2("1", "Pedro", 10, 5841.50);
        Pedido2 pedido2 = new Pedido2("2", "Antonia", 5, 7543.00);
        Pedido2 pedido3 = new Pedido2("3", "Giovanny", 20, 3612.75);

        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
    }
}
