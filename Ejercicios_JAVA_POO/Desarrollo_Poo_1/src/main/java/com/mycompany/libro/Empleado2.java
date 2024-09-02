
package com.mycompany.libro;

public class Empleado2 {
    
    private String nombre;
    private int horasTrabajadas;
    private double pagoHora;
    private double salarioTotal;

    public Empleado2(String nombre, int horasTrabajadas, double pagoHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
        this.salarioTotal = calcularSalarioTotal();
    }

    private double calcularSalarioTotal() {
        return horasTrabajadas * pagoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int pagoHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getPagoPorHora() {
        return pagoHora;
    }

    public void setPagoPorHora(double pagoHora) {
        this.pagoHora = pagoHora;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    @Override
    public String toString() {
        return "Empleado2 [Nombre: " + nombre + ", Horas Trabajadas: " + horasTrabajadas + 
               ", Pago por Hora: " + pagoHora + ", Salario Total: " + salarioTotal + "]";
    }

    public static void main(String[] args) {
        Empleado2 empleado1 = new Empleado2("Aurelio", 40, 20.50);
        Empleado2 empleado2 = new Empleado2("Bernarda", 35, 18.75);
        Empleado2 empleado3 = new Empleado2("Crispina", 45, 22.00);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}
