package Tier;

import Zoo.Zoo;

abstract class Tier {

    protected double gewicht;
    protected String name;
    protected boolean lebendig;
    protected Zoo zoo;

    public Tier(String name, double gewicht, boolean lebendig, Zoo zoo)
    {
        this.name = name;
        this.gewicht = gewicht;
        this.lebendig = lebendig;
        this.zoo = zoo;
    }
}
