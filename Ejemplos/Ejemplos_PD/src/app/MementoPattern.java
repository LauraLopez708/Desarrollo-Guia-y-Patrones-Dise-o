/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.List;

class Memento {
    private final String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}

class Originador {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Memento guardarEstadoEnMemento() {
        return new Memento(estado);
    }

    public void obtenerEstadoDeMemento(Memento memento) {
        estado = memento.getEstado();
    }
}

class Cuidador {
    private List<Memento> listaMementos = new ArrayList<>();

    public void agregar(Memento estado) {
        listaMementos.add(estado);
    }

    public Memento obtener(int indice) {
        return listaMementos.get(indice);
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        Originador originador = new Originador();
        Cuidador cuidador = new Cuidador();

        originador.setEstado("Estado 1");
        originador.setEstado("Estado 2");
        cuidador.agregar(originador.guardarEstadoEnMemento());

        originador.setEstado("Estado 3");
        cuidador.agregar(originador.guardarEstadoEnMemento());

        originador.setEstado("Estado 4");
        System.out.println("Estado actual: " + originador.getEstado());

        originador.obtenerEstadoDeMemento(cuidador.obtener(0));
        System.out.println("Primer estado guardado: " + originador.getEstado());
        originador.obtenerEstadoDeMemento(cuidador.obtener(1));
        System.out.println("Segundo estado guardado: " + originador.getEstado());
    }
}

