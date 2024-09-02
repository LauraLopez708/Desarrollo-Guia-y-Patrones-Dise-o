// package app;
//
//class Empleado {
//    public String nombre;
//    public double salarioBase;
//
//    public Empleado(String nombre, double salarioBase) {
//        this.nombre = nombre;
//        this.salarioBase = salarioBase;
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
//    public double getSalarioBase() {
//        return salarioBase;
//    }
//
//    public void setSalarioBase(double salarioBase) {
//        this.salarioBase = salarioBase;
//    }
//
//    public String toString() {
//        return "Nombre: " + nombre + "\nSalario Base: " + salarioBase;
//    }
//}
//
//class Vendedor extends Empleado {
//    private double comisionesPorVentas;
//    private double salarioTotal;
//
//    public Vendedor(String nombre, double salarioBase, double comisionesPorVentas) {
//        super(nombre, salarioBase);
//        this.comisionesPorVentas = comisionesPorVentas;
//        this.salarioTotal = salarioBase + comisionesPorVentas;
//    }
//
//    public double getComisionesPorVentas() {
//        return comisionesPorVentas;
//    }
//
//    public void setComisionesPorVentas(double comisionesPorVentas) {
//        this.comisionesPorVentas = comisionesPorVentas;
//        this.salarioTotal = getSalarioBase() + comisionesPorVentas;
//    }
//
//    public double getSalarioTotal() {
//        return salarioTotal;
//    }
//
//    public void setSalarioTotal(double salarioTotal) {
//        this.salarioTotal = salarioTotal;
//    }
//
//    public String toString() {
//        return super.toString() + "\nComisiones por Ventas: " + comisionesPorVentas + "\nSalario Total: " + salarioTotal;
//    }
//
//    public static void main(String[] args) {
//        Vendedor vendedor1 = new Vendedor("Juan Pérez", 2000.0, 500.0);
//        Vendedor vendedor2 = new Vendedor("Ana Gómez", 2500.0, 750.0);
//        System.out.println(vendedor1.toString());
//        System.out.println(vendedor2.toString());
//    }
//}
