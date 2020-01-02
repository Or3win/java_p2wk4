package com.moussaka;

import java.util.*;

public class Kaart {
    public LinkedList<com.moussaka.Drank> dranken = new LinkedList<>();

    public Kaart() {
    }

    public void voegDrankToe(com.moussaka.Drank toegevoegdeDrank) {
        dranken.add(toegevoegdeDrank);
    }

    public int getAantal() {
        return dranken.size();
    }

    public double getTotalePrijs() {
        double totalePrijs = 0;

        for (com.moussaka.Drank drankInDranken : dranken) {
            totalePrijs += drankInDranken.prijs;
        }

        return totalePrijs;
    }

    @Override
    public String toString() {
        return "Kaart:" + dranken;
    }
}