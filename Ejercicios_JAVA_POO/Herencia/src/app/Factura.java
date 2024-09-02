//package app;
//
//class Factura {
//    public String numeroFactura;
//    public double subtotal;
//    public double iva;
//    public double total;
//
//    public Factura(String numeroFactura, double subtotal) {
//        this.numeroFactura = numeroFactura;
//        this.subtotal = subtotal;
//        this.iva = subtotal * 0.19;
//        this.total = subtotal + iva;
//    }
//
//    public String getNumeroFactura() {
//        return numeroFactura;
//    }
//
//    public void setNumeroFactura(String numeroFactura) {
//        this.numeroFactura = numeroFactura;
//    }
//
//    public double getSubtotal() {
//        return subtotal;
//    }
//
//    public void setSubtotal(double subtotal) {
//        this.subtotal = subtotal;
//    }
//
//    public double getIva() {
//        return iva;
//    }
//
//    public void setIva(double iva) {
//        this.iva = iva;
//    }
//
//    public double getTotal() {
//        return total;
//    }
//
//    public void setTotal(double total) {
//        this.total = total;
//    }
//}
//
//class FacturaConDescuento extends Factura {
//    private double descuentoAplicado;
//    private double totalConDescuento;
//
//    public FacturaConDescuento(String numeroFactura, double subtotal, double descuentoAplicado) {
//        super(numeroFactura, subtotal);
//        this.descuentoAplicado = descuentoAplicado;
//        this.totalConDescuento = getTotal() - descuentoAplicado;
//    }
//
//    public double getDescuentoAplicado() {
//        return descuentoAplicado;
//    }
//
//    public void setDescuentoAplicado(double descuentoAplicado) {
//        this.descuentoAplicado = descuentoAplicado;
//    }
//
//    public double getTotalConDescuento() {
//        return totalConDescuento;
//    }
//
//    public void setTotalConDescuento(double totalConDescuento) {
//        this.totalConDescuento = totalConDescuento;
//    }
//
//    public String toString() {
//        return "Número de Factura: " + getNumeroFactura() + "\nSubtotal: " + getSubtotal() + "\nIVA: " + getIva() + "\nTotal: " + getTotal() + "\nDescuento Aplicado: " + descuentoAplicado + "\nTotal con Descuento: " + totalConDescuento;
//    }
//
//    public static void main(String[] args) {
//        FacturaConDescuento factura1 = new FacturaConDescuento("F001", 1000, 50);
//        FacturaConDescuento factura2 = new FacturaConDescuento("F002", 2000, 100);
//        System.out.println(factura1.toString());
//        System.out.println(factura2.toString());
//    }
//}
