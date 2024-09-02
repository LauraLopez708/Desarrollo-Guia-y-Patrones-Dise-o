package com.mycompany.libro;

public class Hotel {
    
    private String nombre;
    private String dirección;
    private int habitaciones;
    private int estrellas;

    public Hotel(String nombre, String dirección, int numHabitaciones, int estrellas) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.habitaciones = numHabitaciones;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int numHabitaciones) {
        this.habitaciones = numHabitaciones;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", dirección='" + dirección + '\'' +
                ", número de habitaciones=" + habitaciones +
                ", estrellas=" + estrellas +
                '}';
    }

    public static void main(String[] args) {
        Hotel h1 = new Hotel("Hotel Paraíso", "Calle 123", 100, 5);
        Hotel h2 = new Hotel("Hotel Oasis", "Avenida 456", 150, 4);
        Hotel h3 = new Hotel("Hotel Tranquilo", "Boulevard 789", 200, 3);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
