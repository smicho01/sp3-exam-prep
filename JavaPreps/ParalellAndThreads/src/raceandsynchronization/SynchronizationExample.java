package raceandsynchronization;

public class SynchronizationExample {

    static int counter = 1;

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println( "Thread " + Thread.currentThread().getName() + " ID value : " + getId());
        };

        Thread one = new Thread(r1, "one");
        one.start();
        Thread two = new Thread(r1, "two");
        two.start();
    }

    private static synchronized int getId() {
        return counter++;
    }
}
