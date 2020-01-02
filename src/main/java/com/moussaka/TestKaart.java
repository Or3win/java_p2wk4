package com.moussaka;
import java.util.*;
public class TestKaart {
    public static void main(String[] args) {
        Kaart kaart = new Kaart();
        Drank nieuweDrank1 = new Drank("Sherry", 5.50,true);
        kaart.voegDrankToe(nieuweDrank1);

        Drank nieuweDrank2 = new Drank("Cola", 2.0,false);
        kaart.voegDrankToe(nieuweDrank2);

        Drank nieuweDrank3 = new Drank("Water", 2.0,false);
        kaart.voegDrankToe(nieuweDrank3);

        Drank nieuweDrank4 = new Drank("LaChouffe", 3.50,true);
        kaart.voegDrankToe(nieuweDrank4);

        Drank nieuweDrank5 = new Drank("Jup", 2.50,true);
        kaart.voegDrankToe(nieuweDrank5);

        Drank nieuweDrank6 = new Drank("Stella", 2.50,true);
        kaart.voegDrankToe(nieuweDrank6);

        Drank nieuweDrank7 = new Drank("Fanta", 2.00,false);
        kaart.voegDrankToe(nieuweDrank7);

        Drank nieuweDrank8 = new Drank("Sprite", 2.00,false);
        kaart.voegDrankToe(nieuweDrank8);

        Drank nieuweDrank9 = new Drank("Duvel", 3.50,true);
        kaart.voegDrankToe(nieuweDrank9);

        Drank nieuweDrank10 = new Drank("Leffe", 3.50,true);
        kaart.voegDrankToe(nieuweDrank10);
    }
    }
