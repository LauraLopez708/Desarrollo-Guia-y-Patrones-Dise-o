package com.mycompany.libro;

public class Producto {

    String codigo = "240098";
    String nombre = "Chocolate";
    double precio = 25000.00;
    int stock = 25;

    public void imprimirValores() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Producto objProducto = new Producto();
        objProducto.imprimirValores();
    }

}
