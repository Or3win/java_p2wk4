package com.moussaka;

public class Drank {
    public String naam;
    public double prijs;
    public boolean isAlcoholisch;

    public Drank(String naam, double prijs, boolean isAlcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcoholisch = isAlcoholisch;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public boolean isAlcoholisch() {
        return isAlcoholisch;
    }

    @Override
    public String toString() {
        return naam + " " + prijs + "€";
    }
}