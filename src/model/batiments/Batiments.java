package model.batiments;

import model.unites.Unites;

public abstract class Batiments implements Constructible{
    @Override
    public void construire() {
        System.out.println("Construction du bâtiment terminée par %s.");
    }


    private Unites unitesDansBatiment;
}
