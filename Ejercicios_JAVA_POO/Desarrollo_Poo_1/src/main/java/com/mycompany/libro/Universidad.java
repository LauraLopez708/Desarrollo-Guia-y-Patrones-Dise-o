package com.mycompany.libro;

public class Universidad {
    
    private String nombre;
    private String dirección;
    private int numEstudiantes;
    private int ranking;

    public Universidad(String nombre, String dirección, int numEstudiantes, int ranking) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.numEstudiantes = numEstudiantes;
        this.ranking = ranking;
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

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", dirección='" + dirección + '\'' +
                ", número de estudiantes=" + numEstudiantes +
                ", ranking=" + ranking +
                '}';
    }

    public static void main(String[] args) {
        Universidad u1 = new Universidad("Universidad Nacional", "Calle 123", 30000, 1);
        Universidad u2 = new Universidad("Universidad Privada", "Avenida 456", 20000, 2);
        Universidad u3 = new Universidad("Instituto Tecnológico", "Carrera 789", 15000, 3);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
