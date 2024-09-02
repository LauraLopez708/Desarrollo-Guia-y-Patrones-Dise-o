//package app;
//
//interface Estado {
//
//    void manejar(Contexto contexto);
//}
//
//class EstadoConcretoA implements Estado {
//
//    public void manejar(Contexto contexto) {
//        System.out.println("Manejando Estado A");
//        contexto.setEstado(new EstadoConcretoB());
//    }
//}
//
//class EstadoConcretoB implements Estado {
//
//    public void manejar(Contexto contexto) {
//        System.out.println("Manejando Estado B");
//        contexto.setEstado(new EstadoConcretoA());
//    }
//}
//
//class Contexto {
//
//    private Estado estado;
//
//    public Contexto() {
//        estado = new EstadoConcretoA();
//    }
//
//    public void setEstado(Estado estado) {
//        this.estado = estado;
//    }
//
//    public void manejar() {
//        estado.manejar(this);
//    }
//}
//
//public class State {
//
//    public static void main(String[] args) {
//        Contexto contexto = new Contexto();
//
//        contexto.manejar();
//        contexto.manejar();
//        contexto.manejar();
//    }
//}
