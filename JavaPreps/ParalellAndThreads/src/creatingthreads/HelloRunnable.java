package creatingthreads;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " "
         + " a thread created by implementing a Runnable Interface");
    }
}
