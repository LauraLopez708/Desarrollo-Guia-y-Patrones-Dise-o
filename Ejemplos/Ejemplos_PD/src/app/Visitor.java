//package app;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Visitante {
//
//    void visitar(ElementoConcretoA elemento);
//
//    void visitar(ElementoConcretoB elemento);
//}
//
//class VisitanteConcreto implements Visitante {
//
//    public void visitar(ElementoConcretoA elemento) {
//        System.out.println("Visitando ElementoConcretoA");
//    }
//
//    public void visitar(ElementoConcretoB elemento) {
//        System.out.println("Visitando ElementoConcretoB");
//    }
//}
//
//interface Elemento {
//
//    void aceptar(Visitante visitante);
//}
//
//class ElementoConcretoA implements Elemento {
//
//    public void aceptar(Visitante visitante) {
//        visitante.visitar(this);
//    }
//}
//
//class ElementoConcretoB implements Elemento {
//
//    public void aceptar(Visitante visitante) {
//        visitante.visitar(this);
//    }
//}
//
//class EstructuraObjetos {
//
//    private List<Elemento> elementos = new ArrayList<>();
//
//    public void agregar(Elemento elemento) {
//        elementos.add(elemento);
//    }
//
//    public void aceptar(Visitante visitante) {
//        for (Elemento elemento : elementos) {
//            elemento.aceptar(visitante);
//        }
//    }
//}
//
//public class Visitor {
//
//    public static void main(String[] args) {
//        EstructuraObjetos estructura = new EstructuraObjetos();
//        estructura.agregar(new ElementoConcretoA());
//        estructura.agregar(new ElementoConcretoB());
//
//        Visitante visitante = new VisitanteConcreto();
//        estructura.aceptar(visitante);
//    }
//}
