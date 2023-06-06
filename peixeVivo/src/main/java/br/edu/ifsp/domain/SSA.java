package br.edu.ifsp.domain;

public class SSA implements Observer{
    private double nivel;
    private double limiarSeguranca;

    public SSA(double limiarSeguranca) {
        nivel = 0.0;
        this.limiarSeguranca = limiarSeguranca;
    }

    @Override
    public void update() {
        nivel++;
        if (nivel > limiarSeguranca) {
            emitirAlarmeSonoro();
        }
    }

    public double getNivel() {
        return nivel;
    }

    private void emitirAlarmeSonoro() {
        System.out.println("Alarme sonoro emitido pelo SSA");
    }
}
