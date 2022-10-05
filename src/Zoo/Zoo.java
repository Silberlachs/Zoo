package Zoo;

import Tier.Tier;

public class Zoo {

    private String name;
    private TierListe tierListe;

    public Zoo(String name)
    {
        this.name = name;
        this.tierListe = new TierListe();
    }

    public String getName()
    {
        return this.name;
    }

    public boolean nimmTierAuf(Tier zootier)
    {
        return this.tierListe.fuegeHinzu(zootier);
    }

    public boolean loescheTier(Tier opferTier)
    {
        return this.tierListe.loesche(opferTier);
    }

    public String toString()
    {
        return String.format("Der Zoo %s beherbergt:", this.getName()) + this.tierListe.toString();
    }
}
