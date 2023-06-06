package br.edu.ifsp.domain;

import java.util.ArrayList;
import java.util.List;

public class Barragem {
    private List<Observer> observadores;
    private int indicadoresSismo;

    public Barragem() {
        observadores = new ArrayList<>();
        indicadoresSismo = 0;
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void incrementarSismos() {
        indicadoresSismo++;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update();
        }
    }

    public int getIndicadoresSismo() {
        return indicadoresSismo;
    }
}

