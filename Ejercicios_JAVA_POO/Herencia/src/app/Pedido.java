//package app;
//
//class Pedido {
//
//    public String numeroPedido;
//    public String cliente;
//    public int cantidadArticulos;
//    public double precioPorArticulo;
//    public double precioTotal;
//
//    public Pedido(String numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo) {
//        this.numeroPedido = numeroPedido;
//        this.cliente = cliente;
//        this.cantidadArticulos = cantidadArticulos;
//        this.precioPorArticulo = precioPorArticulo;
//        this.precioTotal = cantidadArticulos * precioPorArticulo;
//    }
//
//    public String getNumeroPedido() {
//        return numeroPedido;
//    }
//
//    public void setNumeroPedido(String numeroPedido) {
//        this.numeroPedido = numeroPedido;
//    }
//
//    public String getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(String cliente) {
//        this.cliente = cliente;
//    }
//
//    public int getCantidadArticulos() {
//        return cantidadArticulos;
//    }
//
//    public void setCantidadArticulos(int cantidadArticulos) {
//        this.cantidadArticulos = cantidadArticulos;
//    }
//
//    public double getPrecioPorArticulo() {
//        return precioPorArticulo;
//    }
//
//    public void setPrecioPorArticulo(double precioPorArticulo) {
//        this.precioPorArticulo = precioPorArticulo;
//    }
//
//    public double getPrecioTotal() {
//        return precioTotal;
//    }
//
//    public void setPrecioTotal(double precioTotal) {
//        this.precioTotal = precioTotal;
//    }
//}
//
//class PedidoExpress extends Pedido {
//
//    private double costoEnvio;
//    private int tiempoEntrega;
//    private double precioTotalConEnvio;
//
//    public PedidoExpress(String numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo, double costoEnvio, int tiempoEntrega) {
//        super(numeroPedido, cliente, cantidadArticulos, precioPorArticulo);
//        this.costoEnvio = costoEnvio;
//        this.tiempoEntrega = tiempoEntrega;
//        this.precioTotalConEnvio = getPrecioTotal() + costoEnvio;
//    }
//
//    public double getCostoEnvio() {
//        return costoEnvio;
//    }
//
//    public void setCostoEnvio(double costoEnvio) {
//        this.costoEnvio = costoEnvio;
//    }
//
//    public int getTiempoEntrega() {
//        return tiempoEntrega;
//    }
//
//    public void setTiempoEntrega(int tiempoEntrega) {
//        this.tiempoEntrega = tiempoEntrega;
//    }
//
//    public double getPrecioTotalConEnvio() {
//        return precioTotalConEnvio;
//    }
//
//    public void setPrecioTotalConEnvio(double precioTotalConEnvio) {
//        this.precioTotalConEnvio = precioTotalConEnvio;
//    }
//
//    public String toString() {
//        return "Número de Pedido: " + getNumeroPedido() + "\nCliente: " + getCliente() + "\nCantidad de Artículos: " + getCantidadArticulos() + "\nPrecio por Artículo: " + getPrecioPorArticulo() + "\nPrecio Total: " + getPrecioTotal() + "\nCosto de Envío: " + costoEnvio + "\nTiempo de Entrega: " + tiempoEntrega + "\nPrecio Total con Envío: " + precioTotalConEnvio;
//    }
//
//    public static void main(String[] args) {
//        PedidoExpress pedido1 = new PedidoExpress("P001", "Cliente A", 10, 20.0, 15.0, 2);
//        PedidoExpress pedido2 = new PedidoExpress("P002", "Cliente B", 5, 50.0, 20.0, 1);
//        System.out.println(pedido1.toString());
//        System.out.println(pedido2.toString());
//    }
//}
