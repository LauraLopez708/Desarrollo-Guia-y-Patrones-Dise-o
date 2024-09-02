package com.mycompany.libro;

public class ProductoAlmacen {
    
    private String codigo;
    private String producto;
    private int cantidad;
    private double precio;
    private double valorTotalEnAlmacen;

    public ProductoAlmacen(String codigoProducto, String nombreProducto, int cantidad, double precio) {
        this.codigo = codigoProducto;
        this.producto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    private double calcularValorTotalEnAlmacen() {
        return cantidad * precio;
    }

    public String getCodigoProducto() {
        return codigo;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigo = codigoProducto;
    }

    public String getNombreProducto() {
        return producto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.producto = nombreProducto;
    }

    public int getCantidadEnAlmacen() {
        return cantidad;
    }

    public void setCantidadEnAlmacen(int cantidadEnAlmacen) {
        this.cantidad = cantidadEnAlmacen;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    public double getPrecioPorUnidad() {
        return precio;
    }

    public void setPrecioPorUnidad(double precio) {
        this.precio = precio;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    public double getValorTotalEnAlmacen() {
        return valorTotalEnAlmacen;
    }

    @Override
    public String toString() {
        return "ProductoAlmacen [Código del Producto: " + codigo+ ", Nombre del Producto: " + producto + 
               ", Cantidad en Almacén: " + cantidad + ", Precio por Unidad: " + precio + 
               ", Valor Total en Almacén: " + valorTotalEnAlmacen + "]";
    }

    public static void main(String[] args) {
        ProductoAlmacen producto1 = new ProductoAlmacen("Tec0789", "Teclado", 50, 25.00);
        ProductoAlmacen producto2 = new ProductoAlmacen("Mo502", "Mouse", 100, 15.00);
        ProductoAlmacen producto3 = new ProductoAlmacen("Pa473", "Monitor", 30, 200.00);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
    
}
