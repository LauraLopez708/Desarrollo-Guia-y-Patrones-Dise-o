
package com.mycompany.libro;

public class Proveedor {
    
    private String nombre;
    private String empresa;
    private String telefono;
    private String email;

    public Proveedor(String nombre, String empresa, String telefono, String email) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Proveedor p1 = new Proveedor("Luis Martínez", "ABC S.A.", "123456789", "luis@abc.com");
        Proveedor p2 = new Proveedor("Ana Gómez", "XYZ Ltda.", "987654321", "ana@xyz.com");
        Proveedor p3 = new Proveedor("Pedro Ramírez", "DEF Corp.", "456123789", "pedro@def.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
