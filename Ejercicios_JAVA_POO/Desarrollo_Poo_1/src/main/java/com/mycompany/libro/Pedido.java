package com.mycompany.libro;

public class Pedido {

    String codigoPedido = "LAX2407512";
     String nombre = "Bolso de mano";
    int cantidad = 2;
    double precioTotal = 300000;

    public void imprimirValores() {
        System.out.println("Codigo del pedido: " + codigoPedido);
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Total: " + precioTotal);
    }

    public static void main(String[] args) {
        Pedido objPedido = new Pedido();
        objPedido.imprimirValores();
    }

}
