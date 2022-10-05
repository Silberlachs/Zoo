package Tier;

import Zoo.Zoo;

import java.util.ArrayList;

abstract class Fleischfresser extends Tier
{
    protected boolean istJaeger = false;
    protected ArrayList<Tier> magenInhalt;

    public Fleischfresser(String name, double gewicht, boolean lebendig, Zoo zoo) throws Exception {
        super(name, gewicht, lebendig, zoo);
    }

    public String magenInhalt()
    {
        StringBuilder magenString = new StringBuilder();
        for(Tier tier : magenInhalt)
        {
            magenString.append(tier.getName());
        }

        return magenString.toString();
    }

    public void friss(Tier beutetier)
    {
        //if(this.getName().equals(beutetier.getName()) && beutetier.getClass() == this.getClass()){
        if(beutetier.equals(this)){
            System.out.println(String.format("%s kann sich nicht selbst fressen", this.getName()));
            return;
        }

        if(beutetier.isLebendig() && this.isLebendig()){
            System.out.println("Kann nur tote Tiere fressen und muss selbst lebendig sein!");
            return;
        }

        if(beutetier.getZoo() != this.getZoo()){
            System.out.println(String.format("%s kann das Beutetier %s nicht fressen, da die beiden sich in unterschiedlichen Zoos befinden",
                    this.getName(),
                    beutetier.getName()));
            return;
        }

        this.magenInhalt.add(beutetier);
        this.wieHatsGeschmeckt(beutetier);

        beutetier.getZoo().loescheTier(beutetier);
    }

    private void wieHatsGeschmeckt(Tier beutetier)
    {
        System.out.println(String.format("Fresse %s", beutetier.getName()));
        switch (beutetier.getClass().getSuperclass().getSimpleName()){
            case "Fleischfresser":
                System.out.println("Igitt Igitt");
                break;
            case "Pflanzenfresser":
                System.out.println(String.format("Das gefressene Tier hat gern %s gefressen",
                        ((Pflanzenfresser)beutetier).getLieblingsPflanze()));

                if(beutetier.getClass().getSimpleName().equals("Reh")){
                    System.out.println(((Reh)beutetier).hatGeweih() ?
                            "Vorsicht! Spitzes Geweih!" : "Hmm... schoen saftig!");
                }
                break;
            default:
                System.out.println("Unbekannte Entitaet gefressen");
                break;
        }
    }

    protected void setIstJaeger(boolean status)
    {
        this.istJaeger = status;
    }

}
