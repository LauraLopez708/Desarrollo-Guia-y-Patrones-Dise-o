//package app;
//
//interface EnchufeEuropeo {
//
//    void encender();
//}
//
//class EnchufeAmericano {
//
//    void turnOn() {
//        System.out.println("Enchufe Americano encendido");
//    }
//}
//
//class Adapter implements EnchufeEuropeo {
//
//    private EnchufeAmericano enchufeAmericano;
//
//    public Adapter(EnchufeAmericano enchufeAmericano) {
//        this.enchufeAmericano = enchufeAmericano;
//    }
//
//    public void encender() {
//        enchufeAmericano.turnOn();
//    }
//}
//
//class Main {
//
//    public static void main(String[] args) {
//        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
//        EnchufeEuropeo adaptador = new Adapter(enchufeAmericano);
//        adaptador.encender();
//    }
//}
