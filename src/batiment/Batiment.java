package batiment;

import USMB.USMB;
import logs.ENTRERSORTIE;
import logs.Log;
import personnes.Badge;
import personnes.Personne;

import java.util.ArrayList;

public class Batiment {

    private String nom;
    private ArrayList<Badge> badgesOuvrantBatiment = new ArrayList<>();
    private ArrayList<Personne> personnesDansBatiments = new ArrayList<>();
    private Porte porte;

    public Batiment(String nom) {
        this.nom = nom;
        porte = new Porte(this);
    }

    public boolean verificationBadge(Badge badge){
        for (Badge badgeOuvrant: badgesOuvrantBatiment) {
            if(badgeOuvrant.equals(badge)){
                return true;
            }
        }

        return false;
    }

    public ArrayList<Badge> getBadgesOuvrantBatiment() {
        return badgesOuvrantBatiment;
    }
    public void setBadgesOuvrantBatiment(ArrayList<Badge> badgesOuvrantBatiment) {
        this.badgesOuvrantBatiment = badgesOuvrantBatiment;
    }
    public ArrayList<Personne> getPersonnesDansBatiments() {
        return personnesDansBatiments;
    }
    public void setPersonnesDansBatiments(ArrayList<Personne> personnesDansBatiments) {
        this.personnesDansBatiments = personnesDansBatiments;
    }
    public Porte getPorte() {
        return porte;
    }
    public void setPorte(Porte porte) {
        this.porte = porte;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void accepterPersonne(Personne personne) {
        USMB.logs.add(new Log(personne.getName(),personne.getBadge().getId(),nom, ENTRERSORTIE.ENTRER));
        personnesDansBatiments.add(personne);
        personne.accepterEntrer();
    }


    public void sortiePersonne(Personne personne){
        USMB.logs.add(new Log(personne.getName(),personne.getBadge().getId(),nom, ENTRERSORTIE.SORTIE));
        personnesDansBatiments.remove(personne);
        personne.accepterSortie();
    }
}
