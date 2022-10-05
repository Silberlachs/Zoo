package Tier;

import Zoo.Zoo;

abstract class Pflanzenfresser extends Tier{

    protected String lieblingsPflanze;

    public Pflanzenfresser(String name, double gewicht, boolean lebendig, String lieblingsPflanze, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, zoo);
        this.lieblingsPflanze = lieblingsPflanze;
    }

    public String getLieblingsPflanze()
    {
        return this.lieblingsPflanze;
    }
}
