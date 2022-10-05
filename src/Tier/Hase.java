package Tier;

import Zoo.Zoo;

public class Hase extends Pflanzenfresser{

    private double ohrLänge;

    public Hase(String name, double gewicht, boolean lebendig, String lieblingsPflanze,double ohrLänge, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, lieblingsPflanze, zoo);
    }

    public String toString()
    {
        return String.format("Das Tier heißt %s,%s, wiegt %5.2fKg, wont im Zoo %s, isst gern %s ist ein %s und hat %ecm lange Ohren",
                this.name,
                this.lebendig ? "lebt" : "ist tot",
                this.gewicht,
                this.zoo.getName(),
                this.lieblingsPflanze,
                this.getClass(),
                this.ohrLänge);
    }
}
