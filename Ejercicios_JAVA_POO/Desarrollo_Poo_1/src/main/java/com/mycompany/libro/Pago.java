package com.mycompany.libro;

public class Pago {
    
    private String numeroPago;
    private String empleado;
    private double salarioBase;
    private double bonificacion;
    private double deduccion;
    private double salarioNeto;

    public Pago(String numeroPago, String empleado, double salarioBase, double bonificacion, double deduccion) {
        this.numeroPago = numeroPago;
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();
    }

    private double calcularSalarioNeto() {
        return salarioBase + bonificacion - deduccion;
    }

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        this.salarioNeto = calcularSalarioNeto();
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
        this.salarioNeto = calcularSalarioNeto();
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    @Override
    public String toString() {
        return "Pago [Número de Pago: " + numeroPago + ", Empleado: " + empleado + 
               ", Salario Base: " + salarioBase + ", Bonificación: " + bonificacion + 
               ", Deducción: " + deduccion + ", Salario Neto: " + salarioNeto + "]";
    }

    public static void main(String[] args) {
        Pago pago1 = new Pago("A111", "Sebastian Mora", 1500.00, 200.00, 50.00);
        Pago pago2 = new Pago("X442", "Joaquin Florez", 1800.00, 150.00, 100.00);
        Pago pago3 = new Pago("D803", "Laura López", 2000.00, 250.00, 75.00);

        System.out.println(pago1);
        System.out.println(pago2);
        System.out.println(pago3);
    }
    
}
