//package app;
//
//interface Mediador {
//
//    void enviar(String mensaje, Colega colega);
//}
//
//abstract class Colega {
//
//    protected Mediador mediador;
//
//    public Colega(Mediador mediador) {
//        this.mediador = mediador;
//    }
//
//    public abstract void recibir(String mensaje);
//}
//
//class ColegaConcreto1 extends Colega {
//
//    public ColegaConcreto1(Mediador mediador) {
//        super(mediador);
//    }
//
//    public void enviar(String mensaje) {
//        mediador.enviar(mensaje, this);
//    }
//
//    public void recibir(String mensaje) {
//        System.out.println("ColegaConcreto1 recibió: " + mensaje);
//    }
//}
//
//class ColegaConcreto2 extends Colega {
//
//    public ColegaConcreto2(Mediador mediador) {
//        super(mediador);
//    }
//
//    public void enviar(String mensaje) {
//        mediador.enviar(mensaje, this);
//    }
//
//    public void recibir(String mensaje) {
//        System.out.println("ColegaConcreto2 recibió: " + mensaje);
//    }
//}
//
//class MediadorConcreto implements Mediador {
//
//    private ColegaConcreto1 colega1;
//    private ColegaConcreto2 colega2;
//
//    public void setColega1(ColegaConcreto1 colega) {
//        this.colega1 = colega;
//    }
//
//    public void setColega2(ColegaConcreto2 colega) {
//        this.colega2 = colega;
//    }
//
//    public void enviar(String mensaje, Colega colega) {
//        if (colega == colega1) {
//            colega2.recibir(mensaje);
//        } else {
//            colega1.recibir(mensaje);
//        }
//    }
//}
//
//public class Mediator {
//
//    public static void main(String[] args) {
//        MediadorConcreto mediador = new MediadorConcreto();
//
//        ColegaConcreto1 colega1 = new ColegaConcreto1(mediador);
//        ColegaConcreto2 colega2 = new ColegaConcreto2(mediador);
//
//        mediador.setColega1(colega1);
//        mediador.setColega2(colega2);
//
//        colega1.enviar("Hola, colega2");
//        colega2.enviar("Hola, colega1");
//    }
//}
