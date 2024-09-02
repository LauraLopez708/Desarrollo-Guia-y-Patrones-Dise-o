//package app;
//
//interface Subject {
//
//    void solicitud();
//}
//
//class RealSubject implements Subject {
//
//    public void solicitud() {
//        System.out.println("RealSubject: manejando la solicitud.");
//    }
//}
//
//class Proxy implements Subject {
//
//    private RealSubject realSubject;
//
//    public Proxy(RealSubject realSubject) {
//        this.realSubject = realSubject;
//    }
//
//    public void solicitud() {
//        if (comprobarAcceso()) {
//            realSubject.solicitud();
//            registrarAcceso();
//        }
//    }
//
//    private boolean comprobarAcceso() {
//        System.out.println("Proxy: Comprobando acceso antes de disparar la solicitud real.");
//        return true;
//    }
//
//    private void registrarAcceso() {
//        System.out.println("Proxy: Registrando el tiempo de la solicitud.");
//    }
//}
//
//public class PatronProxy {
//
//    public static void main(String[] args) {
//        RealSubject realSubject = new RealSubject();
//        Proxy proxy = new Proxy(realSubject);
//        proxy.solicitud();
//    }
//}
