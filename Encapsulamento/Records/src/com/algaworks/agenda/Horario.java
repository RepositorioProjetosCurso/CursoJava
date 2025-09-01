package com.algaworks.agenda;

public record Horario(int hora, int minuto) {

    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora Inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto Inválido: " + minuto);
        }
    }

    public String formatar() {
        return String.format("%02dh%02d", hora, minuto);
    }
}
