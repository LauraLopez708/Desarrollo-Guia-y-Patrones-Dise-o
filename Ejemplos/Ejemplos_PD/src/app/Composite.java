//package app;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Componente {
//    void operacion();
//}
//
//class Hoja implements Componente {
//    private String nombre;
//
//    public Hoja(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void operacion() {
//        System.out.println("Hoja " + nombre);
//    }
//}
//
//class Compuesto implements Componente {
//    private List<Componente> hijos = new ArrayList<>();
//
//    public void agregar(Componente componente) {
//        hijos.add(componente);
//    }
//
//    public void eliminar(Componente componente) {
//        hijos.remove(componente);
//    }
//
//    public void operacion() {
//        for (Componente hijo : hijos) {
//            hijo.operacion();
//        }
//    }
//}
//
//public class Composite {
//    public static void main(String[] args) {
//        Hoja hoja1 = new Hoja("1");
//        Hoja hoja2 = new Hoja("2");
//        Compuesto compuesto = new Compuesto();
//        compuesto.agregar(hoja1);
//        compuesto.agregar(hoja2);
//        compuesto.operacion();
//    }
//}
