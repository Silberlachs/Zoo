package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

public class Hyaene extends Fleischfresser{

    public Hyaene(String name, double gewicht, boolean lebendig, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, zoo);
        super.magenInhalt = new ArrayList<Tier>();
    }

    public String toString()
    {
        return String.format("Das Tier heißt %s, wiegt %5.2fKg, wont im Zoo %s, ist ein %s und ist eine %s",
                this.name,
                this.gewicht,
                this.zoo.getName(),
                this.istJaeger ? "Jaeger" : "Aasfresser",
                this.getClass());
    }
}
