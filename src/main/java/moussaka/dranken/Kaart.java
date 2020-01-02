package moussaka.dranken;

import javax.swing.*;
import java.util.*;

public class Kaart {
    public LinkedList<Drank> dranken = new LinkedList<>();

    public Kaart() {
    }

    public void voegDrankToe(Drank toegevoegdeDrank) {
        dranken.add(toegevoegdeDrank);
    }

    public int getAantal() {
        return dranken.size();
    }

    public double getTotalePrijs() {
        double totalePrijs = 0;

        for (Drank drankInDranken : dranken) {
            totalePrijs += drankInDranken.prijs;
        }

        return totalePrijs;
    }

    @Override
    public String toString() {
        return "Kaart:" + dranken;
    }

    public void verwijderDuurderDan(int maximumPrijs) {
        LinkedList<Drank> lijstTeDureDranken = new LinkedList<>();

        for (Iterator<Drank> drankIterator = dranken.iterator(); drankIterator.hasNext(); ) {
            Drank eenDrankUitMijnLijst;
            eenDrankUitMijnLijst = drankIterator.next();
            if (eenDrankUitMijnLijst.prijs > maximumPrijs) {
                lijstTeDureDranken.add(eenDrankUitMijnLijst);
            }
        }
        for (Iterator<Drank> iterator = lijstTeDureDranken.iterator(); iterator.hasNext(); ) {
            Drank next =  iterator.next();
            dranken.remove(next);
        }
    }
}