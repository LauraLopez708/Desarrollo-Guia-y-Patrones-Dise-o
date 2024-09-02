//package app;
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
//}
//
//class Gerente extends Empleado {
//    private double bonificacion;
//
//    public Gerente(String nombre, double salarioBase, double bonificacion) {
//        super(nombre, salarioBase);
//        this.bonificacion = bonificacion;
//    }
//
//    public double getBonificacion() {
//        return bonificacion;
//    }
//
//    public void setBonificacion(double bonificacion) {
//        this.bonificacion = bonificacion;
//    }
//
//    public double getSalarioTotal() {
//        return getSalarioBase() + bonificacion;
//    }
//
//    public String toString() {
//        return "Nombre: " + getNombre() + "\nSalario Base: " + getSalarioBase() + "\nBonificación: " + bonificacion + "\nSalario Total: " + getSalarioTotal();
//    }
//
//    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Juan", 50000, 10000);
//        Gerente gerente2 = new Gerente("Ana", 60000, 12000);
//        System.out.println(gerente1.toString());
//        System.out.println(gerente2.toString());
//    }
//}
