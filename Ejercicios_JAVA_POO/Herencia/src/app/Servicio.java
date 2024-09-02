//package app;
//
//class Servicio {
//    public String codigoServicio;
//    public String descripcion;
//    public double precioPorHora;
//    public int horasTrabajadas;
//    public double precioTotal;
//
//    public Servicio(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas) {
//        this.codigoServicio = codigoServicio;
//        this.descripcion = descripcion;
//        this.precioPorHora = precioPorHora;
//        this.horasTrabajadas = horasTrabajadas;
//        this.precioTotal = precioPorHora * horasTrabajadas;
//    }
//
//    public String getCodigoServicio() {
//        return codigoServicio;
//    }
//
//    public void setCodigoServicio(String codigoServicio) {
//        this.codigoServicio = codigoServicio;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public double getPrecioPorHora() {
//        return precioPorHora;
//    }
//
//    public void setPrecioPorHora(double precioPorHora) {
//        this.precioPorHora = precioPorHora;
//    }
//
//    public int getHorasTrabajadas() {
//        return horasTrabajadas;
//    }
//
//    public void setHorasTrabajadas(int horasTrabajadas) {
//        this.horasTrabajadas = horasTrabajadas;
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
//        return "Código de Servicio: " + codigoServicio + "\nDescripción: " + descripcion + "\nPrecio por Hora: " + precioPorHora + "\nHoras Trabajadas: " + horasTrabajadas + "\nPrecio Total: " + precioTotal;
//    }
//}
//
//class ServicioUrgente extends Servicio {
//    private double recargoUrgencia;
//    private double precioTotalConRecargo;
//
//    public ServicioUrgente(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas, double recargoUrgencia) {
//        super(codigoServicio, descripcion, precioPorHora, horasTrabajadas);
//        this.recargoUrgencia = recargoUrgencia;
//        this.precioTotalConRecargo = getPrecioTotal() + (getPrecioTotal() * recargoUrgencia / 100);
//    }
//
//    public double getRecargoUrgencia() {
//        return recargoUrgencia;
//    }
//
//    public void setRecargoUrgencia(double recargoUrgencia) {
//        this.recargoUrgencia = recargoUrgencia;
//    }
//
//    public double getPrecioTotalConRecargo() {
//        return precioTotalConRecargo;
//    }
//
//    public void setPrecioTotalConRecargo(double precioTotalConRecargo) {
//        this.precioTotalConRecargo = precioTotalConRecargo;
//    }
//
//    public String toString() {
//        return super.toString() + "\nRecargo por Urgencia: " + recargoUrgencia + "%" + "\nPrecio Total con Recargo: " + precioTotalConRecargo;
//    }
//
//    public static void main(String[] args) {
//        ServicioUrgente servicio1 = new ServicioUrgente("S001", "Reparación de emergencia", 50.0, 5, 25.0);
//        ServicioUrgente servicio2 = new ServicioUrgente("S002", "Mantenimiento urgente", 60.0, 3, 25.0);
//        System.out.println(servicio1.toString());
//        System.out.println(servicio2.toString());
//    }
//}
