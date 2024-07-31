package model.unites;

import model.batiments.TypeBatiment;

public class Chef extends Soldat{


    public Chef(String nom){
        super(nom);
    }



    @Override
    public void seDeplacer(TypeBatiment type) {

    }

    @Override
    public void travailler() {

    }

    @Override
    public void seReposer() {

    }

    public void buff(Unites unites){
        System.out.println(String.format("%s buff la stat la plus élevée de %s", this.getNom(), unites.getNom()));
    }



}
