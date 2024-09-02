//package app;
//
//abstract class MetodoPlantilla {
//
//    public final void ejecutar() {
//        paso1();
//        paso2();
//        paso3();
//    }
//
//    protected abstract void paso1();
//
//    protected abstract void paso2();
//
//    protected abstract void paso3();
//}
//
//class ImplementacionConcretaA extends MetodoPlantilla {
//
//    protected void paso1() {
//        System.out.println("ImplementacionConcretaA: paso1");
//    }
//
//    protected void paso2() {
//        System.out.println("ImplementacionConcretaA: paso2");
//    }
//
//    protected void paso3() {
//        System.out.println("ImplementacionConcretaA: paso3");
//    }
//}
//
//class ImplementacionConcretaB extends MetodoPlantilla {
//
//    protected void paso1() {
//        System.out.println("ImplementacionConcretaB: paso1");
//    }
//
//    protected void paso2() {
//        System.out.println("ImplementacionConcretaB: paso2");
//    }
//
//    protected void paso3() {
//        System.out.println("ImplementacionConcretaB: paso3");
//    }
//}
//
//public class TemplateMethod {
//
//    public static void main(String[] args) {
//        MetodoPlantilla instanciaA = new ImplementacionConcretaA();
//        instanciaA.ejecutar();
//
//        MetodoPlantilla instanciaB = new ImplementacionConcretaB();
//        instanciaB.ejecutar();
//    }
//}
