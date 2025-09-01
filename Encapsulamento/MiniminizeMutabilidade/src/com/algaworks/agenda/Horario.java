package com.algaworks.agenda;

public class Horario {

    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;

        if(hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora Inválida: " + hora);
        } if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto Inválido: " + minuto);
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public String formatar() {
        return String.format("%dh%dm%n", getHora(), getMinuto());
    }
}