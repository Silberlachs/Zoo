package Tier;

import Zoo.Zoo;

abstract public class Tier {

    protected double gewicht;
    protected String name;
    protected boolean lebendig;
    protected Zoo zoo;

    public Tier(String name, double gewicht, boolean lebendig, Zoo zoo) throws Exception {
        this.name = name;
        this.gewicht = gewicht;
        this.lebendig = lebendig;
        this.zoo = zoo;

        if(!zoo.nimmTierAuf(this)){
            throw new Exception("Tier konnte Zoo nicht hinzugefuegt werden");
        };
    }

    public String getName()
    {
        return this.name;
    }

    public Zoo getZoo()
    {
        return this.zoo;
    }

    public boolean isLebendig(){
        return this.lebendig;
    }

    public void erlege()
    {
        this.lebendig = false;
    }

    public double getGewicht()
    {
        return this.gewicht;
    }

    public void stirb()
    {
        this.lebendig = false;
    }
}
