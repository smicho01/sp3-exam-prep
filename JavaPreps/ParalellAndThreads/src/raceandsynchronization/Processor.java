package raceandsynchronization;

import java.util.Scanner;

public class Processor {

    public void produce(String name) throws InterruptedException {
        synchronized (this) {
            System.out.println("Produce " + name + " thread is running ...");
            wait();
            System.out.println("!!! Produce " + name + " thread was resumed !!!");
        }
    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000); // just wait so produce can start first
        synchronized (this) {
            System.out.println("Press ENTER to continue (call notify()) : ");
            scanner.nextLine();
            System.out.println("ENTER key was pressed");
            // notify(); // will notify just 1 thread. Be careful ! 2 Threads are on lock
            notifyAll(); // will notify all threads
            System.out.println("Finishing consume ... slowly ... Please wait ...");
            Thread.sleep(4000);
        }
    }
}
