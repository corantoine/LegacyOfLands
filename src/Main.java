import java.lang.reflect.Type;

import model.Quetes;
import model.batiments.Atelier;
import model.batiments.Batiments;
import model.batiments.Caserne;
import model.Commerce;
import model.batiments.Ferme;
import model.batiments.Maison;
import model.batiments.MurDeDefense;
import model.batiments.TypeBatiment;
import model.ressources.TypeRessources;
import model.unites.Artisan;
import model.unites.Chef;
import model.unites.Eclaireur;
import model.unites.Soldat;
import model.unites.Unites;
import model.unites.Villageois;

public class Main {
    public static void main(String[] args) {

                                             //CREATION UNITES
        Unites eclaireur = new Eclaireur("Marie");
        Unites soldat = new Soldat("Thibault");
        Unites artisan = new Artisan("Morgan");
        Unites villageois = new Villageois("Soumaya");
        Chef chef = new Chef("Charlotte");
        chef.buff(eclaireur);
        chef.buff(soldat);


                                             // CONSTRUCTION BATIMENTS
        Batiments atelier = new Atelier();
        atelier.construire();

        Batiments caserne = new Caserne();
        caserne.construire();

        Batiments ferme = new Ferme();
        ferme.construire();

        Batiments maison = new Maison();
        maison.construire();

        Batiments murDeDefense = new MurDeDefense();
        murDeDefense.construire();


                                            //CREATION QUETES
        Quetes quete1 = new Quetes(1, "\"Promenons nous dans les bois...\"", "Récolter 100 unités de bois", "150 unités de bois et 10 d'or", eclaireur);
        quete1.afficheDetailsQuetes();


                                          // DEPLACEMENT UNITES

        soldat.seDeplacer(TypeBatiment.CASERNE);
        artisan.seDeplacer(TypeBatiment.MAISON);
        artisan.seDeplacer(TypeBatiment.ATELIER);
//        artisan.seDeplacer(TypeBatiment.CASERNE);
        villageois.seDeplacer(TypeBatiment.MAISON);
        eclaireur.seDeplacer(TypeBatiment.TERRESINCONNUES);



                                        //ACTIONS UNITES
        soldat.travailler();
        eclaireur.travailler();
        artisan.travailler();
        artisan.seReposer();
        ((Villageois)villageois).collecter(TypeRessources.FER);
        ((Villageois)villageois).collecter(TypeRessources.OR);


                                        //ACTIONS BATIMENTS
        Batiments commerce = new Commerce();

        atelier.actionDuBatiment();
        ferme.actionDuBatiment();
        caserne.actionDuBatiment();

        commerce.actionDuBatiment();

        commerce.actionDuBatiment();

    }
}