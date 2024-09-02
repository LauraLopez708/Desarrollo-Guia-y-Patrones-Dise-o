//package app;
//
//interface Dibujo {
//    void dibujarCirculo(int x, int y, int radio);
//}
//
//
//class DibujoEnBlancoYNegro implements Dibujo {
//    public void dibujarCirculo(int x, int y, int radio) {
//        System.out.println("Dibujando círculo en blanco y negro en (" + x + ", " + y + ") con radio " + radio);
//    }
//}
//
//
//class DibujoEnColor implements Dibujo {
//    public void dibujarCirculo(int x, int y, int radio) {
//        System.out.println("Dibujando círculo en color en (" + x + ", " + y + ") con radio " + radio);
//    }
//}
//
//
//abstract class Forma {
//    protected Dibujo dibujo;
//
//    protected Forma(Dibujo dibujo) {
//        this.dibujo = dibujo;
//    }
//
//    abstract void dibujar();
//}
//
//
//class Circulo extends Forma {
//    private int x, y, radio;
//
//    public Circulo(int x, int y, int radio, Dibujo dibujo) {
//        super(dibujo);
//        this.x = x;
//        this.y = y;
//        this.radio = radio;
//    }
//
//    public void dibujar() {
//        dibujo.dibujarCirculo(x, y, radio);
//    }
//}
//
//
//public class Bridge {
//    public static void main(String[] args) {
//        Forma circulo1 = new Circulo(10, 20, 30, new DibujoEnBlancoYNegro());
//        Forma circulo2 = new Circulo(40, 50, 60, new DibujoEnColor());
//
//        circulo1.dibujar();
//        circulo2.dibujar();
//    }
//}
//
