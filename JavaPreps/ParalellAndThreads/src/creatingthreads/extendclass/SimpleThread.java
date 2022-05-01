package creatingthreads.extendclass;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Started SimpleThread");
    }
}
