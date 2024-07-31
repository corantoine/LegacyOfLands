package model.batiments;

import model.batiments.Batiments;
import model.unites.Unites;

public class Maison extends Batiments {
    @Override
    public void construire() {
        System.out.println("La construction de la maison est terminée.");
    }

    @Override
    public void actionDuBatiment() {

    }
}
