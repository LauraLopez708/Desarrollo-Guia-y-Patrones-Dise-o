//package app;
//
//class Producto {
//    public String codigoProducto;
//    public String nombreProducto;
//    public double precioPorUnidad;
//
//    public Producto(String codigoProducto, String nombreProducto, double precioPorUnidad) {
//        this.codigoProducto = codigoProducto;
//        this.nombreProducto = nombreProducto;
//        this.precioPorUnidad = precioPorUnidad;
//    }
//
//    public String getCodigoProducto() {
//        return codigoProducto;
//    }
//
//    public void setCodigoProducto(String codigoProducto) {
//        this.codigoProducto = codigoProducto;
//    }
//
//    public String getNombreProducto() {
//        return nombreProducto;
//    }
//
//    public void setNombreProducto(String nombreProducto) {
//        this.nombreProducto = nombreProducto;
//    }
//
//    public double getPrecioPorUnidad() {
//        return precioPorUnidad;
//    }
//
//    public void setPrecioPorUnidad(double precioPorUnidad) {
//        this.precioPorUnidad = precioPorUnidad;
//    }
//}
//
//class ProductoPerecedero extends Producto {
//    private String fechaCaducidad;
//    private double descuento;
//
//    public ProductoPerecedero(String codigoProducto, String nombreProducto, double precioPorUnidad, String fechaCaducidad, double descuento) {
//        super(codigoProducto, nombreProducto, precioPorUnidad);
//        this.fechaCaducidad = fechaCaducidad;
//        this.descuento = descuento;
//    }
//
//    public String getFechaCaducidad() {
//        return fechaCaducidad;
//    }
//
//    public void setFechaCaducidad(String fechaCaducidad) {
//        this.fechaCaducidad = fechaCaducidad;
//    }
//
//    public double getDescuento() {
//        return descuento;
//    }
//
//    public void setDescuento(double descuento) {
//        this.descuento = descuento;
//    }
//
//    public String toString() {
//        return "Código Producto: " + getCodigoProducto() + "\nNombre Producto: " + getNombreProducto() + "\nPrecio por Unidad: " + getPrecioPorUnidad() + "\nFecha de Caducidad: " + fechaCaducidad + "\nDescuento: " + descuento;
//    }
//
//    public static void main(String[] args) {
//        ProductoPerecedero perecedero1 = new ProductoPerecedero("P123", "Leche", 1.5, "2024-09-01", 0.2);
//        ProductoPerecedero perecedero2 = new ProductoPerecedero("P124", "Queso", 2.0, "2024-08-15", 0.3);
//        System.out.println(perecedero1.toString());
//        System.out.println(perecedero2.toString());
//    }
//}
