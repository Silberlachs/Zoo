package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

public class Wolf extends Fleischfresser{

    public Wolf(String name, double gewicht, boolean lebendig, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, zoo);
        super.setIstJaeger(true);
        super.magenInhalt = new ArrayList<Tier>();
    }

    public void erlege(Tier beutetier)
    {
        if(this.getName().equals(beutetier.getName()) && beutetier.getClass() == this.getClass()){
            System.out.println(String.format("%s kann sich nicht selbst erlegen", this.getName()));
            return;
        }

        if(!beutetier.isLebendig()){
            System.out.println(String.format("Die Beute ist bereits tot und kann daher nicht von %s erlegt werden", this.getName()));
        }

        beutetier.erlege();
    }

    public String toString()
    {
        return String.format("Das Tier heißt %s, wiegt %5.2fKg, wont im Zoo %s, ist ein %s und ist ein %s",
                this.name,
                this.gewicht,
                this.zoo.getName(),
                this.istJaeger ? "Jaeger" : "Aasfresser",
                this.getClass());
    }

}
