package com.mycompany.libro;

public class Servicio {
    private String codigo;
    private String descripcion;
    private double precioPorHora;
    private int horasTrabajadas;
    private double precioTotal;

    public Servicio(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigo = codigoServicio;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();
    }

    private double calcularPrecioTotal() {
        return precioPorHora * horasTrabajadas;
    }

    public String getCodigoServicio() {
        return codigo;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigo = codigoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        this.precioTotal = calcularPrecioTotal();
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Servicio [Código de Servicio: " + codigo + ", Descripción: " + descripcion + 
               ", Precio por Hora: " + precioPorHora + ", Horas Trabajadas: " + horasTrabajadas + 
               ", Precio Total: " + precioTotal + "]";
    }

    public static void main(String[] args) {
        Servicio servicio1 = new Servicio("AX41", "Reparación de Computadora", 50.00, 4);
        Servicio servicio2 = new Servicio("VS2", "Diseño Gráfico", 40.00, 10);
        Servicio servicio3 = new Servicio("XWE3", "Consultoría TI", 75.00, 8);

        System.out.println(servicio1);
        System.out.println(servicio2);
        System.out.println(servicio3);
    }
}
