package com.mycompany.libro;

public class Libro {

    String isbn = "978-3-16-148410-0";
    String titulo = "Alicia en el país de las maravillas";
    String autor = "Lewis Carroll";
    String disponible = "sí";

    public void imprimirValores() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.imprimirValores();
    }
}
