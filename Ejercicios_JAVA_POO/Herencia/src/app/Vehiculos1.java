//package app;
//
//class Vehiculo {
//    private String nombre;
//
//    public Vehiculo(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String toString() {
//        return "Vehículo: " + nombre;
//    }
//}
//
//// Terrestre
//class Terrestre extends Vehiculo {
//    public Terrestre(String nombre) {
//        super(nombre);
//    }
//}
//
//class Automovil extends Terrestre {
//    public Automovil(String nombre) {
//        super(nombre);
//    }
//}
//
//class Sedan extends Automovil {
//    public Sedan(String nombre) {
//        super(nombre);
//    }
//}
//
//class SUV extends Automovil {
//    public SUV(String nombre) {
//        super(nombre);
//    }
//}
//
//class Motocicleta extends Terrestre {
//    public Motocicleta(String nombre) {
//        super(nombre);
//    }
//}
//
//class Deportiva extends Motocicleta {
//    public Deportiva(String nombre) {
//        super(nombre);
//    }
//}
//
//class Turismo extends Motocicleta {
//    public Turismo(String nombre) {
//        super(nombre);
//    }
//}
//
//// Aéreo
//class Aereo extends Vehiculo {
//    public Aereo(String nombre) {
//        super(nombre);
//    }
//}
//
//class Avion extends Aereo {
//    public Avion(String nombre) {
//        super(nombre);
//    }
//}
//
//class Comercial extends Avion {
//    public Comercial(String nombre) {
//        super(nombre);
//    }
//}
//
//class Privado extends Avion {
//    public Privado(String nombre) {
//        super(nombre);
//    }
//}
//
//class Helicoptero extends Aereo {
//    public Helicoptero(String nombre) {
//        super(nombre);
//    }
//}
//
//class Militar extends Helicoptero {
//    public Militar(String nombre) {
//        super(nombre);
//    }
//}
//
//class Civil extends Helicoptero {
//    public Civil(String nombre) {
//        super(nombre);
//    }
//}
//
//public class Vehiculos1 {
//    public static void main(String[] args) {
//        Sedan sedan = new Sedan("Toyota Corolla");
//        SUV suv = new SUV("Honda CR-V");
//        Deportiva deportiva = new Deportiva("Yamaha R1");
//        Turismo turismo = new Turismo("Harley Davidson");
//        Comercial comercial = new Comercial("Boeing 747");
//        Privado privado = new Privado("Cessna Citation");
//        Militar militar = new Militar("Apache AH-64");
//        Civil civil = new Civil("Bell 407");
//
//        System.out.println(sedan);
//        System.out.println(suv);
//        System.out.println(deportiva);
//        System.out.println(turismo);
//        System.out.println(comercial);
//        System.out.println(privado);
//        System.out.println(militar);
//        System.out.println(civil);
//    }
//}
