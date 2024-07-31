package model.batiments;

import model.unites.Unites;

public class Atelier extends Batiments{


    @Override
    public void construire() {
        System.out.println("La construction de l'atelier est terminée.");
    }



    @Override
    public void actionDuBatiment() {
        System.out.println("Action de l'atelier : production d'armes et d'outils en cours ...");
    }
}
