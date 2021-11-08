package com.company;

public class Automobilis {
    private String marke;
    private int duruSk;
    private boolean varomas;

    Automobilis(String marke, int duruSk, boolean varomas) {
        this.marke = marke;
        this.duruSk = duruSk;
        this.varomas = varomas;
    }

    public boolean isVaromas() {
        return varomas;
    }

    public int getDuruSk() {
        return duruSk;
    }

    public String getMarke() {
        return marke;
    }

    @Override
    public String toString() {
        return String.format("%6s %6d %12s", marke, duruSk, varomas);
    }
}
