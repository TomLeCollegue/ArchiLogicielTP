package personnes;

import java.util.UUID;

public class Badge {

    private String id;

    public Badge() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
