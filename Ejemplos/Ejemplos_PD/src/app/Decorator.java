//package app;
//
//interface Componente {
//    void operacion();
//}
//
//class ComponenteConcreto implements Componente {
//    public void operacion() {
//        System.out.println("ComponenteConcreto operacion");
//    }
//}
//
//abstract class Decorador implements Componente {
//    protected Componente componente;
//
//    public Decorador(Componente componente) {
//        this.componente = componente;
//    }
//
//    public void operacion() {
//        componente.operacion();
//    }
//}
//
//class DecoradorConcretoA extends Decorador {
//    public DecoradorConcretoA(Componente componente) {
//        super(componente);
//    }
//
//    public void operacion() {
//        super.operacion();
//        metodoAdicionalA();
//    }
//
//    private void metodoAdicionalA() {
//        System.out.println("Metodo adicional A");
//    }
//}
//
//class DecoradorConcretoB extends Decorador {
//    public DecoradorConcretoB(Componente componente) {
//        super(componente);
//    }
//
//    public void operacion() {
//        super.operacion();
//        metodoAdicionalB();
//    }
//
//    private void metodoAdicionalB() {
//        System.out.println("Metodo adicional B");
//    }
//}
//
//public class Decorator {
//    public static void main(String[] args) {
//        Componente componente = new ComponenteConcreto();
//        Componente decoradorA = new DecoradorConcretoA(componente);
//        Componente decoradorB = new DecoradorConcretoB(decoradorA);
//        decoradorB.operacion();
//    }
//}
