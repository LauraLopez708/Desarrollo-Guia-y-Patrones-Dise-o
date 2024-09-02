package com.mycompany.libro;

public class ProductoInventario {
     private String codigo;
    private String producto;
    private int stock;
    private double precioPorUnidad;
    private double valorTotalEnStock;

    public ProductoInventario(String codigoProducto, String nombreProducto, int cantidadEnStock, double precioPorUnidad) {
        this.codigo = codigoProducto;
        this.producto = nombreProducto;
        this.stock = cantidadEnStock;
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnStock = calcularValorTotalEnStock();
    }

    private double calcularValorTotalEnStock() {
        return stock * precioPorUnidad;
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

    public int getCantidadEnStock() {
        return stock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.stock = cantidadEnStock;
        this.valorTotalEnStock = calcularValorTotalEnStock();
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnStock = calcularValorTotalEnStock();
    }

    public double getValorTotalEnStock() {
        return valorTotalEnStock;
    }

    @Override
    public String toString() {
        return "ProductoInventario [Código del Producto: " + codigo + ", Nombre del Producto: " + producto + 
               ", Cantidad en Stock: " + stock + ", Precio por Unidad: " + precioPorUnidad + 
               ", Valor Total en Stock: " + valorTotalEnStock + "]";
    }

    public static void main(String[] args) {
        ProductoInventario producto1 = new ProductoInventario("To11", "Tornillos", 500, 0.10);
        ProductoInventario producto2 = new ProductoInventario("Pu12", "Puntillas", 1000, 0.05);
        ProductoInventario producto3 = new ProductoInventario("Ma13", "Martillos", 150, 15.00);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}
