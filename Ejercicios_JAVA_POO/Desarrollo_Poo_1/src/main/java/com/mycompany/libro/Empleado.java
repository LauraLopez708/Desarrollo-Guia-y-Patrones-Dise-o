package com.mycompany.libro;

public class Empleado {

    String nombre = "Mariana Torres";
    String puesto = "Secretaria";
    double salario = 2500000.00;
    int antiguedad = 3;

    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
        System.out.println("antigüedad: " + antiguedad);
    }

    public static void main(String[] args) {
        Empleado objEmpleado = new Empleado();
        objEmpleado.imprimirValores();
    }
}
