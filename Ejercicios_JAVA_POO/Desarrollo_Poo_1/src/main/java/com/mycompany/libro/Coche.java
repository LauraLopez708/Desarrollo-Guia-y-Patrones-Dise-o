package com.mycompany.libro;

public class Coche {

    String marca = "Chevrolet";
    String modelo = "Sprint";
    int año = 1984;
    double precio = 9500000.00;

    public void imprimirValores() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "  +  modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: $" + precio);
    }

    public static void main(String[] args) {
        Coche objCoche = new Coche();
        objCoche.imprimirValores();
    }
}
