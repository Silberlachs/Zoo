package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

public class Wolf extends Fleischfresser{

//TODO: implement functions

    public Wolf(String name, double gewicht, boolean lebendig, boolean istJaeger, Zoo zoo) {
        super(name, gewicht, lebendig, istJaeger, zoo);
        super.magenInhalt = new ArrayList<Tier>();
    }
}
