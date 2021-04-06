package logs;

public class Log {
    private String nomPersonne;
    private String idBadge;
    private String batiment;
    private ENTRERSORTIE entrersortie;

    public Log(String nomPersonne, String idBadge, String batiment, ENTRERSORTIE entrersortie) {
        this.nomPersonne = nomPersonne;
        this.idBadge = idBadge;
        this.batiment = batiment;
        this.entrersortie = entrersortie;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getIdBadge() {
        return idBadge;
    }

    public void setIdBadge(String idBadge) {
        this.idBadge = idBadge;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        batiment = batiment;
    }

    public ENTRERSORTIE getEntrersortie() {
        return entrersortie;
    }

    public void setEntrersortie(ENTRERSORTIE entrersortie) {
        this.entrersortie = entrersortie;
    }
}


