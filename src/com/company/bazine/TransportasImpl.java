package com.company.bazine;

public class TransportasImpl implements Transportas {

    public String tipas;
    public Boolean variklis;
    public int pagMetai;

    public TransportasImpl(String tipas, Boolean variklis, int pagMetai) {
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagMetai = pagMetai;
    }

    @Override
    public String isTipas() {
        return this.tipas;
    }

    @Override
    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    @Override
    public boolean isVariklis() {
        return this.variklis;
    }

    @Override
    public void setVariklis(boolean variklis) {
        this.variklis = variklis;
    }

    @Override
    public int getPagMetai() {
        return this.pagMetai;
    }

    @Override
    public String toString() {
        return "TransportasImpl{" +
                "tipas=" + tipas +
                ", variklis=" + variklis +
                ", pagMetai=" + pagMetai +
                '}';
    }
}
