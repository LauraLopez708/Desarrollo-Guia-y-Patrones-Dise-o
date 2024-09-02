//package app;
//
//import java.util.HashMap;
//import java.util.Map;
//
//interface Flyweight {
//    void operacion(String estadoExterno);
//}
//
//class FlyweightConcreto implements Flyweight {
//    private String estadoIntrinseco;
//
//    public FlyweightConcreto(String estadoIntrinseco) {
//        this.estadoIntrinseco = estadoIntrinseco;
//    }
//
//    public void operacion(String estadoExterno) {
//        System.out.println("Estado intrínseco: " + estadoIntrinseco + ", Estado extrínseco: " + estadoExterno);
//    }
//}
//
//class FlyweightFactory {
//    private Map<String, Flyweight> flyweights = new HashMap<>();
//
//    public Flyweight obtenerFlyweight(String estadoIntrinseco) {
//        if (!flyweights.containsKey(estadoIntrinseco)) {
//            flyweights.put(estadoIntrinseco, new FlyweightConcreto(estadoIntrinseco));
//        }
//        return flyweights.get(estadoIntrinseco);
//    }
//}
//
//public class PatronFlyweight {
//    public static void main(String[] args) {
//        FlyweightFactory factory = new FlyweightFactory();
//        
//        Flyweight flyweight1 = factory.obtenerFlyweight("A");
//        Flyweight flyweight2 = factory.obtenerFlyweight("B");
//        Flyweight flyweight3 = factory.obtenerFlyweight("A");
//        
//        flyweight1.operacion("X");
//        flyweight2.operacion("Y");
//        flyweight3.operacion("Z");
//    }
//}
