package com.mycompany.libro;

public class Curso {

    String nombre = "Sergio Peña";
    String codigo = "2827167";
    int creditos = 64;
    String profesor = "Hector José Hernandez";

    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Creditos: " + creditos);
        System.out.println("Profesor: " + profesor);
    }

    public static void main(String[] args) {
        Curso objCurso = new Curso();
        objCurso.imprimirValores();
    }

}
