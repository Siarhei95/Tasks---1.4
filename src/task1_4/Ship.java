package task1_4;

public class Ship extends Thread {
    int containersToTake;
    int containersToLeave;
    Port port;

    int currentContainersQty;


    public Ship(String name, int containersToTake, int containersToLeave, Port port) {
        super(name);
        this.containersToTake = containersToTake;
        this.containersToLeave = containersToLeave;
        this.port = port;
        currentContainersQty = containersToLeave;
        start();
    }

    @Override
    public void run() {
        boolean isChanged = false;

            while (true) {
                if (!isChanged) {
                    port.askPermission();
                }

                isChanged = false;
                if (containersToLeave != 0 && containersToTake != 0) {
                    containersToTake--;
                    containersToLeave--;
                    isChanged = true;
                }
            }
        }

}
