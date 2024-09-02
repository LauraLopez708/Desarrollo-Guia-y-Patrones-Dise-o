package com.mycompany.libro;

public class Factura {

    private String numFactura;
    private String fecha;
    private String cliente;
    private double importeTotal;

    public Factura(String numFactura, String fecha, String cliente, double importeTotal) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeTotal = importeTotal;
    }

    public String getNumeroFactura() {
        return numFactura;
    }

    public void setNumeroFactura(String numFactura) {
        this.numFactura = numFactura;
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

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Factura{"
                + "numeroFactura='" + numFactura + '\''
                + ", fecha='" + fecha + '\''
                + ", cliente='" + cliente + '\''
                + ", importeTotal=" + importeTotal
                + '}';
    }

    // Método principal para instanciar objetos y mostrar sus valores
    public static void main(String[] args) {
        Factura f1 = new Factura("001", "2024-07-01", "Juan Pérez", 150.0);
        Factura f2 = new Factura("002", "2024-07-02", "María López", 200.0);
        Factura f3 = new Factura("003", "2024-07-03", "Carlos García", 250.0);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
