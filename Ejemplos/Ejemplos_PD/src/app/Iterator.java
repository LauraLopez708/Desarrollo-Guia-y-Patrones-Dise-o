//package app;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Iterador<T> {
//
//    boolean tieneSiguiente();
//
//    T siguiente();
//}
//
//class IteradorConcreto<T> implements Iterador<T> {
//
//    private List<T> lista;
//    private int posicion = 0;
//
//    public IteradorConcreto(List<T> lista) {
//        this.lista = lista;
//    }
//
//    public boolean tieneSiguiente() {
//        return posicion < lista.size();
//    }
//
//    public T siguiente() {
//        return lista.get(posicion++);
//    }
//}
//
//interface Agregado<T> {
//
//    Iterador<T> crearIterador();
//}
//
//class AgregadoConcreto<T> implements Agregado<T> {
//
//    private List<T> lista = new ArrayList<>();
//
//    public void agregar(T elemento) {
//        lista.add(elemento);
//    }
//
//    public Iterador<T> crearIterador() {
//        return new IteradorConcreto<>(lista);
//    }
//}
//
//public class Iterator {
//
//    public static void main(String[] args) {
//        AgregadoConcreto<String> agregado = new AgregadoConcreto<>();
//        agregado.agregar("Elemento 1");
//        agregado.agregar("Elemento 2");
//        agregado.agregar("Elemento 3");
//
//        Iterador<String> iterador = agregado.crearIterador();
//        while (iterador.tieneSiguiente()) {
//            System.out.println(iterador.siguiente());
//        }
//    }
//}
