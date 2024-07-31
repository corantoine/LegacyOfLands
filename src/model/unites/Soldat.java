package model.unites;

import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;

public class Soldat extends Unites {


    public Soldat(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer(TypeBatiment type) {
        switch ((TypeBatiment) type) {
            case CASERNE:
                System.out.println("Le soldat est arrivé à la caserne et se repose");
                return;
            case MURDEDEFENSE:
                System.out.println("Le soldat est arrivé au mur de défense");
                return;
        }
        throw new IllegalArgumentException("Le soldat ne devrait pas être ici.");
    }

    @Override
    public void travailler() {
        System.out.println("Les soldats partent en mission.");
    }


    @Override
    public void seReposer() {

    }


}
