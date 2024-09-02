//package app;
//
//class Cliente {
//    public String nombre;
//    public String direccion;
//    public String telefono;
//
//    public Cliente(String nombre, String direccion, String telefono) {
//        this.nombre = nombre;
//        this.direccion = direccion;
//        this.telefono = telefono;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getDireccion() {
//        return direccion;
//    }
//
//    public void setDireccion(String direccion) {
//        this.direccion = direccion;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//}
//
//class ClienteFrecuente extends Cliente {
//    private double descuento;
//    private int numeroCompras;
//
//    public ClienteFrecuente(String nombre, String direccion, String telefono, double descuento, int numeroCompras) {
//        super(nombre, direccion, telefono);
//        this.descuento = descuento;
//        this.numeroCompras = numeroCompras;
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
//    public int getNumeroCompras() {
//        return numeroCompras;
//    }
//
//    public void setNumeroCompras(int numeroCompras) {
//        this.numeroCompras = numeroCompras;
//    }
//
//    public String toString() {
//        return "Nombre: " + getNombre() + "\nDirección: " + getDireccion() + "\nTeléfono: " + getTelefono() + "\nDescuento: " + descuento + "\nNúmero de Compras: " + numeroCompras;
//    }
//
//    public static void main(String[] args) {
//        ClienteFrecuente cliente1 = new ClienteFrecuente("Carlos", "Calle 123", "987654321", 0.1, 5);
//        ClienteFrecuente cliente2 = new ClienteFrecuente("Maria", "Avenida 456", "123456789", 0.15, 10);
//        System.out.println(cliente1.toString());
//        System.out.println(cliente2.toString());
//    }
//}
