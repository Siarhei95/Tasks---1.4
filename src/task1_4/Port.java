package task1_4;
import java.util.ArrayList;
import java.util.List;

public class Port {
    private int dockQty;
    private int containersCapacity;
    private int currentContainersQty;

    List<Thread> ships = new ArrayList<>();

    public Port(int dockQty, int containersCapacity, int currentContainersQty) {
        this.dockQty = dockQty;
        this.containersCapacity = containersCapacity;
        this.currentContainersQty = currentContainersQty;
    }

    public int getContainersCapacity() {
        return containersCapacity;
    }

    public int getCurrentContainersQty() {
        return currentContainersQty;
    }

    public void addContainer() {
        currentContainersQty++;
    }
    public void getConatiner() {
        currentContainersQty--;
    }


    public synchronized void askPermission(){   //разбирал по примеру, но не совсем понятно как все связать во единое
        ships.add(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + " has received permission");
        dockQty--;
    }
}
