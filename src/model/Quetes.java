package model;

import model.unites.Unites;

public class Quetes {
    private int idDeLaQuete;
    private String nomDeLaQuete;
    private String descriptionDeLaQuete;
    private String recompenseDeQuete;

    private Unites uniteAssignee;

    public Quetes(int idDeLaQuete, String nomDeLaQuete, String descriptionDeLaQuete, String recompenseDeQuete, Unites uniteAssignee) {
        this.idDeLaQuete = idDeLaQuete;
        this.nomDeLaQuete = nomDeLaQuete;
        this.descriptionDeLaQuete = descriptionDeLaQuete;
        this.recompenseDeQuete = recompenseDeQuete;

    }

    public void afficheDetailsQuetes(){
        System.out.println(String.format("Nom de la quête : %s, description de la quête : %s. Lorsque vous aurez complété cette quête, vous recevrez %s", nomDeLaQuete, descriptionDeLaQuete, recompenseDeQuete));
    }

    //TODO méthode accepterQuete a faire dans Villageois ?
    public void accepterQuete(){
    }
}
