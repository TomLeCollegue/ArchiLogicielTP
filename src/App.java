import USMB.USMB;

public class App {


    public static void main(String[] args) {

        USMB usmb = new USMB();
        Thread t = new Thread() {
            public void run() {
                try {
                    usmb.getPersonnes().get(1).tenterEntree(usmb.getBatiments().get(0));
                    sleep(2000);
                    usmb.getPersonnes().get(0).tenterEntree(usmb.getBatiments().get(0));


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        
    }
}
