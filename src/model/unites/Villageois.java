package model.unites;

import java.util.ArrayList;
import java.util.List;

import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;

public class Villageois extends Unites{
    private String nom;
    private List<TypeRessources> sacADos;

    public Villageois(String nom) {
        super(nom);
        this.sacADos = new ArrayList<>();
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public void ajouterAuSacADos(TypeRessources ressource) {
        this.sacADos.add(ressource);
    }

    public void collecter(TypeRessources ressource){
        this.ajouterAuSacADos(ressource);
        System.out.println(String.format("La ressource %s a bien été collectée", ressource));
        System.out.println(String.format("Contenu de mon sac à dos %s", this.sacADos));
    }

    @Override
    public void seDeplacer(TypeBatiment type) {
        switch ((TypeBatiment) type) {
            case MAISON:
                System.out.println("Les villageois se reposent dans leurs maisons");
                return;
            case MURDEDEFENSE:
                System.out.println("Les villageois se promènent dans le village");
                return;
        }
        throw new IllegalArgumentException("Les villageois ne devraient pas être ici.");
    }

    @Override
    public void travailler() {

    }


//    @Override
//    public void recolter(TypeRessources typeRessources){
//        switch ((TypeRessources) typeRessources){
//            case FER:
//            System.out.println(String.format("%s a collecté du fer.", this.getNom()));
//            break;
//            case OR:
//            System.out.println(String.format("%s a collecté de l'or", this.getNom()));
//            break;
//            case BOIS:
//                System.out.println(String.format("%s a collecté du bois",this.getNom()));
//                break;
//            case PIERRE:
//                System.out.println(String.format("%s a collecté de la pierre", this.getNom()));
//                break;
//            case NOURRITURE:
//                System.out.println(String.format("%s a collecté de la nourriture.", this.getNom()));
//            default:
//                System.out.println("Une erreur est survenue.");
//                break;
//        }
//    }


//    @Override
//    public void recolter(){
//        System.out.println(String.format("%s collecte des ressources", this.nom));
//    }

    @Override
    public void seReposer() {

    }


}
