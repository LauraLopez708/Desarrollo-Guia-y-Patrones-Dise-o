//package app;
//
//class Subsistema1 {
//
//    public void operacion1() {
//        System.out.println("Operacion 1 del Subsistema 1");
//    }
//}
//
//class Subsistema2 {
//
//    public void operacion2() {
//        System.out.println("Operacion 2 del Subsistema 2");
//    }
//}
//
//class Subsistema3 {
//
//    public void operacion3() {
//        System.out.println("Operacion 3 del Subsistema 3");
//    }
//}
//
//class Fachada {
//
//    private Subsistema1 subsistema1;
//    private Subsistema2 subsistema2;
//    private Subsistema3 subsistema3;
//
//    public Fachada() {
//        this.subsistema1 = new Subsistema1();
//        this.subsistema2 = new Subsistema2();
//        this.subsistema3 = new Subsistema3();
//    }
//
//    public void operacionFacade() {
//        subsistema1.operacion1();
//        subsistema2.operacion2();
//        subsistema3.operacion3();
//    }
//}
//
//public class Facade {
//
//    public static void main(String[] args) {
//        Fachada fachada = new Fachada();
//        fachada.operacionFacade();
//    }
//}
