package model.unites;

import java.util.HashMap;
import java.util.Map;

import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;

public abstract class Unites {
    protected TypeBatiment currentBuilding;
    private String nom;


    public Unites(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    // Methodes applicables aux unites

    public abstract void seDeplacer(TypeBatiment type);

    //methode à surcharger selon la classe (artisan : confection outils/ villageois : collecter ressources /
    // soldat : partir en mission / eclaireurs : exploration)
    public abstract void travailler();


    public abstract void seReposer();
}

