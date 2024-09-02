package com.mycompany.libro;

public class Estudiante {

    String nombre = "Fernando Perez";
    int edad = 20;
    String carrera = "Diseño Gráfico";
    double promedio = 8.5;

    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    public static void main(String[] args) {
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.imprimirValores();
    }

}
