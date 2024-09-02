//package app;
//
//interface Comando {
//
//    void ejecutar();
//}
//
//class Receptor {
//
//    public void accion() {
//        System.out.println("Acción del receptor ejecutada");
//    }
//}
//
//class ComandoConcreto implements Comando {
//
//    private Receptor receptor;
//
//    public ComandoConcreto(Receptor receptor) {
//        this.receptor = receptor;
//    }
//
//    public void ejecutar() {
//        receptor.accion();
//    }
//}
//
//class Invocador {
//
//    private Comando comando;
//
//    public void setComando(Comando comando) {
//        this.comando = comando;
//    }
//
//    public void ejecutarComando() {
//        comando.ejecutar();
//    }
//}
//
//public class Command {
//
//    public static void main(String[] args) {
//        Receptor receptor = new Receptor();
//        Comando comando = new ComandoConcreto(receptor);
//        Invocador invocador = new Invocador();
//
//        invocador.setComando(comando);
//        invocador.ejecutarComando();
//    }
//}
