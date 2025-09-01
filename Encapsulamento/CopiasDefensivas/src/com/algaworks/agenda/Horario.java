package com.algaworks.agenda;

public class Horario {

    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora Inválida: " + hora);
        }
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto Inválido: " + minuto);
        }
        this.minuto = minuto;
    }

    public String formatar() {
        return String.format("%dh%dm%n", getHora(), getMinuto());
    }
}