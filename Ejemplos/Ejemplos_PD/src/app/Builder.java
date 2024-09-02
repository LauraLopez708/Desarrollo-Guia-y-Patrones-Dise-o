//package app;
//
//class Producto {
//    private String parteA;
//    private String parteB;
//
//    public void setParteA(String parteA) {
//        this.parteA = parteA;
//    }
//
//    public void setParteB(String parteB) {
//        this.parteB = parteB;
//    }
//
//    public void mostrar() {
//        System.out.println("ParteA: " + parteA + ", ParteB: " + parteB);
//    }
//}
//
//abstract class Constructor {
//    protected Producto producto;
//
//    public void crearNuevoProducto() {
//        producto = new Producto();
//    }
//
//    public Producto getProducto() {
//        return producto;
//    }
//
//    public abstract void construirParteA();
//    public abstract void construirParteB();
//}
//
//class ConstructorConcreto extends Constructor {
//    public void construirParteA() {
//        producto.setParteA("ParteA");
//    }
//
//    public void construirParteB() {
//        producto.setParteB("ParteB");
//    }
//}
//
//class Director {
//    private Constructor constructor;
//
//    public void setConstructor(Constructor constructor) {
//        this.constructor = constructor;
//    }
//
//    public Producto getProducto() {
//        return constructor.getProducto();
//    }
//
//    public void construirProducto() {
//        constructor.crearNuevoProducto();
//        constructor.construirParteA();
//        constructor.construirParteB();
//    }
//}
//
//public class Builder {
//    public static void main(String[] args) {
//        Director director = new Director();
//        Constructor constructor = new ConstructorConcreto();
//        director.setConstructor(constructor);
//        director.construirProducto();
//        Producto producto = director.getProducto();
//        producto.mostrar();
//    }
//}
