package com.company.isvestine;

import com.company.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {
    private String marke;
    private int duruSK;
    private boolean varomasE;

    public AutomobilisImpl(String tipas, Boolean variklis, int pagMetai,
                           String marke, int duruSK, boolean varomasE) {
        super(tipas, variklis, pagMetai);
        this.marke = marke;
        this.duruSK = duruSK;
        this.varomasE = varomasE;
    }

    @Override
    public String getMarke() {
        return this.marke;
    }

    @Override
    public void setMarke(String marke) {
        this.marke = marke;
    }

    @Override
    public int getDuruSk() {
        return this.duruSK;
    }

    @Override
    public void setDuruSK(int duruSK) {
        this.duruSK = duruSK;
    }

    @Override
    public Boolean VaromasElektra() {
        return this.varomasE;
    }

    @Override
    public String toString() {
        return

                        "AutomobilisImpl{" +
                        "marke='" + marke + '\'' +
                        ", duruSK=" + duruSK +
                        ", varomasE=" + varomasE +
                        '}';
    }

    public String toAllString(){
        return  "TransportasImpl{" +
                "tipas=" + tipas +
                ", variklis=" + variklis +
                ", pagMetai=" + pagMetai +
                '}' +"     "+
                "AutomobilisImpl{" +
                "marke='" + marke + '\'' +
                ", duruSK=" + duruSK +
                ", varomasE=" + varomasE +
                '}';
    }
}
