package Zoo;

import Tier.Tier;

import java.util.ArrayList;

public class TierListe extends ArrayList<Tier> {

    public boolean fuegeHinzu(Tier zootier)
    {
        if(this.tierImZooVorhanden(zootier.getName()) >= 0) {
            return false;
        }
        this.add(zootier);
        return true;
    }

    public boolean loesche(Tier zootier)
    {
        int index = this.tierImZooVorhanden(zootier.getName());
        if(index < 0){
            return false;
        }
        this.remove(index);
        return true;
    }

    public String toString()
    {
        StringBuilder tierBuffer = new StringBuilder();
        for(Tier tier : this){
            tierBuffer.append(tier.toString());
        }
        return tierBuffer.toString();
    }

    public String getNames()
    {
        StringBuilder tierBuffer = new StringBuilder();
        for(Tier tier : this){
            tierBuffer.append(tier.getName());
        }
        return tierBuffer.toString();
    }

    private int tierImZooVorhanden(String tiername)
    {
        for(int c = 0; c< this.size(); c++){
            if(this.get(c).getName().equals(tiername)){
                return c;
            }
        }
        return -1;  // overflows at 0xFFFFFFFF, so care
    }
}
