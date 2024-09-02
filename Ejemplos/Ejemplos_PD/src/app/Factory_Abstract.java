//package app;
//
//interface ProductoA {
//    void usar();
//}
//
//interface ProductoB {
//    void usar();
//}
//
//class ProductoA1 implements ProductoA {
//    public void usar() {
//        System.out.println("Usando ProductoA1");
//    }
//}
//
//class ProductoA2 implements ProductoA {
//    public void usar() {
//        System.out.println("Usando ProductoA2");
//    }
//}
//
//class ProductoB1 implements ProductoB {
//    public void usar() {
//        System.out.println("Usando ProductoB1");
//    }
//}
//
//class ProductoB2 implements ProductoB {
//    public void usar() {
//        System.out.println("Usando ProductoB2");
//    }
//}
//
//interface FabricaAbstracta {
//    ProductoA crearProductoA();
//    ProductoB crearProductoB();
//}
//
//class FabricaConcreta1 implements FabricaAbstracta {
//    public ProductoA crearProductoA() {
//        return new ProductoA1();
//    }
//
//    public ProductoB crearProductoB() {
//        return new ProductoB1();
//    }
//}
//
//class FabricaConcreta2 implements FabricaAbstracta {
//    public ProductoA crearProductoA() {
//        return new ProductoA2();
//    }
//
//    public ProductoB crearProductoB() {
//        return new ProductoB2();
//    }
//}
//
//public class Factory_Abstract {
//    public static void main(String[] args) {
//        FabricaAbstracta fabrica1 = new FabricaConcreta1();
//        ProductoA productoA1 = fabrica1.crearProductoA();
//        ProductoB productoB1 = fabrica1.crearProductoB();
//        productoA1.usar();
//        productoB1.usar();
//
//        FabricaAbstracta fabrica2 = new FabricaConcreta2();
//        ProductoA productoA2 = fabrica2.crearProductoA();
//        ProductoB productoB2 = fabrica2.crearProductoB();
//        productoA2.usar();
//        productoB2.usar();
//    }
//}
