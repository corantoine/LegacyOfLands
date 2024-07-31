package model.batiments;

import model.unites.Unites;

public class Ferme extends Batiments{

    private String nourriture;

    @Override
    public void construire() {
        System.out.println("La construction de la ferme est terminée.");
    }


    @Override
    public void actionDuBatiment() {
        System.out.println("Action de la ferme : Production de nourriture en cours...");
    }

    public void produireRessource(){

            }
}
