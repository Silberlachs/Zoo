package Tier;

import Zoo.Zoo;

public class Reh extends Pflanzenfresser{

    private boolean geweih;

    public Reh(String name, double gewicht, boolean lebendig, String lieblingsPflanze, boolean geweih, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, lieblingsPflanze, zoo);
        this.geweih = geweih;
    }

    public boolean hatGeweih()
    {
        return this.geweih;
    }

    public String toString()
    {
        return String.format("Das Tier heißt %s,%s, wiegt %5.2fKg, wont im Zoo %s, isst gern %s, ist ein %s%s",
                this.name,
                this.lebendig ? "lebt" : "ist tot",
                this.gewicht,
                this.zoo.getName(),
                this.lieblingsPflanze,
                this.getClass(),
                this.geweih ? "und hat zur Zeit ein Geweih" : "");
    }
}
