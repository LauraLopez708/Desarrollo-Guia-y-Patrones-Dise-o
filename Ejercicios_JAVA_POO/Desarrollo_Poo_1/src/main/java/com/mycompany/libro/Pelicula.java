package com.mycompany.libro;

public class Pelicula {

    private String titulo;
    private String director;
    private int anio;
    private String genero;

    public Pelicula(String titulo, String director, int anio, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Película{"
                + "título='" + titulo + '\''
                + ", director='" + director + '\''
                + ", año=" + anio
                + ", género='" + genero + '\''
                + '}';
    }

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción");
        Pelicula pelicula2 = new Pelicula("The Godfather", "Francis Ford Coppola", 1972, "Crimen");
        Pelicula pelicula3 = new Pelicula("Parasite", "Bong Joon-ho", 2019, "Thriller");

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
    }
}
