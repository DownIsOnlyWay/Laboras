package com.company;

public class Transportas {

    private final String tipas;
    private final boolean variklis;
    private final int pagMetai;

    Transportas(String tipas, boolean variklis, int pagMetai) {
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagMetai = pagMetai;
    }

    public int getPagMetai() {
        return pagMetai;
    }

    public boolean isVariklis() {
        return variklis;
    }

    public String getTipas() {
        return tipas;
    }

    @Override
    public String toString() {
        return String.format("%8s %7b %9d", tipas, variklis, pagMetai);
    }
}
