package com.mycompany.libro;

public class Orden {

    private int numOrden;
    private String fecha;
    private String cliente;
    private double montoTotal;

    public Orden(int numOrden, String fecha, String cliente, double montoTotal) {
        this.numOrden = numOrden;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Orden{"
                + "número de orden=" + numOrden
                + ", fecha='" + fecha + '\''
                + ", cliente='" + cliente + '\''
                + ", monto total=" + montoTotal
                + '}';
    }

    public static void main(String[] args) {
        Orden o1 = new Orden(1, "2024-07-01", "Martin Gonsalez", 150.0);
        Orden o2 = new Orden(2, "2024-07-02", "María López", 200.0);
        Orden o3 = new Orden(3, "2024-07-03", "Santiago Caceres", 250.0);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }

}
