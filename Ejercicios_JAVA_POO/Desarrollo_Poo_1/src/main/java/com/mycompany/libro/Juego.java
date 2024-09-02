package com.mycompany.libro;

public class Juego {

    private String titulo;
    private String plataforma;
    private int año;
    private String género;

    public Juego(String titulo, String plataforma, int año, String género) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.año = año;
        this.género = género;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAño() {
        return año;
    }

    public void setAñoLanzamiento(int año) {
        this.año = año;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    @Override
    public String toString() {
        return "Juego{"
                + "título='" + titulo + '\''
                + ", plataforma='" + plataforma + '\''
                + ", año de lanzamiento=" + año
                + ", género='" + género + '\''
                + '}';
    }

    public static void main(String[] args) {
        Juego j1 = new Juego("The Legend of Zelda", "Nintendo Switch", 2017, "Aventura");
        Juego j2 = new Juego("God of War", "PlayStation 4", 2018, "Acción");
        Juego j3 = new Juego("Halo", "Xbox", 2001, "Disparos");

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
    }
}
