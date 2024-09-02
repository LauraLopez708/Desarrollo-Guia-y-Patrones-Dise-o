package com.mycompany.libro;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String dirección;

    public Persona(String nombre, String apellido, int edad, String dirección) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", "Martinez", 30, "Calle 123");
        Persona p2 = new Persona("María", "López", 25, "Avenida 456");
        Persona p3 = new Persona("Pedro", "Torres", 35, "Carrera 789");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}
