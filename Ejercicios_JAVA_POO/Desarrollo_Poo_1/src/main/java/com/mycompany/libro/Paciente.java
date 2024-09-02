package com.mycompany.libro;

public class Paciente {

    String nombre = "Carlos Sanchez";
    int edad = 64;
    String enfermedad = "Apendicitis";
    String doctor = "Angel Sebastian Granados";

    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Doctor: " + doctor);
    }

    public static void main(String[] args) {
        Paciente objPaciente = new Paciente();
        objPaciente.imprimirValores();
    }
}
