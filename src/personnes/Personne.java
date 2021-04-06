package personnes;

public class Personne {

    private int id;
    private String name;
    private TYPE type;
    private Badge badge;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
    public Badge getBadge() {
        return badge;
    }
    public void setBadge(Badge badge) {
        this.badge = badge;
    }


    public void refuserEntrer() {

        System.out.println( name + " s'est fait jeter du batiment, il ne peut pas rentrer");
    }

    public void accepterEntrer() {
        System.out.println( name + " est entré dans le batiment");
    }

    public void accepterSortie() {
        System.out.println( name + " est sorti du batiment");
    }

    public Personne(int id, String name, TYPE type, Badge badge) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.badge = badge;
    }
}

