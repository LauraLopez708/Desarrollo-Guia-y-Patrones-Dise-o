//package app;
//
//class Modelo {
//
//    private int contador;
//
//    public int getContador() {
//        return contador;
//    }
//
//    public void incrementar() {
//        contador++;
//    }
//}
//
//class Vista {
//
//    public void mostrarContador(int contador) {
//        System.out.println("Contador: " + contador);
//    }
//}
//
//class Controlador {
//
//    private Modelo modelo;
//    private Vista vista;
//
//    public Controlador(Modelo modelo, Vista vista) {
//        this.modelo = modelo;
//        this.vista = vista;
//    }
//
//    public void incrementarContador() {
//        modelo.incrementar();
//        vista.mostrarContador(modelo.getContador());
//    }
//}
//
//public class MVC {
//
//    public static void main(String[] args) {
//        Modelo modelo = new Modelo();
//        Vista vista = new Vista();
//        Controlador controlador = new Controlador(modelo, vista);
//
//        controlador.incrementarContador();
//        controlador.incrementarContador();
//    }
//}
