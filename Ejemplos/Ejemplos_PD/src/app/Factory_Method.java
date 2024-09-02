//package app;
//
//abstract class Producto {
//    abstract void usar();
//}
//
//class ProductoConcretoA extends Producto {
//    void usar() {
//        System.out.println("Usando ProductoConcretoA");
//    }
//}
//
//class ProductoConcretoB extends Producto {
//    void usar() {
//        System.out.println("Usando ProductoConcretoB");
//    }
//}
//
//abstract class Creador {
//    abstract Producto factoryMethod();
//
//    void usarProducto() {
//        Producto producto = factoryMethod();
//        producto.usar();
//    }
//}
//
//class CreadorConcretoA extends Creador {
//    Producto factoryMethod() {
//        return new ProductoConcretoA();
//    }
//}
//
//class CreadorConcretoB extends Creador {
//    Producto factoryMethod() {
//        return new ProductoConcretoB();
//    }
//}
//
//public class Factory_Method {
//    public static void main(String[] args) {
//        Creador creador = new CreadorConcretoA();
//        creador.usarProducto();
//
//        creador = new CreadorConcretoB();
//        creador.usarProducto();
//    }
//}
