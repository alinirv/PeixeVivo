package br.edu.ifsp.domain;

public class SS implements Observer{
    private boolean sismo;

    public SS() {
        sismo = false;
    }

    @Override
    public void update() {
        sismo = true;
    }

    public boolean isSismo() {
        return sismo;
    }
}
