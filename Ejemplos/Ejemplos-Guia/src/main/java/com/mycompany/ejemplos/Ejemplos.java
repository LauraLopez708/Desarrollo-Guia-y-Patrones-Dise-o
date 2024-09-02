package com.mycompany.ejemplos;

public class Ejemplos {
    
    //Definicion de variables de diferente acceso
    public int num1;
    private int num2;
    protected int num3;
    int num4;

  //Metodo constructor
    public Ejemplos (int publica, int privada, int protegida, int defecto) {
        this.num1 = publica;
        this.num2 = privada;
        this.num3 = protegida;
        this.num4 = defecto;       
    }

    // Método void
    public void mtdVoid() {
        System.out.println("Este metodo no retorna nada");
    }

    // Método con tipo de retorno
    public int mtsReturn() {
        return num2 * 2;
    }

    // Método con parámetros y tipo de retorno
    public int mtdParametros(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}
