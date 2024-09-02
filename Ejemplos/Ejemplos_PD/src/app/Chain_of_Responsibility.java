//package app;
//
//abstract class Manejador {
//    protected Manejador siguienteManejador;
//
//    public void setSiguienteManejador(Manejador manejador) {
//        this.siguienteManejador = manejador;
//    }
//
//    public abstract void manejarSolicitud(String solicitud);
//}
//
//class ManejadorConcreto1 extends Manejador {
//    public void manejarSolicitud(String solicitud) {
//        if (solicitud.equals("Tipo1")) {
//            System.out.println("ManejadorConcreto1 maneja la solicitud de tipo 1");
//        } else if (siguienteManejador != null) {
//            siguienteManejador.manejarSolicitud(solicitud);
//        }
//    }
//}
//
//
//class ManejadorConcreto2 extends Manejador {
//    public void manejarSolicitud(String solicitud) {
//        if (solicitud.equals("Tipo2")) {
//            System.out.println("ManejadorConcreto2 maneja la solicitud de tipo 2");
//        } else if (siguienteManejador != null) {
//            siguienteManejador.manejarSolicitud(solicitud);
//        }
//    }
//}
//
//public class Chain_of_Responsibility {
//    public static void main(String[] args) {
//        Manejador manejador1 = new ManejadorConcreto1();
//        Manejador manejador2 = new ManejadorConcreto2();
//
//        manejador1.setSiguienteManejador(manejador2);
//
//        manejador1.manejarSolicitud("Tipo1");
//        manejador1.manejarSolicitud("Tipo2");
//        manejador1.manejarSolicitud("Tipo3");
//    }
//}
