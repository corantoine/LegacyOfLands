package model.batiments;

import model.batiments.Batiments;
import model.unites.Unites;

public class Caserne extends Batiments {
    @Override
    public void construire() {
        System.out.println("La construction de la caserne est terminée.");
    }



    @Override
    public void actionDuBatiment() {
        System.out.println("Unités militaires en cours de formation...");

    }
}
