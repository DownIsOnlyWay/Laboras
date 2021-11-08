package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Transportas transportas[] = new Transportas[5];

        transportas[0] = new Transportas("Sausumos", true, 1998);
        transportas[1] = new Transportas("Oro", false, 1900);
        transportas[2] = new Transportas("Vandens", false, 1880);
        transportas[3] = new Transportas("Sausumos", false, 1999);
        transportas[4] = new Transportas("Oro", true, 2012);


        System.out.println("Transproto sarasas\n");
        System.out.println("Tipas    | Variklis | Metai");
        for (Transportas i : transportas) {
            System.out.println(i.toString());
        }


        ArrayList<Automobilis> au = new ArrayList<Automobilis>();

        Automobilis A1 = new Automobilis("AUDI", 4, true);
        Automobilis A2 = new Automobilis("BMW", 3, true);
        Automobilis A3 = new Automobilis("OPEL", 5, false);
        Automobilis A4 = new Automobilis("FIAT", 4, false);
        Automobilis A5 = new Automobilis("SUZUKI", 4, true);

        au.add(A1);
        au.add(A2);
        au.add(A3);
        au.add(A4);
        au.add(A5);

        System.out.println("\n\n Automobiliu Sarasas\n");
        System.out.println("Marke  | DuruSk | Varomas elektra");
        for (Automobilis i : au) {
            System.out.println(i.toString());
        }
        System.out.println("\nAutomobiliu Sarasas (Elektiniai Varikliai)");
        System.out.println("Marke  | DuruSk | Varomas elektra");
        for (Automobilis i : au) {
            if (i.isVaromas() == true)
                System.out.println(i.toString());
        }
    }
}
