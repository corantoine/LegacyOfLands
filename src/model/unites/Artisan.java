package model.unites;

import model.batiments.Maison;
import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;

public class Artisan extends Unites{

    // je crée un batiment attitré à mon unite

    public Artisan(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer(TypeBatiment type) {
    switch ((TypeBatiment) type){
        case ATELIER:
            System.out.println(String.format("%s est bien arriver à l'atelier et commence à fabriquer des armes et des outils", this.getNom()));
        break;
        case MAISON:
            System.out.println(String.format("%s est arrivé dans sa maison et va se coucher", this.getNom()));
        break;
        default:
        throw new IllegalArgumentException(String.format("%s ne devrait pas être ici.", this.getNom()));
    }
    this.currentBuilding = type;
    }

    @Override
    public void travailler() {
        System.out.println(String.format("%s forge des armes", this.getNom()));
    }



    @Override
    public void seReposer() {

        System.out.println(String.format("%s se repose", this.getNom()));
}


}
