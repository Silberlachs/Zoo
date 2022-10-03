package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

public class Hyaene extends Fleischfresser{

    public Hyaene(String name, double gewicht, boolean lebendig, boolean istJaeger, Zoo zoo) {
        super(name, gewicht, lebendig, istJaeger, zoo);
        super.magenInhalt = new ArrayList<Tier>();
    }
}
