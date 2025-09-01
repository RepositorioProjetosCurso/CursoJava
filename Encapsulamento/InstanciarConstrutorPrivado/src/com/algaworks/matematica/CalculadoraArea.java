package com.algaworks.matematica;

public class CalculadoraArea {

    public static final double PI = 3.14159265358979323846;

    private CalculadoraArea() {

    }

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return Math.pow(medidaDoLado, 2);
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.pow(raio, 2) * CalculadoraArea.PI;
    }
}
