package Tier;

import Zoo.Zoo;

public class Hase extends Pflanzenfresser{

    private double ohrLänge;

    public Hase(String name, double gewicht, boolean lebendig, String lieblingsPflanze,double ohrLänge, Zoo zoo) {
        super(name, gewicht, lebendig, lieblingsPflanze, zoo);
    }
}
