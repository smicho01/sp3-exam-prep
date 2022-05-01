package creatingthreads;

public class Main {

    public static void main(String[] args) {

        // Create thread using class that implements runnable
        (new Thread(new HelloRunnable())).start();

        // Create thread using class that extends Thread
        (new HelloThread()).start();

        // Create a runnable object
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // Do some work here...
                System.out.println("Hello from " + Thread.currentThread().getName() + " " +
                        "Runnable that does not use Lambda");
            }
        };

        // Create another runnable but using lambda
        Runnable r2 = () -> System.out.println("Hello from " + Thread.currentThread().getName() + " "
            + "Runnable that DOES use Lambda");

        Thread t1 = new Thread(r1, "Thread t1 no LAMBDA");
        t1.start();

        Thread t2 = new Thread(r2, "Thread t1 with LAMBDA");
        t2.start();
    }
}
