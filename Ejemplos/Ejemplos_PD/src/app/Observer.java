///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package app;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Observador {
//
//    void actualizar(String mensaje);
//}
//
//class ObservadorConcreto implements Observador {
//
//    private String nombre;
//
//    public ObservadorConcreto(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void actualizar(String mensaje) {
//        System.out.println(nombre + " recibió el mensaje: " + mensaje);
//    }
//}
//
//interface Sujeto {
//
//    void agregarObservador(Observador observador);
//
//    void eliminarObservador(Observador observador);
//
//    void notificar(String mensaje);
//}
//
//class SujetoConcreto implements Sujeto {
//
//    private List<Observador> observadores = new ArrayList<>();
//    private String estado;
//
//    public void agregarObservador(Observador observador) {
//        observadores.add(observador);
//    }
//
//    public void eliminarObservador(Observador observador) {
//        observadores.remove(observador);
//    }
//
//    public void notificar(String mensaje) {
//        for (Observador observador : observadores) {
//            observador.actualizar(mensaje);
//        }
//    }
//
//    public void establecerEstado(String estado) {
//        this.estado = estado;
//        notificar("Estado cambiado a: " + estado);
//    }
//}
//
//public class Observer {
//
//    public static void main(String[] args) {
//        SujetoConcreto sujeto = new SujetoConcreto();
//
//        Observador observador1 = new ObservadorConcreto("Observador 1");
//        Observador observador2 = new ObservadorConcreto("Observador 2");
//
//        sujeto.agregarObservador(observador1);
//        sujeto.agregarObservador(observador2);
//
//        sujeto.establecerEstado("Activo");
//    }
//}
