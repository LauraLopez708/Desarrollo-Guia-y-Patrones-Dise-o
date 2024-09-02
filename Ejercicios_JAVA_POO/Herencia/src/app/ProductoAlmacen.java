//package app;
//
//class ProductoAlmacen {
//
//    public String codigoProducto;
//    public String nombreProducto;
//    public int cantidadEnAlmacen;
//    public double precioPorUnidad;
//    public double valorTotalEnAlmacen;
//
//    public ProductoAlmacen(String codigoProducto, String nombreProducto, int cantidadEnAlmacen, double precioPorUnidad) {
//        this.codigoProducto = codigoProducto;
//        this.nombreProducto = nombreProducto;
//        this.cantidadEnAlmacen = cantidadEnAlmacen;
//        this.precioPorUnidad = precioPorUnidad;
//        this.valorTotalEnAlmacen = cantidadEnAlmacen * precioPorUnidad;
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
//    public int getCantidadEnAlmacen() {
//        return cantidadEnAlmacen;
//    }
//
//    public void setCantidadEnAlmacen(int cantidadEnAlmacen) {
//        this.cantidadEnAlmacen = cantidadEnAlmacen;
//    }
//
//    public double getPrecioPorUnidad() {
//        return precioPorUnidad;
//    }
//
//    public void setPrecioPorUnidad(double precioPorUnidad) {
//        this.precioPorUnidad = precioPorUnidad;
//    }
//
//    public double getValorTotalEnAlmacen() {
//        return valorTotalEnAlmacen;
//    }
//
//    public void setValorTotalEnAlmacen(double valorTotalEnAlmacen) {
//        this.valorTotalEnAlmacen = valorTotalEnAlmacen;
//    }
//
//    public String toString() {
//        return "Código del Producto: " + codigoProducto + "\nNombre del Producto: " + nombreProducto + "\nCantidad en Almacén: " + cantidadEnAlmacen + "\nPrecio por Unidad: " + precioPorUnidad + "\nValor Total en Almacén: " + valorTotalEnAlmacen;
//    }
//}
//
//class ProductoFragil extends ProductoAlmacen {
//
//    private String nivelFragilidad;
//    private double costoAdicionalPorManejo;
//
//    public ProductoFragil(String codigoProducto, String nombreProducto, int cantidadEnAlmacen, double precioPorUnidad, String nivelFragilidad) {
//        super(codigoProducto, nombreProducto, cantidadEnAlmacen, precioPorUnidad);
//        this.nivelFragilidad = nivelFragilidad;
//        switch (nivelFragilidad.toLowerCase()) {
//            case "alto":
//                this.costoAdicionalPorManejo = getValorTotalEnAlmacen() * 0.10;
//                break;
//            case "medio":
//            case "bajo":
//            default:
//                this.costoAdicionalPorManejo = 0;
//                break;
//        }
//    }
//
//    public String getNivelFragilidad() {
//        return nivelFragilidad;
//    }
//
//    public void setNivelFragilidad(String nivelFragilidad) {
//        this.nivelFragilidad = nivelFragilidad;
//    }
//
//    public double getCostoAdicionalPorManejo() {
//        return costoAdicionalPorManejo;
//    }
//
//    public void setCostoAdicionalPorManejo(double costoAdicionalPorManejo) {
//        this.costoAdicionalPorManejo = costoAdicionalPorManejo;
//    }
//
//    public String toString() {
//        return super.toString() + "\nNivel de Fragilidad: " + nivelFragilidad + "\nCosto Adicional por Manejo: " + costoAdicionalPorManejo;
//    }
//
//    public static void main(String[] args) {
//        ProductoFragil producto1 = new ProductoFragil("P001", "Vaso de Cristal", 100, 5.0, "alto");
//        ProductoFragil producto2 = new ProductoFragil("P002", "Plato de Cerámica", 200, 3.0, "medio");
//        System.out.println(producto1.toString());
//        System.out.println(producto2.toString());
//    }
//}
