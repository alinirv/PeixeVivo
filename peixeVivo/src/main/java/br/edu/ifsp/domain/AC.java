package br.edu.ifsp.domain;

public class AC implements Observer{
    private int id;

    public AC(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        emitirAlarmeSonoro();
    }

    private void emitirAlarmeSonoro() {
        System.out.println("Alarme sonoro de evacuação emitido pelo AC " + id);
    }
}
