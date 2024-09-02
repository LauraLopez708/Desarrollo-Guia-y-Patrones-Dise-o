//package app;
//
//class Inversion {
//    public String codigoInversion;
//    public String inversor;
//    public double montoInicial;
//    public double tasaInteresAnual;
//    public double interesGenerado;
//
//    public Inversion(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual) {
//        this.codigoInversion = codigoInversion;
//        this.inversor = inversor;
//        this.montoInicial = montoInicial;
//        this.tasaInteresAnual = tasaInteresAnual;
//        this.interesGenerado = montoInicial * tasaInteresAnual / 100;
//    }
//
//    public String getCodigoInversion() {
//        return codigoInversion;
//    }
//
//    public void setCodigoInversion(String codigoInversion) {
//        this.codigoInversion = codigoInversion;
//    }
//
//    public String getInversor() {
//        return inversor;
//    }
//
//    public void setInversor(String inversor) {
//        this.inversor = inversor;
//    }
//
//    public double getMontoInicial() {
//        return montoInicial;
//    }
//
//    public void setMontoInicial(double montoInicial) {
//        this.montoInicial = montoInicial;
//    }
//
//    public double getTasaInteresAnual() {
//        return tasaInteresAnual;
//    }
//
//    public void setTasaInteresAnual(double tasaInteresAnual) {
//        this.tasaInteresAnual = tasaInteresAnual;
//    }
//
//    public double getInteresGenerado() {
//        return interesGenerado;
//    }
//
//    public void setInteresGenerado(double interesGenerado) {
//        this.interesGenerado = interesGenerado;
//    }
//}
//
//class InversionRiesgo extends Inversion {
//    private String nivelRiesgo;
//    private double potencialGanancia;
//
//    public InversionRiesgo(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual, String nivelRiesgo) {
//        super(codigoInversion, inversor, montoInicial, tasaInteresAnual);
//        this.nivelRiesgo = nivelRiesgo;
//        switch (nivelRiesgo.toLowerCase()) {
//            case "alto":
//                this.potencialGanancia = getInteresGenerado() * 2;
//                break;
//            case "medio":
//                this.potencialGanancia = getInteresGenerado() * 1.5;
//                break;
//            case "bajo":
//                this.potencialGanancia = getInteresGenerado();
//                break;
//            default:
//                this.potencialGanancia = 0;
//                break;
//        }
//    }
//
//   public String getNivelRiesgo() {
//        return nivelRiesgo;
//    }
//
//    public void setNivelRiesgo(String nivelRiesgo) {
//        this.nivelRiesgo = nivelRiesgo;
//    }
//
//    public double getPotencialGanancia() {
//        return potencialGanancia;
//    }
//
//    public void setPotencialGanancia(double potencialGanancia) {
//        this.potencialGanancia = potencialGanancia;
//    }
//
//    public String toString() {
//        return "Código de Inversión: " + getCodigoInversion() + "\nInversor: " + getInversor() + "\nMonto Inicial: " + getMontoInicial() + "\nTasa de Interés Anual: " + getTasaInteresAnual() + "\nInterés Generado: " + getInteresGenerado() + "\nNivel de Riesgo: " + nivelRiesgo + "\nPotencial de Ganancia: " + potencialGanancia;
//    }
//
//    public static void main(String[] args) {
//        InversionRiesgo inversion1 = new InversionRiesgo("INV001", "Inversor A", 10000, 5, "alto");
//        InversionRiesgo inversion2 = new InversionRiesgo("INV002", "Inversor B", 20000, 4, "medio");
//        System.out.println(inversion1.toString());
//        System.out.println(inversion2.toString());
//    }
//}