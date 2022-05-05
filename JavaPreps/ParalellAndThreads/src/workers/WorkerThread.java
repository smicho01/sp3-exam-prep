package workers;

public class WorkerThread implements Runnable {
    private final String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        workToBeDone();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void workToBeDone() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
