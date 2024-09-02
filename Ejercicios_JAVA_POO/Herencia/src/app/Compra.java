//package app;
//
//class Compra {
//
//    public String numeroCompra;
//    public String proveedor;
//    public int cantidadProductos;
//    public double precioPorProducto;
//    public double precioTotal;
//
//    public Compra(String numeroCompra, String proveedor, int cantidadProductos, double precioPorProducto) {
//        this.numeroCompra = numeroCompra;
//        this.proveedor = proveedor;
//        this.cantidadProductos = cantidadProductos;
//        this.precioPorProducto = precioPorProducto;
//        this.precioTotal = cantidadProductos * precioPorProducto;
//    }
//
//    public String getNumeroCompra() {
//        return numeroCompra;
//    }
//
//    public void setNumeroCompra(String numeroCompra) {
//        this.numeroCompra = numeroCompra;
//    }
//
//    public String getProveedor() {
//        return proveedor;
//    }
//
//    public void setProveedor(String proveedor) {
//        this.proveedor = proveedor;
//    }
//
//    public int getCantidadProductos() {
//        return cantidadProductos;
//    }
//
//    public void setCantidadProductos(int cantidadProductos) {
//        this.cantidadProductos = cantidadProductos;
//    }
//
//    public double getPrecioPorProducto() {
//        return precioPorProducto;
//    }
//
//    public void setPrecioPorProducto(double precioPorProducto) {
//        this.precioPorProducto = precioPorProducto;
//    }
//
//    public double getPrecioTotal() {
//        return precioTotal;
//    }
//
//    public void setPrecioTotal(double precioTotal) {
//        this.precioTotal = precioTotal;
//    }
//
//    public String toString() {
//        return "Número de Compra: " + numeroCompra + "\nProveedor: " + proveedor + "\nCantidad de Productos: " + cantidadProductos + "\nPrecio por Producto: " + precioPorProducto + "\nPrecio Total: " + precioTotal;
//    }
//}
//
//class CompraInternacional extends Compra {
//
//    private double impuestoImportacion;
//    private double precioTotalConImpuesto;
//
//    public CompraInternacional(String numeroCompra, String proveedor, int cantidadProductos, double precioPorProducto, double impuestoImportacion) {
//        super(numeroCompra, proveedor, cantidadProductos, precioPorProducto);
//        this.impuestoImportacion = impuestoImportacion;
//        this.precioTotalConImpuesto = getPrecioTotal() + (getPrecioTotal() * impuestoImportacion / 100);
//    }
//
//    public double getImpuestoImportacion() {
//        return impuestoImportacion;
//    }
//
//    public void setImpuestoImportacion(double impuestoImportacion) {
//        this.impuestoImportacion = impuestoImportacion;
//    }
//
//    public double getPrecioTotalConImpuesto() {
//        return precioTotalConImpuesto;
//    }
//
//    public void setPrecioTotalConImpuesto(double precioTotalConImpuesto) {
//        this.precioTotalConImpuesto = precioTotalConImpuesto;
//    }
//
//    public String toString() {
//        return super.toString() + "\nImpuesto de Importación: " + impuestoImportacion + "%" + "\nPrecio Total con Impuesto: " + precioTotalConImpuesto;
//    }
//
//    public static void main(String[] args) {
//        CompraInternacional compra1 = new CompraInternacional("C001", "Proveedor A", 100, 15.0, 15.0);
//        CompraInternacional compra2 = new CompraInternacional("C002", "Proveedor B", 50, 30.0, 15.0);
//        System.out.println(compra1.toString());
//        System.out.println(compra2.toString());
//    }
//}
