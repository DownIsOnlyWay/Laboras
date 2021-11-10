package com.company;

import java.io.*;
import java.util.Scanner;

import com.company.bazine.Transportas;
import com.company.bazine.TransportasImpl;
import com.company.isvestine.Automobilis;
import com.company.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {

        TransportasImpl transportas1 = new TransportasImpl("Sausumos", true, 1999);
        TransportasImpl transportas2 = new TransportasImpl("Oro", false, 1888);
        TransportasImpl transportas3 = new TransportasImpl("Vandens", true, 2000);
        TransportasImpl transportas4 = new TransportasImpl("Sausumos", false, 2010);
        TransportasImpl transportas5 = new TransportasImpl("Vandens", true, 1200);

        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos", false, 1990, "Audi", 5, true);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("Oro", true, 1989, "BMW", 5, true);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("Vandens", false, 2010, "Opel", 5, false);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Sausumos", true, 2011, "Opel", 5, true);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("Oro", false, 2012, "Audi", 5, false);

        TransportasImpl[] tr = new TransportasImpl[10];
        tr[0] = transportas1;
        tr[1] = transportas2;
        tr[2] = transportas3;
        tr[3] = transportas4;
        tr[4] = transportas5;
        tr[5] = automobilis1;
        tr[6] = automobilis2;
        tr[7] = automobilis3;
        tr[8] = automobilis4;
        tr[9] = automobilis5;

        System.out.println("\n\nAutomobiliai, kurie varomi elektra\n");
        for (TransportasImpl transportas : tr) {
            if (transportas instanceof Automobilis) {
                if (((Automobilis) transportas).VaromasElektra())
                    System.out.println(transportas.toString());
            }
        }


        //---------------------------------------------------------------------
        String transportoFailas = "Transportas.txt";
        String automobiliuFailas = "Automobiliai.txt";
        //---------------------------------------------------------------------
        eiluciuKiekis(transportoFailas);
        eiluciuKiekis(automobiliuFailas);
        //---------------------------------------------------------------------
        nuskaitymasTranspoto(eiluciuKiekis(transportoFailas), transportoFailas);
        nuskaitymasAutomobiliu(eiluciuKiekis(automobiliuFailas), automobiliuFailas);
        //---------------------------------------------------------------------

        //---------------------------------------------------------------------


    }

    public static int eiluciuKiekis(String failas) {
        int kiekis = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(failas));
            while (reader.readLine() != null)
                kiekis++;
        } catch (IOException e) {
            System.out.println("Failas " + failas + " nerastas");
        }
        return kiekis;
    }

    public static void nuskaitymasTranspoto(int kiekis, String failas) {

        String tipas;
        boolean variklis;
        int metai;
        int kuris = 0;

        TransportasImpl[] tra = new TransportasImpl[kiekis];
        File Obj = new File(failas);
        try {  //2. try/catch panaudojimas
            Scanner reader = new Scanner(Obj);
            while (reader.hasNextLine()) {

                tipas = reader.next();
                variklis = Boolean.parseBoolean(reader.next());
                metai = Integer.parseInt(reader.next());
                tra[kuris] = new TransportasImpl(tipas, variklis, metai);
                kuris++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        }
        System.out.println("\n\nTransporto duomenys is failo\n");
        for (TransportasImpl tr : tra)
            System.out.println(tr.toString());

    }

    public static void nuskaitymasAutomobiliu(int kiekis, String failas) {

        String tipas;
        boolean variklis;
        int metai;
        String marke;
        boolean varomasE;
        int duruSk;
        int kuris = 0;

        AutomobilisImpl[] au = new AutomobilisImpl[kiekis];
        File Obj = new File(failas);
        try {
            Scanner reader = new Scanner(Obj);
            while (reader.hasNextLine()) {
                tipas = reader.next();
                variklis = Boolean.parseBoolean(reader.next());
                metai = Integer.parseInt(reader.next());
                marke = reader.next();
                duruSk = Integer.parseInt(reader.next());
                varomasE = Boolean.parseBoolean(reader.next());

                au[kuris] = new AutomobilisImpl(tipas, variklis, metai, marke, duruSk, varomasE);
                kuris++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        }
        System.out.println("\n\nAutomobiliu duomenys is failo\n");
        for (AutomobilisImpl automobilis : au)
            System.out.println(automobilis.toAllString());

        System.out.println("\n\n Atrinkti pagal elektrinius\n");

        for (AutomobilisImpl automobilis : au)
            if (automobilis.VaromasElektra())
                System.out.println(automobilis.toString());

    }

}

