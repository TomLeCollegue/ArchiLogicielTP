package USMB;

import batiment.Batiment;
import logs.Log;
import personnes.Badge;
import personnes.Personne;
import personnes.TYPE;

import java.util.ArrayList;

public class USMB {

    private ArrayList<Batiment> batiments = new ArrayList<Batiment>();
    private ArrayList<Badge> badges = new ArrayList<Badge>();
    private ArrayList<Personne> personnes  = new ArrayList<Personne>();


    public static ArrayList<Log> logs = new ArrayList<>();

    public ArrayList<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(ArrayList<Batiment> batiments) {
        this.batiments = batiments;
    }

    public ArrayList<Badge> getBadges() {
        return badges;
    }

    public void setBadges(ArrayList<Badge> badges) {
        this.badges = badges;
    }

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }


    public USMB() {
        FillArray();
    }

    public void FillArray(){
        batiments.add(new Batiment("bibliotheque"));
        batiments.add(new Batiment("maurienne"));
        batiments.add(new Batiment("4a canton"));
        batiments.add(new Batiment("Nivolet"));

        badges.add(new Badge());
        badges.add(new Badge());
        badges.add(new Badge());
        badges.add(new Badge());
        badges.add(new Badge());

        personnes.add(new Personne(0,"Kubasik Tom", TYPE.ETUDIANT, badges.get(0)));
        personnes.add(new Personne(1,"Bollon Hugo", TYPE.ETUDIANT, badges.get(1)));
        personnes.add(new Personne(2,"Telisson David", TYPE.PROFESSEUR, badges.get(2)));
        personnes.add(new Personne(3,"Wagner Isabelle", TYPE.PERSONNEL_ADMINISTRATIF, badges.get(3)));
        personnes.add(new Personne(4,"Hersemeule Hugo", TYPE.ETUDIANT, badges.get(4)));

        batiments.get(0).getBadgesOuvrantBatiment().add(badges.get(0));
        batiments.get(0).getBadgesOuvrantBatiment().add(badges.get(1));
        batiments.get(0).getBadgesOuvrantBatiment().add(badges.get(2));

        batiments.get(1).getBadgesOuvrantBatiment().add(badges.get(2));
        batiments.get(1).getBadgesOuvrantBatiment().add(badges.get(3));

        batiments.get(2).getBadgesOuvrantBatiment().add(badges.get(3));
        batiments.get(2).getBadgesOuvrantBatiment().add(badges.get(4));

        batiments.get(3).getBadgesOuvrantBatiment().add(badges.get(0));
        batiments.get(3).getBadgesOuvrantBatiment().add(badges.get(1));
        batiments.get(3).getBadgesOuvrantBatiment().add(badges.get(2));




    }

}
