package batiment;

import USMB.USMB;
import logs.ENTRERSORTIE;
import logs.Log;
import personnes.Badge;
import personnes.Personne;

public class Porte {

    private long timerPorte = 5000;
    private Batiment batiment;
    private int passageLaser = 0;
    private boolean estOuverte = false;

    public Porte(Batiment batiment) {
        this.batiment = batiment;
    }

    public void TentativeEntrerBatiment(Personne personne){
        if(estOuverte){
            PassageLaser(personne);
        }
        else{
            VerifEntrerDansBatiment(personne);
        }


    }

    public void VerifEntrerDansBatiment(Personne personne){
        Badge badge = personne.getBadge();

        if(batiment.verificationBadge(badge)) {
            chronoPorte();
            TentativeEntrerBatiment(personne);
        }
        else{
            personne.refuserEntrer();
        }
    }

    private void chronoPorte() {
        estOuverte = true;
        System.out.println("La porte est ouverte");
        passageLaser = 0;

        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(timerPorte);
                    estOuverte = false;
                    System.out.println("la porte est fermé après "+ timerPorte / 1000 + " secondes");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();

    }

    private void PassageLaser(Personne personne) {
        if(passageLaser >= 1){
            lancerAlarme(personne);
        }
        else{
            passageLaser += 1;
            entrerDansBatiment(personne);
        }
    }

    private void entrerDansBatiment(Personne personne) {
        batiment.accepterPersonne(personne);
    }

    private void sortieBatiment(Personne personne){
        batiment.sortiePersonne(personne);
    }

    private void lancerAlarme(Personne personne) {

        personne.refuserEntrer();

        System.out.println("ALARME");
        System.out.println("ALARME");
        System.out.println("ALARME");
        System.out.println("ALARME");
        System.out.println("ALARME");

        USMB.logs.add(new Log("","",batiment.getNom(), ENTRERSORTIE.ALLARME));
    }


}
