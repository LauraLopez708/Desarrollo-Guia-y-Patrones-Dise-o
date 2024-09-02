package com.mycompany.libro;

public class Mascota {
  
   private String nombre;
    private String tipo;
    private int edad;
    private String dueño;

    public Mascota(String nombre, String tipo, int edad, String dueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", edad=" + edad +
                ", dueño='" + dueño + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Betoben", "Perro", 3, "José Rojas");
        Mascota m2 = new Mascota("Bigotes", "Gato", 2, "Mariana Perez");
        Mascota m3 = new Mascota("Nemo", "Pez", 1, "Carolina Herrera");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }  
}
