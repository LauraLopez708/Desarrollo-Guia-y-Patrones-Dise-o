//package app;
//
// interface Estrategia {
//
//    void ejecutar();
//}
//
// class EstrategiaConcretaA implements Estrategia {
//
//    public void ejecutar() {
//        System.out.println("Estrategia A");
//    }
//}
//
// class EstrategiaConcretaB implements Estrategia {
//
//    public void ejecutar() {
//        System.out.println("Estrategia B");
//    }
//}
//
// class Contexto {
//
//    private Estrategia estrategia;
//
//    public void setEstrategia(Estrategia estrategia) {
//        this.estrategia = estrategia;
//    }
//
//    public void ejecutarEstrategia() {
//        estrategia.ejecutar();
//    }
//}
//
//public class Strategy {
//
//    public static void main(String[] args) {
//        Contexto contexto = new Contexto();
//
//        contexto.setEstrategia(new EstrategiaConcretaA());
//        contexto.ejecutarEstrategia();
//
//        contexto.setEstrategia(new EstrategiaConcretaB());
//        contexto.ejecutarEstrategia();
//    }
//}
