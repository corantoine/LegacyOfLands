package model.unites;

import model.batiments.Batiments;
import model.batiments.Maison;
import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;

public class Eclaireur extends Unites{

    private String nom;

    public Eclaireur(String nom) {
        super(nom);
    }

    //    @Override
//    public void definirPosition(Batiments type) {
//        this.currentBuilding = type;
//        System.out.println(String.format("L'éclaireur se trouve ici: %s", currentBuilding));
//    }

    @Override
    public void seDeplacer(TypeBatiment type) {
        switch ((TypeBatiment) type) {
            case MAISON:
                System.out.println("Les éclaireurs se reposent dans la leurs maison");
                return;
            case TERRESINCONNUES:
                System.out.println("Les éclaireurs partent pour localiser des ressources à l'extérieur du village.");
                return;
        }
        throw new IllegalArgumentException("Les éclaireurs ne devraient pas être ici.");
    }

    @Override
    public void travailler() {
        System.out.println("Les éclaireurs partent en exploration");
    }


    @Override
    public void seReposer() {

    }


}
