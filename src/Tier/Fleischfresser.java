package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

abstract class Fleischfresser extends Tier
{
    protected boolean istJaeger;
    protected ArrayList<Tier> magenInhalt;

    public Fleischfresser(String name, double gewicht, boolean lebendig, boolean istJaeger, Zoo zoo) {
        super(name, gewicht, lebendig, zoo);
        this.istJaeger = istJaeger;
    }

    //TODO: implement magenInhalt functions here
}
